package com.firstapp.quarter3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Feature1_Santos_Cris extends AppCompatActivity {
    private Button button;
    private TextView signuptest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature1_santos_cris);

        button = findViewById(R.id.loginbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDashboardActivity();
            }
        });

        signuptest = findViewById(R.id.signuptest);
        signuptest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignupActivity();
            }
        });
    }

    public void openDashboardActivity() {
        Intent intent = new Intent(this,Fontabla_Signup.class);
        startActivity(intent);
    }

    public void openSignupActivity() {
        Intent intent = new Intent(this, Fontabla_Signup.class);
        startActivity(intent);
    }
}


