package com.inatechno.javabasicapp.adapter;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.inatechno.javabasicapp.DetailCustomListViewActivity;
import com.inatechno.javabasicapp.R;
import com.inatechno.javabasicapp.ViewPagerActivity;

public class CustomPagerAdapter extends PagerAdapter {
    Activity act;
    String[] namaHelm;
    int[] gambarHelm;
    public CustomPagerAdapter(ViewPagerActivity viewPagerActivity, String[] namaHelm, int[] gambarHelm) {
        act = viewPagerActivity;
        this.namaHelm = namaHelm;
        this.gambarHelm = gambarHelm;
    }

    @Override
    public int getCount() {
        return gambarHelm.length;
    }

    @Override
    public boolean isViewFromObject( View view,   Object object) {
        return view == ((LinearLayout)object);
    }


    @Override
    public Object instantiateItem( ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater)act.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.custompager,null);
        ImageView imghelm = v.findViewById(R.id.imghelm);
        TextView txthelm = v.findViewById(R.id.txtnamahelm);
        imghelm.setImageResource(gambarHelm[position]);
        txthelm.setText(namaHelm[position]);
        ((ViewPager)container).addView(v);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(  act, DetailCustomListViewActivity.class);
                i.putExtra("nH",namaHelm[position]);
                i.putExtra("gH",gambarHelm[position]);
                act.startActivity(i);
            }
        });
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       container.removeView(((LinearLayout)object));
    }
}
