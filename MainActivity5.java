package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity5 extends AppCompatActivity {

    EditText editText1,editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        editText1=findViewById(R.id.Edittext);
        editText1.setText("java");
        String name=editText1.getText().toString();



    }
}