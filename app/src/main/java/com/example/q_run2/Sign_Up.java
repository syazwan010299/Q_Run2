package com.example.q_run2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Sign_Up extends AppCompatActivity {

    EditText name, identityNum,phoneNum, email,passwordIn,passwordRepeat;
    Button signup;
    TextView titleRegister;
    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);
        
    }
}
