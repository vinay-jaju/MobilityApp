package com.deloitte.vjaju.mobilityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername=findViewById(R.id.etUsername);
        etPassword=findViewById(R.id.etPass);
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((etUsername.getText().toString().toLowerCase().equals("abc")) && etPassword.getText().toString().equals("abc")) {

                    startActivity(new Intent(MainActivity.this,Dashboard.class));
                }
                else{
                    Toast.makeText(MainActivity.this, "Wrong credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
