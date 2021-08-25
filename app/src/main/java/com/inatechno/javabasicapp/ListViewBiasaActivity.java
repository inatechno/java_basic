package com.inatechno.javabasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewBiasaActivity extends AppCompatActivity {

    ListView listviewbiasa;
    //declare data
    String[] listHelm = {"polygon","entity","pasific","cairbull","rockbross","avand"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_biasa);
        listviewbiasa = findViewById(R.id.listviewbiasa);
        //adapter = untuk menghubungkan antara data dengan view

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listHelm);
        listviewbiasa.setAdapter(adapter);
    }
}