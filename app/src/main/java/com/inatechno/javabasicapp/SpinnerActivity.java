package com.inatechno.javabasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.IOException;

import static com.inatechno.javabasicapp.data.DataBuah.gambarBuah;
import static com.inatechno.javabasicapp.data.DataBuah.namaBuah;
import static com.inatechno.javabasicapp.data.DataBuah.suaraBuah;

public class SpinnerActivity extends AppCompatActivity {
Spinner spinner;
ImageView imgbuah;
TextView txtbuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        imgbuah = findViewById(R.id.imgBuah);
        txtbuah = findViewById(R.id.txtnamaBuah);
        spinner = findViewById(R.id.spinnerBuah);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,
                getResources().getStringArray(namaBuah));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imgbuah.setImageResource(gambarBuah[position]);
                txtbuah.setText( getResources().getStringArray(namaBuah)[position]);
                MediaPlayer mp = new MediaPlayer();
                Uri lokasi = Uri.parse("android.resource://"+getPackageName()+"/"+suaraBuah[position]);
                try {
                    mp.setDataSource(SpinnerActivity.this,lokasi);
                    mp.prepare();
                    mp.start();
                }catch (IOException e){
                    Log.e("error",e.getMessage());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}