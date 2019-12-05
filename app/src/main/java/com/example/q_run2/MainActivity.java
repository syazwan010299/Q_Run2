package com.example.q_run2;

import com.example.q_run2.insertrunnername;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    insertrunnername Insert;
    Button testing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Insert = new insertrunnername();
        testing = (Button) findViewById(R.id.button1);
    }
        public void goToActivity2(View view){
            Intent intent = new Intent(this, insertrunnername.class);
            startActivity(intent);


    }
}
