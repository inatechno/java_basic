package com.inatechno.javabasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.inatechno.javabasicapp.adapter.CustomGridAdapter;

import static com.inatechno.javabasicapp.data.DataBuah.detailBuah;
import static com.inatechno.javabasicapp.data.DataBuah.gambarBuah;
import static com.inatechno.javabasicapp.data.DataBuah.namaBuah;
import static com.inatechno.javabasicapp.data.DataBuah.suaraBuah;

public class CustomGridViewActivity extends AppCompatActivity {
GridView gridbuahcustom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view);
        gridbuahcustom = findViewById(R.id.gridBuahCustom);

        CustomGridAdapter adapter = new CustomGridAdapter(this,
                getResources().getStringArray(namaBuah),gambarBuah);
        gridbuahcustom.setAdapter(adapter);
        gridbuahcustom.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CustomGridViewActivity.this,DetailCustomGridActivity.class);
                intent.putExtra("nB",getResources().getStringArray(namaBuah)[position]);
                intent.putExtra("gB",gambarBuah[position]);
                intent.putExtra("dB",getResources().getStringArray(detailBuah)[position]);
                intent.putExtra("sB",suaraBuah[position]);
                startActivity(intent);
            }
        });
    }
}