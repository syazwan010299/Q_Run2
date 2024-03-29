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

public class category extends AppCompatActivity {

    ImageButton HalfMarathon,walkathon,fullmarathon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        HalfMarathon = findViewById(R.id.halfmarathon);
        walkathon = findViewById(R.id.walkathon);
        fullmarathon = findViewById(R.id.fullmarathon);

        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navigationListener);

        walkathon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(category.this, com.example.q_run2.walkathon.class));
            }
        });

        HalfMarathon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(category.this, com.example.q_run2.HalfMarathon.class));
            }
        });

        fullmarathon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(category.this,FullMarathon.class));
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
                            startActivity(new Intent(category.this,Homepage_Admin.class));
                            break;
                        case R.id.action_category:
                            startActivity(new Intent(category.this,category.class));
                            break;
                        case R.id.action_timer:
                            startActivity(new Intent(category.this,stopwatch.class));
                            break;
                        case R.id.action_profile:
                            startActivity(new Intent(category.this,profile.class));
                            break;
                    }
                    return true;
                }
            };
}
