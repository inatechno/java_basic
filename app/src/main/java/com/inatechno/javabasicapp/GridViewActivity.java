package com.inatechno.javabasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
    }

    public void onGridBiasa(View view) {
        startActivity(new Intent(this,GridViewBiasaActivity.class));
    }

    public void onCustomGrid(View view) {
        startActivity(new Intent(this,CustomGridViewActivity.class));

    }
}