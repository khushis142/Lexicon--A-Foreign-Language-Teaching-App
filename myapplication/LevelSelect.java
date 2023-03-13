package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);
        Button GoToHomepage=(Button) findViewById(R.id.GoToHomepage);
        Button GoToHomepage2=(Button) findViewById(R.id.GoToHomepage2);
        GoToHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LevelSelect.this, Homepage.class);
                startActivity(i);
            }
        });
        GoToHomepage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LevelSelect.this, Homepage.class);
                startActivity(i);
            }
        });
    }
}