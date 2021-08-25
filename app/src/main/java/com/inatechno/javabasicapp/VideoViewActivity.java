package com.inatechno.javabasicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {
VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        videoView = findViewById(R.id.video);
        MediaController controller = new MediaController(this);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.gothedistance);
        videoView.setVideoURI(uri);
        videoView.setMediaController(controller);
        videoView.start();
    }
}