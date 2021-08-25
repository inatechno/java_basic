package com.inatechno.javabasicapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class TangkapDataAlertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangkap_data_alert);
    }

    public void onLihatData(View view) {
        LayoutInflater inflater = getLayoutInflater();
        View tangkap=inflater.inflate(R.layout.formtangkapdata,null);
        AlertDialog.Builder builder =new AlertDialog.Builder(TangkapDataAlertActivity.this);
        builder.setView(tangkap);
        builder.setCancelable(true);
        builder.setTitle("informasi");

        TextView nama= tangkap.findViewById(R.id.txtnama);
        TextView usia = tangkap.findViewById(R.id.txtusia);

        TextView email = tangkap.findViewById(R.id.txtemail);
        TextView jeniskelamin = tangkap.findViewById(R.id.txtjeniskelamin);
        TextView nohp = tangkap.findViewById(R.id.txtnohp);
        TextView hobby = tangkap.findViewById(R.id.txthobby);

        Intent intenttangkap = getIntent();
         nama.setText(intenttangkap.getStringExtra("n"));
        usia.setText(intenttangkap.getStringExtra("u"));
        email.setText(intenttangkap.getStringExtra("e"));
        nohp.setText(intenttangkap.getStringExtra("h"));

        jeniskelamin.setText(intenttangkap.getStringExtra("j"));
        hobby.setText(intenttangkap.getStringExtra("ho"));
        builder.setPositiveButton("ok!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.show();
    }
}