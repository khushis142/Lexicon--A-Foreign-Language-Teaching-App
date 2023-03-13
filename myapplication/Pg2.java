package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pg2 extends AppCompatActivity {
    int clicked=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg2);
        Button op1 =(Button) findViewById(R.id.q2op1);
        Button op2 =(Button) findViewById(R.id.q2op2);
        Button op3 =(Button) findViewById(R.id.q2op3);
        Button op4 =(Button) findViewById(R.id.q2op4);
        Button nxt =(Button) findViewById(R.id.next);

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op1.setBackgroundColor(Color.RED);
                op2.setBackgroundColor(Color.GREEN);
                op3.setBackgroundColor(Color.parseColor("#6200EE"));
                op4.setBackgroundColor(Color.parseColor("#6200EE"));
                clicked++;
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op2.setBackgroundColor(Color.GREEN);
                op1.setBackgroundColor(Color.parseColor("#6200EE"));
                op4.setBackgroundColor(Color.parseColor("#6200EE"));
                op3.setBackgroundColor(Color.parseColor("#6200EE"));
                clicked++;
                if(clicked==1)
                    result.score++;
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op3.setBackgroundColor(Color.RED);
                op2.setBackgroundColor(Color.GREEN);
                op1.setBackgroundColor(Color.parseColor("#6200EE"));
                op4.setBackgroundColor(Color.parseColor("#6200EE"));
                clicked++;
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op4.setBackgroundColor(Color.RED);
                op2.setBackgroundColor(Color.GREEN);
                op1.setBackgroundColor(Color.parseColor("#6200EE"));
                op3.setBackgroundColor(Color.parseColor("#6200EE"));
                clicked++;
            }
        });
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked>0){
                    Intent i =new Intent(Pg2.this,Pg3.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(Pg2.this,"कृपया उत्तर चुनें",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
