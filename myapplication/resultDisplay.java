package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class resultDisplay extends AppCompatActivity {
    String resString = String.valueOf(result.score)+"/4";
    Button tryagain,quit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_display);
        Button resultbtn=(Button) findViewById(R.id.resultbtn);
        resultbtn.setText(resString);
        tryagain=findViewById(R.id.tryagain);
        quit=findViewById(R.id.quit);
        tryagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(resultDisplay.this, Pg1.class);
                startActivity(i);
            }
        });
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(resultDisplay.this, Homepage.class);
                startActivity(i1);
            }
        });
    }


}