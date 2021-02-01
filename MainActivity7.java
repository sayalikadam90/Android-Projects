package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.ImageButton;

import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    EditText phone;
    ImageButton call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        phone = findViewById(R.id.number);
        call = findViewById(R.id.call);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonenumber = phone.getText().toString();
                if (phonenumber.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "please enter number !", Toast.LENGTH_SHORT).show();

                } else {
                    String s = "tel:" + phonenumber;
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse(s));
                    startActivity(intent);
                }
            }
        });

    }


}






