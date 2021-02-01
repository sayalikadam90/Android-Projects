package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ListMenuItemView;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class Activity6 extends AppCompatActivity {

    ListView osList;
    String[] osArray = {"Alpha", "Beta", "cupcake", "Donut", "Eclair", "Froyo", "GingerBread", "HoneyComb", "Icecream Sandwitch", "JellyBeans", "Kitkat", "Lollipop", "Marshmello", "Nougat", "Oreo", "Pie", "Android10", "Android11"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        osList = findViewById(R.id.listview);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, osArray);
        osList.setAdapter(adapter);

      // osList.setOnItemClickListener(new ListViewItemListener());
    }
}

//class ListViewItemListener implements AdapterView.OnItemClickListener{

//    @Override
  //  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    //    Toast.makeText(Activity6.this,"position is "+position,Toast.LENGTH_LONG).show();
      // if(position==0){
        //   Toast.makeText(Activity6.this,"U are Using Alpha",Toast.LENGTH_LONG).show();
        //}else
          //  Toast.makeText(Activity6.this,((TextView)view).getText()+ " is clicked",Toast.LENGTH_LONG).show();
        //}
   //}


