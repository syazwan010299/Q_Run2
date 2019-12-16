package com.example.q_run2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Sign_Up extends AppCompatActivity {

    EditText name, identityNum,phoneNum, email,passwordIn,passwordRepeat;
    Button signup;
    TextView titleRegister,signIn;
    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up);
        //signIn = (TextView) findViewById(R.id.SignIn);
        name = (EditText) findViewById(R.id.name);
        identityNum = (EditText) findViewById(R.id.identityNum);
        phoneNum = (EditText) findViewById(R.id.phoneNum);
        email = (EditText) findViewById(R.id.email);
        passwordIn = (EditText) findViewById(R.id.passwordIn);
        passwordRepeat = (EditText) findViewById(R.id.passwordRepeat);
        signup = (Button) findViewById(R.id.signup);
        titleRegister = (TextView) findViewById(R.id.titleRegister);
        mFirebaseAuth = FirebaseAuth.getInstance();
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names = name.getText().toString().trim();
                String IC = identityNum.getText().toString().trim();
                String phone = phoneNum.getText().toString().trim();
                String emailauth = email.getText().toString();
                String password = passwordIn.getText().toString();
                String password2 = passwordRepeat.getText().toString();
                if (names.isEmpty()){
                    name.setError("Please insert your name");
                    name.requestFocus();
                }
                else if (IC.isEmpty()){
                    identityNum.setError("Please insert your ic number");
                    identityNum.requestFocus();
                }
                else if (phone.isEmpty()){
                    phoneNum.setError("Please insert your ic number");
                    phoneNum.requestFocus();
                }
                else if (emailauth.isEmpty()){
                    email.setError("Please insert your email");
                    email.requestFocus();
                }
                else if (password.isEmpty()){
                    passwordIn.setError("Please put your password");
                    passwordIn.requestFocus();
                }
                else if (password2.isEmpty()){
                    passwordRepeat.setError("Please insert again your password");
                    passwordRepeat.requestFocus();
                }
                else if (!(password.equals(password2))){
                    passwordRepeat.setError("Please insert the same password as the above");
                    passwordRepeat.requestFocus();
                }/*
                else if (names.isEmpty() && IC.isEmpty() && phone.isEmpty() && emailauth.isEmpty() && password.isEmpty() && password2.isEmpty()) {
                    Toast.makeText(Sign_Up.this, "Fields are Empty", Toast.LENGTH_SHORT).show();
                }*/
                else {
                    mFirebaseAuth.createUserWithEmailAndPassword(emailauth,password).addOnCompleteListener(Sign_Up.this, new
                            OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()){
                                        startActivity(new Intent(Sign_Up.this, HomeActivity.class));
                                    }else{
                                        Toast.makeText(Sign_Up.this, "Sign Up Unsuccessful, Please Try Again", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }

            }
        });

        /*
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Sign_Up.this, Log_In.class);
                startActivity(a);
            }
        });
        */

    }
}
