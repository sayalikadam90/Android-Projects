package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity6 extends AppCompatActivity {
    EditText editText1,editText2,editText3;
    Button btn1;
    TextView textView1,textView2,textview3;

       //int clickcount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

           editText1=findViewById(R.id.Edittext);
           editText2=findViewById(R.id.Edittext1);
           editText3=findViewById(R.id.Edittext2);

           textView1=findViewById(R.id.Textview);
           textView2=findViewById(R.id.Textview1);
           textview3=findViewById(R.id.Textview3);


           btn1=findViewById(R.id.Button);
           btn1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {


                   String name=editText1.getText().toString().trim();
                   String name1=editText2.getText().toString().trim();
                   String name2=editText3.getText().toString().trim();
                   textView1.setText("first name :" +name);
                   textView2.setText("Middle name :" +name1);
                   textview3.setText("last name :" +name2);

                   //clickcount=clickcount+1;
                 //  if(clickcount==1)
                  // {
                       //Toast.makeText(MainActivity6.this, "Button is clicked", Toast.LENGTH_SHORT).show();
                   //}
                  // else
                   //{
                    //   Toast.makeText(MainActivity6.this, "Button clicked count is:" +clickcount, Toast.LENGTH_SHORT).show();
                  // }


               }


           });

            }
        }

