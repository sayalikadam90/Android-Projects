package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class Activity20 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<CityName> CityList;
    CityName cityName;

     Button btnadd;
     EditText edtName;

     AdapterCity adapterCity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_20);

        recyclerView=findViewById(R.id.recycleview);
        btnadd=findViewById(R.id.btnname);
        edtName=findViewById(R.id.edtname);

        btnadd.setOnClickListener(new AddCityClickListener());
        CityList=new ArrayList<>();
        adapterCity=new AdapterCity(this,CityList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapterCity);
    }

    class AddCityClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            cityName=new CityName();
            cityName.setName(edtName.getText().toString().trim());
            CityList.add(cityName);
            adapterCity.notifyDataSetChanged();


        }
    }
}