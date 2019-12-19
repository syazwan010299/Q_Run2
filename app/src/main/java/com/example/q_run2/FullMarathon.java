package com.example.q_run2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FullMarathon extends AppCompatActivity {

    ImageButton previous,marathon1,marathon2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_marathon);
        previous = findViewById(R.id.previous);
        marathon1 = findViewById(R.id.marathon1);
        marathon2 = findViewById(R.id.marathon2);

        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navigationListener);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FullMarathon.super.onBackPressed();
            }
        });

        marathon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FullMarathon.this,GreatMalaysiaRun_detail.class));
            }
        });

        marathon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FullMarathon.this,EcoTrail_detail.class));
            }
        });
    }//end of the OnCreate

    //doing method for the bottom navigation
    private BottomNavigationView.OnNavigationItemSelectedListener navigationListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()){
                        case R.id.action_home:
                            startActivity(new Intent(FullMarathon.this,Homepage_Admin.class));
                            break;
                        case R.id.action_category:
                            startActivity(new Intent(FullMarathon.this,category.class));
                            break;
                        case R.id.action_timer:
                            startActivity(new Intent(FullMarathon.this,stopwatch.class));
                            break;
                        case R.id.action_profile:
                            startActivity(new Intent(FullMarathon.this,profile.class));
                            break;
                    }
                    return true;
                }
            };
}
