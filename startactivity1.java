package com.example.myactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class startactivity1 extends AppCompatActivity {
    TextView Text2,Text4,Text6;
    Button BTN1;
     int RequestCode=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startactivity1);

        Text2=findViewById(R.id.T2);
        Text4=findViewById(R.id.T4);
        Text6=findViewById(R.id.T6);

        BTN1=findViewById(R.id.next);
        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(startactivity1.this,startactivity2.class);
                startActivityForResult(intent,RequestCode);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(RequestCode==requestCode){
            if(Activity.RESULT_OK==resultCode){
                String str1=data.getStringExtra("Text1");
                String str2=data.getStringExtra("Text2");
                String str3=data.getStringExtra("Text3");

                Text2.setText(str1);
                Text4.setText(str2);
                Text6.setText(str3);
            }
        }
    }
}