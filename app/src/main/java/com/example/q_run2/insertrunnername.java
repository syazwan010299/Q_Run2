package com.example.q_run2;

import com.example.q_run2.MainActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class insertrunnername extends AppCompatActivity {

    EditText runnername, idrunner, phonenumber, datetaken;
    Button save;
    DatabaseReference reff;
    RunnerData runnerData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insertrunnername);
        runnername = (EditText)findViewById(R.id.runnername);
        idrunner = (EditText) findViewById(R.id.idrunner);
        phonenumber = (EditText) findViewById(R.id.phonenumber);
        datetaken = (EditText) findViewById(R.id.datetaken);
        save = (Button) findViewById(R.id.save);
        runnerData = new RunnerData();
        reff = FirebaseDatabase.getInstance().getReference().child("RunnerData");

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runnerData.setRunnername(runnername.getText().toString().trim());
                runnerData.setIdrunner(idrunner.getText().toString().trim());
                runnerData.setPhonenumber(phonenumber.getText().toString().trim());
                runnerData.setDatetaken(datetaken.getText().toString().trim());
                reff.push().setValue(runnerData);
                Toast.makeText(insertrunnername.this,"data insert successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
