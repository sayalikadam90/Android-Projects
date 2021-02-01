package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class Activity8 extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        btn=findViewById(R.id.BTN);
        Buttonclick obj=new Buttonclick();
        btn.setOnClickListener(obj);
    }

  class Buttonclick implements View.OnClickListener{
        @Override
         public void onClick(View view){
            Toast.makeText(Activity8.this,"Button clicked",Toast.LENGTH_LONG).show();
        }
  }
}