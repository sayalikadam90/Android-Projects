package com.example.myactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity5 extends AppCompatActivity {
    Button btnClick;
    ImageView imageshow;

    int CAMERA_REQUEST_CODE=101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        imageshow=findViewById(R.id.imageview);
        btnClick=findViewById(R.id.btnImage);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,CAMERA_REQUEST_CODE);
            }
        });
    }

   @Override
     protected void onActivityResult(int requestcode, int resultcode, @Nullable Intent data){
        super.onActivityResult(requestcode,resultcode,data);

        if (requestcode==CAMERA_REQUEST_CODE && resultcode==Activity5.RESULT_OK){
            Bitmap myImage=(Bitmap) data.getExtras().get("data");
            imageshow.setImageBitmap(myImage);
        }
   }
}