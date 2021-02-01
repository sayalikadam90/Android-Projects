package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    EditText ED1, ED2, ED3;
    Button BT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        ED1 = findViewById(R.id.TE1);
        ED2 = findViewById(R.id.TE2);
        ED3 = findViewById(R.id.TE3);

        BT = findViewById(R.id.B1);
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            String to=ED1.getText().toString();
            String subject=ED2.getText().toString();
            String  message=ED3.getText().toString();

            Intent intent=new Intent(Intent.ACTION_SEND);
           intent.putExtra(Intent.EXTRA_EMAIL, new String[] {to});
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,message);

            intent.setType("message/rfc822");
            startActivity(Intent.createChooser(intent,"select email app"));



            }

        });


    }
}


