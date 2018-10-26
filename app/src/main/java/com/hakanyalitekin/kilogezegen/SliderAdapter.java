package com.hakanyalitekin.kilogezegen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;
    String kilo;
    String[] slide_heading;
    String[] slide_desc;
    int[] slide_images;
    String[] slide_kilo;



    public SliderAdapter(Context context,int[] slide_images,  String[] slide_heading,String[] slide_kilo,String[] slide_desc)
    {
        this.context = context;
        this.slide_images=slide_images;
        this.slide_heading=slide_heading;
        this.slide_kilo = slide_kilo;
        this.slide_desc=slide_desc;
    }



    @Override
    public int getCount() {
       return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view ==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater =(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);
        ImageView slideImageView = view.findViewById(R.id.slide_image);
        TextView slideHeading = view.findViewById(R.id.slide_header);
        TextView slideKilo = view.findViewById(R.id.slide_kilo);
        TextView slideDesc = view.findViewById(R.id.slide_desc);


        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_heading[position]);
        slideKilo.setText(slide_kilo[position]);
        slideDesc.setText(slide_desc[position]);
        container.addView(view);
        return  view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
  container.removeView((RelativeLayout)object);
    }
}
