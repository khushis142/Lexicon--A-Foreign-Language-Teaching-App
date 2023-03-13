package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Stories extends AppCompatActivity {

    ImageButton ibtn, narrator, mia1, mia2, jack1, jack2;
    Button yes, no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);

        ibtn = (ImageButton) (findViewById(R.id.gma2));
        MediaPlayer imageclick = MediaPlayer.create(this, R.raw.diyyy);
        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageclick.start();
            }

        });
//        imageclick.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            @Override
//            public void onCompletion(MediaPlayer mp) {
//                mp.release();
//            }
//        });


        narrator = (ImageButton) (findViewById(R.id.gma));
        MediaPlayer imageclick2 = MediaPlayer.create(this, R.raw.mihwbj);
        narrator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageclick2.start();
            }
        });

        mia1 = (ImageButton) (findViewById(R.id.gma3));
        MediaPlayer imageclick3 = MediaPlayer.create(this, R.raw.ohno);
        mia1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageclick3.start();
            }
        });

        jack1 = (ImageButton) (findViewById(R.id.gma4));
        MediaPlayer imageclick4 = MediaPlayer.create(this, R.raw.aygttm);
        jack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageclick4.start();
            }
        });

        mia2 = (ImageButton) (findViewById(R.id.gma5));
        MediaPlayer imageclick5 = MediaPlayer.create(this, R.raw.yes);
        mia2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageclick5.start();
            }
        });

        jack2 = (ImageButton) (findViewById(R.id.gma6));
        MediaPlayer imageclick6 = MediaPlayer.create(this, R.raw.ah);
        jack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageclick6.start();

                TextView textView9 = findViewById(R.id.textView9);
                textView9.setVisibility(View.VISIBLE);
                yes = findViewById(R.id.button);
                yes.setVisibility(View.VISIBLE);

                no = findViewById(R.id.button2);
                no.setVisibility(View.VISIBLE);

            }
        });

        yes = (Button) (findViewById(R.id.button));
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yes.setBackgroundColor(Color.GREEN);
                Toast.makeText(Stories.this, "Correct answer!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Stories.this, Homepage.class);
                startActivity(i);
            }
        });

        no = (Button) (findViewById(R.id.button2));
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Stories.this, "Wrong answer!", Toast.LENGTH_SHORT).show();
                no.setBackgroundColor(Color.RED);
            }
        });


    }

}