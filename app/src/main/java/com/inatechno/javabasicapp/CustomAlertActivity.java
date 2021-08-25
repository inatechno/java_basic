package com.inatechno.javabasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class CustomAlertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert);
    }

    public void onShowAlert(View view) {
        //inflater bertujuan untuk membuat suata view menjadi popup
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.customalert,null);
    }
}