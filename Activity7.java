package com.example.myactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Activity7 extends AppCompatActivity {

    Button check;
    ImageView image;
    int CAMERA_REQUEST_CODE = 111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        check = findViewById(R.id.btncheck);
        image=findViewById(R.id.capture);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkSelfPermission()){
                    Toast.makeText(Activity7.this,"permission granted",Toast.LENGTH_LONG).show();
                    opencamera();
                }else{
                    Toast.makeText(Activity7.this,"permission denied",Toast.LENGTH_LONG).show();

                }


            }
        });

    }

    private boolean checkSelfPermission(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            if(checkSelfPermission(Manifest.permission.CAMERA)!=PackageManager.PERMISSION_GRANTED){
                requestPermissions(new  String[]{Manifest.permission.CAMERA},CAMERA_REQUEST_CODE);
            }
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==CAMERA_REQUEST_CODE){
            if (grantResults[0]==PackageManager.PERMISSION_GRANTED){
                Toast.makeText(Activity7.this,"Granted",Toast.LENGTH_LONG).show();
                opencamera();
            }
            else{
                Toast.makeText(Activity7.this,"Denied",Toast.LENGTH_LONG).show();
            }


        }
    }
    private void opencamera(){
        Toast.makeText(Activity7.this,"Permission Allowed",Toast.LENGTH_LONG).show();
    }
}