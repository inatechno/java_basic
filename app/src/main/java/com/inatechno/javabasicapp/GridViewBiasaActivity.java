package com.inatechno.javabasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.List;

import static com.inatechno.javabasicapp.data.DataBuah.namaBuah;


public class GridViewBiasaActivity extends AppCompatActivity {
GridView gridBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_biasa);
        gridBuah = findViewById(R.id.gridBuah);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(namaBuah));
        gridBuah.setAdapter(adapter);

    }
}