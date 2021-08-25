package com.inatechno.javabasicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.inatechno.javabasicapp.databinding.ActivityWebViewglobalBinding;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityWebViewglobalBinding binding = ActivityWebViewglobalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
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