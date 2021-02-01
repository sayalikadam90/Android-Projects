package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {

    EditText edit1, edit2, edit3;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        edit1 = findViewById(R.id.Edittext5);
        edit2 = findViewById(R.id.Edittext6);
        edit3 = findViewById(R.id.Edittext7);


        btn1 = findViewById(R.id.Btn4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Activity1.this, Activity2.class);
                intent.putExtra("First_name", edit1.getText().toString().trim());
                intent.putExtra("middle_name", edit2.getText().toString().trim());
                intent.putExtra("last_name", edit3.getText().toString().trim());
                startActivity(intent);
            }
        });
    }
}