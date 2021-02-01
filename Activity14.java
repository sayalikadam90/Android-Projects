package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity14 extends AppCompatActivity {

    CheckBox googlecheck,yahoocheck,bingcheck;
    Button writeresult;
    TextView resulttext;
    ArrayList<String> result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_14);

        googlecheck=findViewById(R.id.check1);
        bingcheck=findViewById(R.id.check2);
       yahoocheck=findViewById(R.id.check3);

        writeresult=findViewById(R.id.btncheck);
        resulttext=findViewById(R.id.txtresult);
        result=new ArrayList<>();
        resulttext.setEnabled(false);

        googlecheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(googlecheck.isChecked())
                    result.add("Google");
                else
                    result.remove("Google");
            }
        });

      yahoocheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(yahoocheck.isChecked())
                    result.add("Yahoo");
                else
                    result.remove("Yahoo");
            }
        });


        bingcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bingcheck.isChecked())
                    result.add("Bing");
                else
                    result.remove("Bing");
            }
        });

        writeresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder=new StringBuilder();
               for (String s:result)
                    stringBuilder.append(s).append("\n");

                resulttext.setText(stringBuilder.toString());
                resulttext.setEnabled(false);
            }
        });



    }
}