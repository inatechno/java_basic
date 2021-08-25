package com.inatechno.javabasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
    }

    public void onCustomList(View view) {
        startActivity(new Intent(this,CustomListViewActivity.class));
    }

    public void onListBiasa(View view) {
        startActivity(new Intent(this,ListViewBiasaActivity.class));
    }
}