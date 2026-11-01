package com.firstapp.quarter3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.firstapp.quarter3.R;

public class Feature1_Santos_Cris
extends AppCompatActivity {
private Button button;

@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_feature1_santos_cris);
    button = (Button)
            findViewById(R.id.loginbutton);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openDashboardActivity();
        }
    });
}
public void openDashboardActivity() {
    Intent intent = new Intent(this, DashboardActivity.class);
    startActivity(intent);
}
}
