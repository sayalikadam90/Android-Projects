package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class startactivity2 extends AppCompatActivity {

    EditText EDIT1,EDIT2,EDIT3;
    Button BTN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startactivity2);

        EDIT1=findViewById(R.id.TXTVIEW6);
        EDIT2=findViewById(R.id.TXTVIEW7);
        EDIT3=findViewById(R.id.TXTVIEW8);

        BTN2=findViewById(R.id.Back);
        BTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strText1=EDIT1.getText().toString().trim();
                String strText2=EDIT2.getText().toString().trim();
                String strText3=EDIT3.getText().toString().trim();

                Intent intent=new Intent();
                intent.putExtra("Text1",strText1);
                intent.putExtra("Text2",strText2);
                intent.putExtra("Text3",strText3);
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });

    }
}