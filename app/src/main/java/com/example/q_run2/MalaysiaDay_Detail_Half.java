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

public class MalaysiaDay_Detail_Half extends AppCompatActivity {

    ImageButton previous;
    Button purchases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malaysia_day__detail__half);
        previous = (ImageButton) findViewById(R.id.previous);
        purchases = (Button) findViewById(R.id.purchase);
        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navigationListener);


        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MalaysiaDay_Detail_Half.super.onBackPressed();
            }
        });
        purchases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MalaysiaDay_Detail_Half.this, com.example.q_run2.purchases.class));
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
                            startActivity(new Intent(MalaysiaDay_Detail_Half.this,Homepage_Admin.class));
                            break;
                        case R.id.action_category:
                            startActivity(new Intent(MalaysiaDay_Detail_Half.this,category.class));
                            break;
                        case R.id.action_timer:
                            startActivity(new Intent(MalaysiaDay_Detail_Half.this,stopwatch.class));
                            break;
                        case R.id.action_profile:
                            startActivity(new Intent(MalaysiaDay_Detail_Half.this,profile.class));
                            break;
                    }
                    return true;
                }
            };
}
