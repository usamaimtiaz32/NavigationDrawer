package com.snovia.navigation_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class InsertCommentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_comment);
        Toast.makeText(getApplicationContext(),"Insert comment is Clicked",Toast.LENGTH_LONG).show();

    }
}