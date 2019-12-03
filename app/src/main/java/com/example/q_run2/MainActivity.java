package com.example.q_run2;

import com.example.q_run2.insertrunnername;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    insertrunnername Insert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Insert = new insertrunnername();
    }
}
