package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Activity13 extends AppCompatActivity {

    ListView listView1;

    String[] Wname={"Pragati(Chashmish)","10th E MSVS 2K16","Android Apps","Arpita School","Aai","Zensar ESD-Batch-1","TE A Unofficial","NSS Family","TE A Official","PSP group","Family","SAHYADRI"};
    int[] Wimage={R.drawable.w1,R.drawable.w2,R.drawable.w3,R.drawable.w4,R.drawable.w5,R.drawable.w6,R.drawable.w7,R.drawable.w8,R.drawable.w9,R.drawable.w10,R.drawable.w11,R.drawable.w12};
    String[] Wname1={"Zala run program..","Prajakta G:Happy Birthday ","Manasi singh:photo","Happy Birthday Arpita","yes..","+9856783456 Join fast Guys","Exams form last date???","Rohit:https://indianexpre....","kshirsagar:Meeting at 2.30...","Image","Happy Sankrant..","Maharaj"};
    String[] Wname2={"     5:30 PM ","     4:30 PM","     3:18 PM","     2:30 PM","     1.45 PM","  12:30 PM","  11:22 AM","  10:45 AM","  10:10 AM","    9:30 AM","    8:11 AM","    7.30 AM"};
    Adapterwhatsapp adapterwhatsapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);

        listView1=findViewById(R.id.w2);
        adapterwhatsapp=new  Adapterwhatsapp(this,Wname,Wimage,Wname1,Wname2);
        listView1.setAdapter(adapterwhatsapp);


    }


}