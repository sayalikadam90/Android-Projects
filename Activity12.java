package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.database.DataSetObserver;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity12 extends AppCompatActivity {

    ListView listView;
    String[] CountryName={"Pragati Gawade","Priyanka Sutar","Kunal Kadam","Rutuja Khatal","Vivek Khot","Priti Gapat","Pratik Chavan","Arpita Jadhav","Mayur Kadam","Pratiksha Jadhav","Shital Kawale","Rohit Malusare","Suyash Tilak" };
    int[] CountryImage={R.drawable.girl1,R.drawable.girl2,R.drawable.boy1,R.drawable.girl3,R.drawable.boy2,R.drawable.girl4,R.drawable.boy3,R.drawable.girl5,R.drawable.boy4,R.drawable.girl6,R.drawable.girl1,R.drawable.boy5,R.drawable.boy6};
    String[] CountryName1={"New snap      . 5hr 11m  .","Received      . 3hr 2m    .","Received      . 11hr 4m   .","Received       . 1hr 20m  .","New snap      . 1hr 45m   .","New snap        . 5hr 6m  .","Received       . 4hr 4m  .","New snap      . 2hr 15m  .","New snap      . 1hr 5hr  .","New snap      . 2hr 5m  .","New snap      . 3hr 15m  .","New snap      . 2hr 20m  .","New snap      . 3hr 10m  ."};
    String[] CountryName2={"16","23","56","34","10","23","20","2","","","23","45",""};
    int[] CountryImage1={R.drawable.ic_red1,R.drawable.ic_square,
                         R.drawable.ic_square1,R.drawable.ic_square,
                         R.drawable.ic_red1,R.drawable.ic_red1,
                          R.drawable.ic_square,R.drawable.ic_square1,
                          R.drawable.ic_square1,R.drawable.ic_square,R.drawable.ic_square1,
                           R.drawable.ic_red1,R.drawable.ic_square};

    AdapterCountry adapterCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);

        listView = findViewById(R.id.s2);
        adapterCountry = new AdapterCountry(this,CountryName,CountryImage,CountryName1,CountryName2,CountryImage1);
        listView.setAdapter(adapterCountry);


    }


       }
