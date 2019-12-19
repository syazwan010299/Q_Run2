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

public class walkathon extends AppCompatActivity {

    ImageButton previous,marathon1,marathon2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkathon);
        previous = findViewById(R.id.previous);
        marathon1 = findViewById(R.id.marathon1);
        marathon2 = findViewById(R.id.marathon2);

        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navigationListener);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               walkathon.super.onBackPressed();
            }
        });

        marathon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(walkathon.this,MalaysiaDay_Detail_Half.class));
            }
        });

        marathon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(walkathon.this,She_Run.class));
            }
        });

    }// end of the OnCreate

    //doing method for the bottom navigation
    private BottomNavigationView.OnNavigationItemSelectedListener navigationListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()){
                        case R.id.action_home:
                            startActivity(new Intent(walkathon.this,Homepage_Admin.class));
                            break;
                        case R.id.action_category:
                            startActivity(new Intent(walkathon.this,category.class));
                            break;
                        case R.id.action_timer:
                            startActivity(new Intent(walkathon.this,stopwatch.class));
                            break;
                        case R.id.action_profile:
                            startActivity(new Intent(walkathon.this,profile.class));
                            break;
                    }
                    return true;
                }
            };
}
