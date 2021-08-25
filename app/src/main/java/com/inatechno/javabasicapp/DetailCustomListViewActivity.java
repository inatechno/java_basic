package com.inatechno.javabasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailCustomListViewActivity extends AppCompatActivity {
ImageView imgDetailhelm;
TextView txtnamahelm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_custom_list_view);
        imgDetailhelm = findViewById(R.id.imgdetailhelm);
        txtnamahelm = findViewById(R.id.txtdetailnamahelm);
        //tangkap data intent
        Intent getData = getIntent();
        txtnamahelm.setText(getData.getStringExtra("nH"));
        imgDetailhelm.setImageResource(getData.getIntExtra("gH",0));



    }
}