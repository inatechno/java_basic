package com.inatechno.javabasicapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.inatechno.javabasicapp.adapter.CustomRecyclerAdapter;

import static com.inatechno.javabasicapp.data.DataBuah.gambarBuah;
import static com.inatechno.javabasicapp.data.DataBuah.namaBuah;


public class RecyclerViewActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.recyclerview);

        //setadapter
        CustomRecyclerAdapter adapter = new CustomRecyclerAdapter(this, getResources().getStringArray(namaBuah),gambarBuah);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}