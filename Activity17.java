package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Activity17 extends AppCompatActivity {

   GridView listview;
   List<Modelclass> myntraList;
    Adaptermyntra adaptermyntra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_17);

        listview=findViewById(R.id.m3);
        myntraList=new ArrayList<>();

        Modelclass myntra1=new Modelclass();
        myntra1.setMyntratxt("AHIKA");
        myntra1.setMyntratxt1("printed kurti");
        myntra1.setMyntratxt2("560");
        myntra1.setMyntratxt3("20% OFF");
        myntra1.setMyntraimg(R.drawable.myntra1);
        myntra1.setMyntraimg1(R.drawable.rs);
        myntra1.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra1);

        Modelclass myntra2=new Modelclass();
        myntra2.setMyntratxt("BINITA");
        myntra2.setMyntratxt1("printed A-line kurti");
        myntra2.setMyntratxt2("500");
        myntra2.setMyntratxt3("20% OFF");
        myntra2.setMyntraimg(R.drawable.myntra2);
        myntra2.setMyntraimg1(R.drawable.rs);
        myntra2.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra2);

        Modelclass myntra3=new Modelclass();
        myntra3.setMyntratxt("DAKSHA");
        myntra3.setMyntratxt1("printed A-line kurti");
        myntra3.setMyntratxt2("700");
        myntra3.setMyntratxt3("10% OFF");
        myntra3.setMyntraimg(R.drawable.myntra3);
        myntra3.setMyntraimg1(R.drawable.rs);
        myntra3.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra3);

        Modelclass myntra4=new Modelclass();
        myntra4.setMyntratxt("ESHIKA");
        myntra4.setMyntratxt1("printed kurti");
        myntra4.setMyntratxt2("700");
        myntra4.setMyntratxt3("30% OFF");
        myntra4.setMyntraimg(R.drawable.myntra4);
        myntra4.setMyntraimg1(R.drawable.rs);
        myntra4.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra4);


        Modelclass myntra5=new Modelclass();
        myntra5.setMyntratxt("MAIRA");
        myntra5.setMyntratxt1("white ghagra");
        myntra5.setMyntratxt2("780");
        myntra5.setMyntratxt3("25% OFF");
        myntra5.setMyntraimg(R.drawable.myntra5);
        myntra5.setMyntraimg1(R.drawable.rs);
        myntra5.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra5);

        Modelclass myntra6=new Modelclass();
        myntra6.setMyntratxt("JEEVIKA");
        myntra6.setMyntratxt1("printed black");
        myntra6.setMyntratxt2("900");
        myntra6.setMyntratxt3("25% OFF");
        myntra6.setMyntraimg(R.drawable.myntra6);
        myntra6.setMyntraimg1(R.drawable.rs);
        myntra6.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra6);

        Modelclass myntra7=new Modelclass();
        myntra7.setMyntratxt("GUNJAN");
        myntra7.setMyntratxt1("orange ghagra");
        myntra7.setMyntratxt2("1000");
        myntra7.setMyntratxt3("40% OFF");
        myntra7.setMyntraimg(R.drawable.myntra7);
        myntra7.setMyntraimg1(R.drawable.rs);
        myntra7.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra7);


        Modelclass myntra8=new Modelclass();
        myntra8.setMyntratxt("REHA");
        myntra8.setMyntratxt1("printed A-line");
        myntra8.setMyntratxt2("780");
        myntra8.setMyntratxt3("35% OFF");
        myntra8.setMyntraimg(R.drawable.myntra8);
        myntra8.setMyntraimg1(R.drawable.rs);
        myntra8.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra8);

        Modelclass myntra9=new Modelclass();
        myntra9.setMyntratxt("NATASHA");
        myntra9.setMyntratxt1("printed straight");
        myntra9.setMyntratxt2("900");
        myntra9.setMyntratxt3("10% OFF");
        myntra9.setMyntraimg(R.drawable.myntra9);
        myntra9.setMyntraimg1(R.drawable.rs);
        myntra9.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra9);

        Modelclass myntra10=new Modelclass();
        myntra10.setMyntratxt("RHEA");
        myntra10.setMyntratxt1("printed kurti");
        myntra10.setMyntratxt2("557");
        myntra10.setMyntratxt3("20% OFF");
        myntra10.setMyntraimg(R.drawable.myntra10);
        myntra10.setMyntraimg1(R.drawable.rs);
        myntra10.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra10);


        Modelclass myntra11=new Modelclass();
        myntra11.setMyntratxt("PRACHI");
        myntra11.setMyntratxt1("printed kurti");
        myntra11.setMyntratxt2("597");
        myntra11.setMyntratxt3("20% OFF");
        myntra11.setMyntraimg(R.drawable.myntra11);
        myntra11.setMyntraimg1(R.drawable.rs);
        myntra11.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra11);

        Modelclass myntra12=new Modelclass();
        myntra12.setMyntratxt("ARYA");
        myntra12.setMyntratxt1("printed A-Line kurti");
        myntra12.setMyntratxt2("1000");
        myntra12.setMyntratxt3("30% OFF");
        myntra12.setMyntraimg(R.drawable.myntra12);
        myntra12.setMyntraimg1(R.drawable.rs);
        myntra12.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra12);


        Modelclass myntra13=new Modelclass();
        myntra13.setMyntratxt("KHUSHI");
        myntra13.setMyntratxt1("printed kurti");
        myntra13.setMyntratxt2("789");
        myntra13.setMyntratxt3("40% OFF");
        myntra13.setMyntraimg(R.drawable.myntra13);
        myntra13.setMyntraimg1(R.drawable.rs);
        myntra13.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra13);


        Modelclass myntra14=new Modelclass();
        myntra14.setMyntratxt("SANDHYA");
        myntra14.setMyntratxt1("printed A-line");
        myntra14.setMyntratxt2("597");
        myntra14.setMyntratxt3("25% OFF");
        myntra14.setMyntraimg(R.drawable.myntra14);
        myntra14.setMyntraimg1(R.drawable.rs);
        myntra14.setMyntraimg2(R.drawable.ic_heart);
        myntraList.add(myntra14);




        adaptermyntra=new Adaptermyntra(this,myntraList);
        listview.setAdapter(adaptermyntra);


    }
}