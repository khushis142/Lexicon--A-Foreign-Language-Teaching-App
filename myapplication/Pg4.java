package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pg4 extends AppCompatActivity {
    Button meri,naam,pani,gadi,clear,check,next,answer;
    String answerString="",ansonce=" ";
    int clicked=0,attempt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg4);
        answer=findViewById(R.id.answerString);
        meri=findViewById(R.id.meri);
        naam=findViewById(R.id.naam);
        pani=findViewById(R.id.pani);
        gadi=findViewById(R.id.gaadi);
        clear=findViewById(R.id.clear);
        check=findViewById(R.id.check);
        next=findViewById(R.id.next3);


        meri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answerString.equals(""))
                {
                    answerString="मेरी";

                }

                else
                    answerString=answerString+" मेरी";

               answer.setText(answerString);
               ansonce=ansonce+"1";
               clicked++;
            }
        });
        naam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answerString.equals(""))
                {
                    answerString="नाम";

                }

                else
                    answerString=answerString+" नाम";

                answer.setText(answerString);
                clicked++;
            }
        });
        gadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answerString.equals(""))
                {
                    answerString="गाड़ी";

                }

                else
                    answerString=answerString+" गाड़ी";

                answer.setText(answerString);
                ansonce=ansonce+"2";
                clicked++;
            }
        });
        pani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answerString.equals(""))
                {
                    answerString="पानी";

                }

                else
                    answerString=answerString+" पानी";

                answer.setText(answerString);
                clicked++;
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answerString="";
                answer.setText(answerString);
                answer.setBackgroundColor(Color.parseColor("#6200EE"));
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked>0){
                    if(answerString.equals("मेरी गाड़ी")){
                        answer.setBackgroundColor(Color.GREEN);
                        Toast.makeText(Pg4.this,"सही उत्तर!",Toast.LENGTH_SHORT).show();
                        attempt++;
                        if(attempt==1 && ansonce.equals(" 12"))
                            result.score++;
                    }
                    else{
                        answer.setBackgroundColor(Color.RED);
                        Toast.makeText(Pg4.this,"गलत जवाब",Toast.LENGTH_SHORT).show();
                        attempt++;

                    }
                }
                else{
                    Toast.makeText(Pg4.this,"कृपया उत्तर चुनें",Toast.LENGTH_SHORT).show();
                }

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked>0){
                    Intent i =new Intent(Pg4.this,resultDisplay.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(Pg4.this,"कृपया उत्तर चुनें",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}