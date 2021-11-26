package com.example.bmianalyzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registration extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }
    public void openLogin(View view){
        Intent x = new Intent(Registration.this, Login.class);
        startActivity(x);
    }
    public void openCompleteInformation(View view){
        Intent x = new Intent(Registration.this,CompleteInformation.class);
        startActivity(x);
    }
}