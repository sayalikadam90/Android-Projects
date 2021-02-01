package com.example.myactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;



public class Activity19 extends AppCompatActivity {


    public static final int camera_perm_code = 101;
    public static final int camera_request_code = 102;

    ListView listViewStd;
    List<model> studentList;
    listAdapter2 adapterStudent;

    EditText e1, e2, e3;
    Button b1, b2;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        listViewStd = findViewById(R.id.listView);
        e1 = findViewById(R.id.edit1);
        e2 = findViewById(R.id.edit2);
        e3 = findViewById(R.id.edit3);
        b1 = findViewById(R.id.btn2);
        b2 = findViewById(R.id.btn1);
        img = findViewById(R.id.imgview);

        b2.setOnClickListener(new View.OnClickListener() {   //capture image from camera
            @Override
            public void onClick(View v) {
                askcamerapermission();
            }
        });

        studentList = new ArrayList<>();


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                byte[] get_byt_array = new byte[0];

                try {
                    get_byt_array = convert_byet_array(img);
                } catch (Exception e) {
                    Toast.makeText(Activity19.this, "Error" + e, Toast.LENGTH_LONG).show();
                }


                if (e1.getText().toString().equals("")) {
                    Toast.makeText(Activity19.this, "Please Enter First Name", Toast.LENGTH_LONG).show();
                } else if (e2.getText().toString().equals("")) {
                    Toast.makeText(Activity19.this, "Please Enter Branch", Toast.LENGTH_LONG).show();
                } else if (e3.getText().toString().equals("")) {
                    Toast.makeText(Activity19.this, "Please Enter Roll Number", Toast.LENGTH_LONG).show();

                } else if (img == null) {
                    Toast.makeText(Activity19.this, "Please Capture Your image", Toast.LENGTH_LONG).show();
                } else {
                    model student1 = new model();
                    student1.setRoleId(e3.getText().toString().trim());
                    student1.setfName(e1.getText().toString().trim());
                    student1.setlName("Java");
                    student1.setBranch(e2.getText().toString().trim());
                    student1.setImageView(get_byt_array);
                    studentList.add(student1);
                }
            }
        });


        adapterStudent = new listAdapter2(this, studentList);

        listViewStd.setAdapter(adapterStudent);

        listViewStd.setOnItemClickListener(new ListViewClick());

    }


    private void askcamerapermission() {

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)  //if permission is not given
        {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, camera_perm_code);  //then ask permission for camera

        } else {
            openCamera(); //if permission is given then open camera
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (requestCode == camera_perm_code)           //check where request code is equal to
        {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // we can capture image now
                openCamera();
            } else {
                Toast.makeText(this, "camera is requried", Toast.LENGTH_LONG).show();
            }
        }
    }

    private void openCamera() {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);      //through intent capture image
        startActivityForResult(intent, camera_request_code);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == camera_request_code) {
            Bitmap image = (Bitmap) data.getExtras().get("data");      //set capture image to imageview
            img.setImageBitmap(image);

        }

    }

    byte[] convert_byet_array(ImageView im) {
        Bitmap image = ((BitmapDrawable) im.getDrawable()).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        image.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] bytearray = stream.toByteArray();
        return bytearray;
    }


    class ListViewClick implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        }
    }
}


