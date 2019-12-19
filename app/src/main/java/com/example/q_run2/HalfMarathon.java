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


public class HalfMarathon extends AppCompatActivity {

    ImageButton previous,marathon1,marathon2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_half_marathon);
        previous = findViewById(R.id.previous);
        marathon1 = findViewById(R.id.marathon1);
        marathon2 = findViewById(R.id.marathon2);

        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navigationListener);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HalfMarathon.super.onBackPressed();
            }
        });

        marathon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HalfMarathon.this,MalaysiaDay_Detail_Half.class));
            }
        });

        marathon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HalfMarathon.this,EcoTrail_detail.class));
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
                            startActivity(new Intent(HalfMarathon.this,Homepage_Admin.class));
                            break;
                        case R.id.action_category:
                            startActivity(new Intent(HalfMarathon.this,category.class));
                            break;
                        case R.id.action_timer:
                            startActivity(new Intent(HalfMarathon.this,stopwatch.class));
                            break;
                        case R.id.action_profile:
                            startActivity(new Intent(HalfMarathon.this,profile.class));
                            break;
                    }
                    return true;
                }
            };
}
