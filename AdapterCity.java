package com.example.myactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterCity extends RecyclerView.Adapter <AdapterCity.ViewHolder> {

    Context mcontext;
    List<CityName> mCityList;

    public AdapterCity(Context mcontext,List<CityName> mCityList){
        this.mcontext=mcontext;
        this.mCityList=mCityList;

    }

    @NonNull
    @Override
    public AdapterCity.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View CityView= LayoutInflater.from(parent.getContext()).inflate(R.layout.mycustomview,parent,false);

        return new ViewHolder(CityView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCity.ViewHolder holder, int position) {
        CityName citys=mCityList.get(position);
        holder.cityName.setText(citys.getName());

    }

    @Override
    public int getItemCount() {
        return mCityList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView cityName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cityName=itemView.findViewById(R.id.textviewcity);

        }
    }
}
