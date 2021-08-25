package com.inatechno.javabasicapp;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;

import androidx.appcompat.app.AppCompatActivity;

import com.inatechno.javabasicapp.databinding.ActivityVideoViewBinding;

public class VideoViewActivity extends AppCompatActivity {
    //update git

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityVideoViewBinding binding = ActivityVideoViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MediaController controller = new MediaController(this);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.gothedistance);
        binding.video.setVideoURI(uri);
        binding.video.setMediaController(controller);
        binding.video.start();
    }
}