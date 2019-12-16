package com.example.q_run2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Homepage_Runner extends AppCompatActivity {

    ImageButton halfMalaysiaMarathon,ecotrail,greatmsia,she,halfMalaysia2,eco2,great2,she2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage__runner);
        halfMalaysiaMarathon = (ImageButton) findViewById(R.id.halfMsiamarathon);
        ecotrail = (ImageButton) findViewById(R.id.ecotrail);
        greatmsia = (ImageButton) findViewById(R.id.greatmsia);
        she = (ImageButton) findViewById(R.id.she);
        halfMalaysia2 = (ImageButton) findViewById(R.id.halfMsia2);
        eco2 = (ImageButton) findViewById(R.id.eco2);
        great2 = (ImageButton) findViewById(R.id.great2);
        she2 = (ImageButton) findViewById(R.id.she2);

        halfMalaysiaMarathon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage_Runner.this,MalaysiaDay_Detail_Half.class));
            }
        });
        ecotrail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage_Runner.this,EcoTrail_detail.class));
            }
        });
        greatmsia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage_Runner.this,GreatMalaysiaRun_detail.class));
            }
        });
        she.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage_Runner.this,She_Run.class));
            }
        });

        //scroll down
        halfMalaysia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage_Runner.this,MalaysiaDay_Detail_Half.class));
            }
        });
        eco2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage_Runner.this,EcoTrail_detail.class));
            }
        });
        great2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage_Runner.this,GreatMalaysiaRun_detail.class));
            }
        });
        she2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Homepage_Runner.this,She_Run.class));
            }
        });
    }//end of the onCreate
}
