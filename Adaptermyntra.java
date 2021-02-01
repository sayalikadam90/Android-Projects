package com.example.myactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class Adaptermyntra extends BaseAdapter {

    Context mcontext;
    List<Modelclass> modelclass;

    public Adaptermyntra(Context mcontext, List<Modelclass> modelclass){

        this.mcontext=mcontext;
        this.modelclass=modelclass;

    }


    @Override
    public int getCount() {
        return modelclass.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ViewList;
        if (convertView==null){
            LayoutInflater inflater=LayoutInflater.from(mcontext);
            ViewList=inflater.inflate(R.layout.listview3,null);
        } else {
            ViewList=convertView;
        }

        TextView myntratxt=ViewList.findViewById(R.id.m2);
        TextView myntratx1=ViewList.findViewById(R.id.m4);
        TextView myntratxt2=ViewList.findViewById(R.id.m6);
        TextView myntratxt3=ViewList.findViewById(R.id.m7);
        ImageView myntraimg=ViewList.findViewById(R.id.m1);
        ImageView myntraimg1=ViewList.findViewById(R.id.m5);
        ImageView myntraimg2=ViewList.findViewById(R.id.m8);

        Modelclass myntraclass=modelclass.get(position);

       myntratxt.setText(myntraclass.getMyntratxt());
       myntratx1.setText(myntraclass.getMyntratxt1());
       myntratxt2.setText(myntraclass.getMyntratxt2());
       myntratxt3.setText(myntraclass.getMyntratxt3());

       myntraimg.setImageResource(myntraclass.getMyntraimg());
       myntraimg1.setImageResource(myntraclass.getMyntraimg1());
       myntraimg2.setImageResource(myntraclass.getMyntraimg2());
        return ViewList;
    }
}
