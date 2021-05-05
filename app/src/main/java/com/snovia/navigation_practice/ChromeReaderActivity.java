package com.snovia.navigation_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ChromeReaderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chrome_reader);
        Toast.makeText(getApplicationContext(),"Chrome reader is Clicked",Toast.LENGTH_LONG).show();

    }
}