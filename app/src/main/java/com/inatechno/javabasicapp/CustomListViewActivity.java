package com.inatechno.javabasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.inatechno.javabasicapp.adapter.CustomListAdapter;

import static com.inatechno.javabasicapp.data.DataHelm.gambarHelm;
import static com.inatechno.javabasicapp.data.DataHelm.namaHelm;

public class CustomListViewActivity extends AppCompatActivity {
    ListView customList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        customList = findViewById(R.id.customlist);

        CustomListAdapter adapter = new CustomListAdapter(CustomListViewActivity.this,namaHelm,gambarHelm);
        customList.setAdapter(adapter);
        customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(CustomListViewActivity.this,DetailCustomListViewActivity.class);
                i.putExtra("nH",namaHelm[position]);
                i.putExtra("gH",gambarHelm[position]);
                startActivity(i);
            }
        });


    }
}