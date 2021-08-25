package com.inatechno.javabasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WebviewURLHTMLActivity extends AppCompatActivity {
WebView webhtml,weburl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        weburl = findViewById(R.id.weburl);
        webhtml = findViewById(R.id.webhtml);
        Intent i  = getIntent();
        if (i.getIntExtra("kode",0)==1){
            weburl.getSettings().setJavaScriptEnabled(true);
            weburl.loadUrl("https://www.inatechno.com");

        }else{
            webhtml.setVisibility(View.VISIBLE);
            weburl.setVisibility(View.GONE);
            String content = getResource(getResources(),R.raw.materiandroid);
        }
    }

    public String getResource(Resources resources,int id){
        InputStream inputStream = resources.openRawResource(id);
        String content = webToString(inputStream);
        try {
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return content;
    }

    public String webToString(InputStream inputStream){
        String l;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();
        try {
            while ((l=bufferedReader.readLine())!=null){
                stringBuilder.append(l+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}