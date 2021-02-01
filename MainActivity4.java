package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView textView1,textView2,textView3;
    LinearLayout viewgroup1;

    




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView1=findViewById(R.id.textview);
        textView1.setText("My application is used");
        textView1.setTextColor(getResources().getColor(R.color.purple_200));
        textView1.setTextSize(30);

        viewgroup1=findViewById(R.id.LinearLayout);
        textView2=new TextView( this);
        textView2.setText("textview created");
        textView2.setTextColor(getResources().getColor(R.color.teal_200));
        textView2.setTextSize(30);
        textView2.setTypeface(Typeface.DEFAULT_BOLD);
        textView2.setPadding(10,10,10,20);

        viewgroup1.addView(textView2);


        textView3=new TextView(this);
        textView3.setText("use of .java");
        textView3.setTextColor(getResources().getColor(R.color.material_on_surface_emphasis_medium));
        textView3.setTextSize(30);
        textView3.setPadding(10,20,30,40);
        textView3.setTypeface(Typeface.DEFAULT_BOLD);
        viewgroup1.addView(textView3);






    }
}