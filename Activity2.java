package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView text5, text6, text7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        text5 = findViewById(R.id.TEXT1);
        text6 = findViewById(R.id.TEXT2);
        text7 = findViewById(R.id.TEXT3);

        Intent intent=getIntent();
        String First=intent.getStringExtra("First_name");
        String middle=intent.getStringExtra("middle_name");
        String last=intent.getStringExtra("last_name");


        text5.setText(""+First);
        text6.setText(""+middle);
        text7.setText(""+last);


    }

        }

