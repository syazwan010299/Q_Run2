package com.example.q_run2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Notification extends AppCompatActivity {

    ImageButton reverse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        reverse = (ImageButton)findViewById(R.id.previous);
        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navigationListener);
        TextView textView = (TextView) findViewById(R.id.textView3);

        String message = getIntent().getStringExtra("message");
        textView.setText(message);

        reverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notification.super.onBackPressed();
            }
        });
    }
    //doing method for the bottom navigation
    private BottomNavigationView.OnNavigationItemSelectedListener navigationListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()){
                        case R.id.action_home:
                            startActivity(new Intent(Notification.this,Homepage_Runner.class));
                            break;
                        case R.id.action_category:
                            startActivity(new Intent(Notification.this,category.class));
                            break;
                        case R.id.action_timer:
                            startActivity(new Intent(Notification.this,stopwatch.class));
                            break;
                        case R.id.action_profile:
                            startActivity(new Intent(Notification.this,profile.class));
                            break;
                    }
                    return true;
                }
            };
}
