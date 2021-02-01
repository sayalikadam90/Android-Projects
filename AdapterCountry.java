package com.example.myactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterCountry  extends BaseAdapter {

   Context mcontext;
   String[]  mCountryList;
   String[] mCountryList1;
   int[] mCountryflag;
   int[] mCountryflag1;
   String[] mCountryList2;



    public AdapterCountry(Context mcontext,String[] CountryName,int[] CountryImage,String [] CountryName1,String[] CountryName2,int[] CountryImage1) {
        this.mcontext = mcontext;
        this.mCountryList=CountryName;
        this.mCountryflag=CountryImage;
        this.mCountryList1=CountryName1;
        this.mCountryList2=CountryName2;
        this.mCountryflag1=CountryImage1;



    }

    @Override
    public int getCount() {
        return mCountryList.length;
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
        View view;
        if(convertView==null){
            LayoutInflater inflater=LayoutInflater.from(mcontext);
            view=inflater.inflate(R.layout.listview,null);
        }else{
            view=convertView;
        }

         CircleImageView Imageview=view.findViewById(R.id.s3);
       CircleImageView    Imageview1=view.findViewById(R.id.s9);
         TextView Name=view.findViewById(R.id.s4);
         TextView Name1=view.findViewById(R.id.s5);
         TextView Name2=view.findViewById(R.id.s7);


        Name.setText(mCountryList[position]);
        Name1.setText(mCountryList1[position]);
        Name2.setText(mCountryList2[position]);


        Imageview.setImageResource(mCountryflag[position]);
        Imageview1.setImageResource(mCountryflag1[position]);

        return view;

    }
}
