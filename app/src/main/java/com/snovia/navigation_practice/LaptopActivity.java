package com.snovia.navigation_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LaptopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);
        Toast.makeText(getApplicationContext(),"Laptop is Clicked",Toast.LENGTH_LONG).show();

    }
}