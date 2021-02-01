
package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity9 extends AppCompatActivity {

    EditText edcity;
    Button btnadd;
    Button btnremove;
    ListView listviewcity;
    ArrayList<String> cityList;
    ArrayAdapter<String> cityAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

        cityList=new ArrayList<String>();

        edcity=findViewById(R.id.EDI);
        btnadd=findViewById(R.id.BT);
        btnremove=findViewById(R.id.BT1);
        cityAdapter=new ArrayAdapter<String>(Activity9.this, android.R.layout.simple_list_item_1,cityList);
        listviewcity=findViewById(R.id.city);
        btnadd.setOnClickListener(new Buttonadd());
        btnremove.setOnClickListener(new Buttonremove());
        listviewcity.setAdapter(cityAdapter);

    }
    class Buttonadd implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            cityList.add(edcity.getText().toString().trim());
            cityAdapter.notifyDataSetChanged();
            Toast.makeText(Activity9.this,"city added successfully",Toast.LENGTH_LONG).show();


        }
    }

    class Buttonremove implements View.OnClickListener{


        @Override
        public void onClick(View v) {
            cityList.remove(edcity.getText().toString().trim());
            cityAdapter.notifyDataSetChanged();
            Toast.makeText(Activity9.this,"city removed successfully",Toast.LENGTH_LONG).show();

        }
    }



}