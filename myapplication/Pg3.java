package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Pg3 extends AppCompatActivity {
    int clicked=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg3);
        ImageButton car = (ImageButton) findViewById(R.id.car);
        ImageButton house = (ImageButton) findViewById(R.id.house);
        ImageButton tea = (ImageButton) findViewById(R.id.tea);
        ImageButton cold = (ImageButton) findViewById(R.id.cold);
        Button next = (Button) findViewById(R.id.next2);
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car.setBackgroundColor(Color.GREEN);
                house.setBackgroundColor(Color.WHITE);
                tea.setBackgroundColor(Color.WHITE);
                cold.setBackgroundColor(Color.WHITE);
                clicked++;
                if(clicked==1)
                    result.score++;
            }
        });
        house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car.setBackgroundColor(Color.GREEN);
                house.setBackgroundColor(Color.RED);
                tea.setBackgroundColor(Color.WHITE);
                cold.setBackgroundColor(Color.WHITE);
                clicked++;
            }
        });
        tea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car.setBackgroundColor(Color.GREEN);
                tea.setBackgroundColor(Color.RED);
                house.setBackgroundColor(Color.WHITE);
                cold.setBackgroundColor(Color.WHITE);
                clicked++;
            }
        });
        cold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                car.setBackgroundColor(Color.GREEN);
                cold.setBackgroundColor(Color.RED);
                house.setBackgroundColor(Color.WHITE);
                tea.setBackgroundColor(Color.WHITE);
                clicked++;
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked>0){
                    Intent i =new Intent(Pg3.this, Pg4.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(Pg3.this,"कृपया उत्तर चुनें",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}