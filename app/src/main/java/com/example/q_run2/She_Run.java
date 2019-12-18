package com.example.q_run2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class She_Run extends AppCompatActivity {

    ImageButton previous;
    Button purcha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_she__run);
        previous = findViewById(R.id.previous);
        purcha = findViewById(R.id.purchase);
        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navigationListener);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                She_Run.super.onBackPressed();
            }
        });

        purcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(She_Run.this,purchases.class));
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
                            startActivity(new Intent(She_Run.this,Homepage_Admin.class));
                            break;
                        case R.id.action_category:
                            startActivity(new Intent(She_Run.this,category.class));
                            break;
                        case R.id.action_timer:
                            startActivity(new Intent(She_Run.this,stopwatch.class));
                            break;
                        case R.id.action_profile:
                            startActivity(new Intent(She_Run.this,profile.class));
                            break;
                    }
                    return true;
                }
            };
}
