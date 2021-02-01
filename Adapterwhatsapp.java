package com.example.myactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapterwhatsapp extends BaseAdapter {

    Context mcontext;
    String[] mwhatsappname;
    int[] mwhatpappimage;
    String[] mwhatsappname1;
    String[] mwhatsappname2;


    public Adapterwhatsapp(Context mcontext,String[] Wname,int[] Wimage,String[] Wname1,String[] Wname2){
        this.mcontext=mcontext;
        this.mwhatsappname=Wname;
        this.mwhatpappimage=Wimage;
        this.mwhatsappname1=Wname1;
        this.mwhatsappname2=Wname2;

    }

    @Override
    public int getCount() {
        return mwhatsappname.length;
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
        View main;
        if(convertView==null){
            LayoutInflater inflater=LayoutInflater.from(mcontext);
            main=inflater.inflate(R.layout.listview1,null);
        }else{
            main=convertView;
        }

        CircleImageView Image=main.findViewById(R.id.w3);
        TextView N1=main.findViewById(R.id.w4);
        TextView N2=main.findViewById(R.id.w5);
        TextView N3=main.findViewById(R.id.w6);


        Image.setImageResource(mwhatpappimage[position]);
        N1.setText(mwhatsappname[position]);
        N2.setText(mwhatsappname1[position]);
        N3.setText(mwhatsappname2[position]);

        return main;
    }
}
