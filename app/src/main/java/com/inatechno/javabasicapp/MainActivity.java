package com.inatechno.javabasicapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    //deklarasi variable
//    Button btnWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2);
        Log.d("lifecycle:", "onCreate");
        Toast.makeText(this, "selamat datang", Toast.LENGTH_SHORT).show();
//        //inisialisasi variable
//        btnWebview = findViewById(R.id.btnwebview);
//        //aksi
//        btnWebview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, WebviewActivity.class));
//            }
//        });
    }

    //untuk menampilkan menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //untuk pemilihan di menu


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.mn_webview:
                startActivity(new Intent(MainActivity.this, WebviewURLHTMLActivity.class));
                break;
            case R.id.mn_keluarapp:
                keluar();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    //method untuk tombol back di device
    @Override
    public void onBackPressed() {
        keluar();
    }

    void keluar() {
        AlertDialog keluar = new AlertDialog.Builder(this).create();
        keluar.setTitle("Informasi");
        keluar.setMessage("Apakah anda yakin ingin keluar ?");
        keluar.setIcon(R.mipmap.ic_helm);
        keluar.setButton(AlertDialog.BUTTON_POSITIVE, "Iya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                finish();
            }
        });
        keluar.setButton(AlertDialog.BUTTON_NEGATIVE, "Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        keluar.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle:", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle:", "onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle:", "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle:", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle:", "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle:", "onPause");
    }

    public void onWebview(View view) {
        startActivity(new Intent(MainActivity.this, WebviewURLHTMLActivity.class));

    }

    public void onListview(View view) {
        startActivity(new Intent(MainActivity.this, ListviewActivity.class));
    }

    public void onGridView(View view) {
        startActivity(new Intent(MainActivity.this, GridViewActivity.class));
    }

    public void onSpinner(View view) {
        startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
    }

    public void onVideoView(View view) {
        startActivity(new Intent(MainActivity.this, VideoViewActivity.class));
    }

    public void onRecyclerView(View view) {
        startActivity(new Intent(MainActivity.this, RecyclerViewActivity.class));
    }

    public void onTabView(View view) {
        startActivity(new Intent(MainActivity.this, TabViewActivity.class));
    }

    public void onCustomAlert(View view) {
        startActivity(new Intent(MainActivity.this, CustomAlertActivity.class));
    }
}