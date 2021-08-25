package com.inatechno.javabasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
    }

    public void onWEbUrl(View view) {
        Intent intent = new Intent(this,WebviewURLHTMLActivity.class);
        intent.putExtra("kode",1);
        startActivity(intent);
    }

    public void onWEbhtml(View view) {
        Intent intent = new Intent(this,WebviewURLHTMLActivity.class);
        intent.putExtra("kode",2);
        startActivity(intent);
    }
}