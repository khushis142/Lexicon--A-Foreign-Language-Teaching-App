package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void UserProfile(View v) {
        Intent i = new Intent(Homepage.this,UserProfile.class);
        //Toast.makeText(Homepage.this, "Go to user profile page.", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }

    public void TakeAQuiz(View v) {
        Intent i = new Intent(Homepage.this,Pg1.class);
        //Toast.makeText(Homepage.this, "Go to quiz.", Toast.LENGTH_SHORT).show();
        startActivity(i);

    }

    public void ViewStories(View v) {
        Intent i = new Intent(Homepage.this,Stories.class);
        //Toast.makeText(Homepage.this, "View Stories.", Toast.LENGTH_SHORT).show();
        startActivity(i);
    }

    public void LangSelect(View v){
        Intent i = new Intent(Homepage.this,LanguageSelect.class);
        startActivity(i);
    }
    public void logout(View v){
        Intent i = new Intent(Homepage.this,MainActivityLogin.class);
        startActivity(i);
    }
}