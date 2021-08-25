package com.inatechno.javabasicapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.inatechno.javabasicapp.adapter.CustomPagerAdapter;

import static com.inatechno.javabasicapp.data.DataHelm.gambarHelm;
import static com.inatechno.javabasicapp.data.DataHelm.namaHelm;

public class ViewPagerActivity extends AppCompatActivity {
ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        pager = findViewById(R.id.pager);

        CustomPagerAdapter adapter = new CustomPagerAdapter(this,namaHelm,gambarHelm);
        pager.setAdapter(adapter);

    }
}