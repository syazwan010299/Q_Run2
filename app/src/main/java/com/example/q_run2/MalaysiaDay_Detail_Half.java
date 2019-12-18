package com.example.q_run2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MalaysiaDay_Detail_Half extends AppCompatActivity {

    ImageButton previous;
    Button purchases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malaysia_day__detail__half);
        previous = (ImageButton) findViewById(R.id.previous);
        purchases = (Button) findViewById(R.id.purchase);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MalaysiaDay_Detail_Half.this,Homepage_Runner.class));
            }
        });
    }
}
