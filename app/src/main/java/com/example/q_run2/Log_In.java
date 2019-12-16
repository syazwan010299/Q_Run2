package com.example.q_run2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Log_In extends AppCompatActivity {

    EditText emailInput,passwordInput;
    Button login;
    TextView titleRegister,signUp;
    private FirebaseAuth mFirebaseAuth;

    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log__in);
        //signUp = (TextView) findViewById(R.id.SIGNUP);
        emailInput = (EditText) findViewById(R.id.emailInput);
        passwordInput = (EditText) findViewById(R.id.passwordInput);
        login = (Button) findViewById(R.id.login);
        titleRegister = (TextView) findViewById(R.id.titleRegister);
        mFirebaseAuth = FirebaseAuth.getInstance();

        mAuthStateListener = new FirebaseAuth.AuthStateListener() {

            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if (mFirebaseUser != null){
                    Toast.makeText(Log_In.this,"You are Logged In",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Log_In.this,Homepage_Runner.class);
                    startActivity(i);
                }else{
                    Toast.makeText(Log_In.this,"Error",Toast.LENGTH_SHORT).show();
                }

            }
        };
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();
                if (email.isEmpty()){
                    emailInput.setError("Please insert your name");
                    emailInput.requestFocus();
                }
                else if (password.isEmpty()){
                    passwordInput.setError("Please insert your ic number");
                    passwordInput.requestFocus();
                }
                else if (email.isEmpty() && password.isEmpty()) {
                    Toast.makeText(Log_In.this, "Fields are Empty", Toast.LENGTH_SHORT).show();
                }
                else if ( !(email.isEmpty() && password.isEmpty())){
                    mFirebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(Log_In.this,
                            new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (!task.isSuccessful()){
                                        Toast.makeText(Log_In.this, "Log In Error, Please Log In Again", Toast.LENGTH_SHORT).show();
                                    }else{
                                        Intent inttoHome = new Intent(Log_In.this,Homepage_Runner.class);
                                        startActivity(inttoHome);
                                    }
                                }
                            });
                }
                else{
                    Toast.makeText(Log_In.this, "Error Occurred", Toast.LENGTH_SHORT).show();
                }
            }
        });
        /*
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intSignUp = new Intent(Log_In.this,Sign_Up.class);
                startActivity(intSignUp);
            }
        });
        */

    }

    @Override
    protected void onStart(){
        super.onStart();
        //FirebaseUser currentUser = mFirebaseAuth.getCurrentUser();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }

}
