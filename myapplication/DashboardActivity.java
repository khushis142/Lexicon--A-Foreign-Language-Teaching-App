package com.example.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class DashboardActivity extends AppCompatActivity {
    String EmailHolder;
    TextView Uname_display;
    Button LogOUT,Start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Uname_display = (TextView)findViewById(R.id.textView1);
        LogOUT = (Button)findViewById(R.id.button1);
        Start = (Button)findViewById(R.id.startLearning);
        Intent intent = getIntent();
        // Receiving User Email Send By MainActivity.
        EmailHolder = intent.getStringExtra(MainActivityLogin.UserName);
        // Setting up received email to TextView.
        Uname_display.setText(Uname_display.getText().toString()+ EmailHolder);
        // Adding click listener to Log Out button.
        LogOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Finishing current DashBoard activity on button click.
                Intent i =new Intent(DashboardActivity.this, MainActivityLogin.class);
                startActivity(i);
                Toast.makeText(DashboardActivity.this,"Log Out Successful", Toast.LENGTH_LONG).show();
            }
        });
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Finishing current DashBoard activity on button click.
                Intent i =new Intent(DashboardActivity.this, LanguageSelect.class);
                startActivity(i);
                Toast.makeText(DashboardActivity.this,"Learning Is For Life!", Toast.LENGTH_LONG).show();
            }
        });
    }
}




/*package com.example.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class DashboardActivity extends AppCompatActivity {
    String EmailHolder;
    TextView Email;
    Button LogOUT,Start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Email = (TextView)findViewById(R.id.textView1);
        LogOUT = (Button)findViewById(R.id.button1);
        Start = (Button)findViewById(R.id.startLearning);
        Intent intent = getIntent();
        // Receiving User Email Send By MainActivity.
        EmailHolder = intent.getStringExtra(MainActivityLogin.UserEmail);
        // Setting up received email to TextView.
        Email.setText(Email.getText().toString()+ EmailHolder);
        // Adding click listener to Log Out button.
        LogOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Finishing current DashBoard activity on button click.
                Intent i =new Intent(DashboardActivity.this, MainActivityLogin.class);
                startActivity(i);
                Toast.makeText(DashboardActivity.this,"Log Out Successful", Toast.LENGTH_LONG).show();
            }
        });
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Finishing current DashBoard activity on button click.
                Intent i =new Intent(DashboardActivity.this, LanguageSelect.class);
                startActivity(i);
                Toast.makeText(DashboardActivity.this,"Learning Is For Life!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
*/