package com.inatechno.javabasicapp;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.inatechno.javabasicapp.databinding.ActivityWebviewurlhtmlBinding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WebviewURLHTMLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityWebviewurlhtmlBinding binding = ActivityWebviewurlhtmlBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent i  = getIntent();
        if (i.getIntExtra("kode",0)==1){
            binding.weburl.getSettings().setJavaScriptEnabled(true);
            binding.weburl.loadUrl("https://www.inatechno.com");

        }else{
            binding.webhtml.setVisibility(View.VISIBLE);
            binding.weburl.setVisibility(View.GONE);
            String content = getResource(getResources(),R.raw.materiandroid);
            String mimetype = "text/html";
            String encoding = "UTF-8";
            binding.webhtml.loadDataWithBaseURL("file:///android_asset",content,mimetype,encoding,null);
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