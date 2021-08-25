package com.inatechno.javabasicapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

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
        EditText nama = v.findViewById(R.id.edtnama);
        EditText email = v.findViewById(R.id.edtemail);
        EditText usia = v.findViewById(R.id.edtusia);
        EditText nohp = v.findViewById(R.id.edtnohp);
        RadioButton rbLaki =v.findViewById(R.id.rblakilaki);
        RadioButton rbWanita =v.findViewById(R.id.rbperempuan);
        CheckBox cbmakan = v.findViewById(R.id.cbmakan);
        CheckBox cbgowes = v.findViewById(R.id.cbgowes);
        CheckBox cbngoding = v.findViewById(R.id.cbngoding);
        CheckBox cbnonton = v.findViewById(R.id.cbnonton);

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setView(v);
        dialog.setCancelable(false);
        dialog.setIcon(R.mipmap.ic_helm);
        dialog.setTitle("Form Pendaftaran");
        dialog.setPositiveButton("send", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alert = dialog.create();
        alert.show();
        alert.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo 1.3 parsing view to String
                ;
                String nm = nama.getText().toString();
                String em = email.getText().toString();
                String u = usia.getText().toString();
                String hp = nohp.getText().toString();
                String jenkel;
                if (rbLaki.isChecked()){
                    jenkel = "laki - laki";
                }else{
                    jenkel = "perempuan";
                }
                String hobby;
                if (cbgowes.isChecked()){
                    hobby ="gowes";
                }else if (cbmakan.isChecked()){
                    hobby ="makan";
                }
                else if (cbngoding.isChecked()){
                    hobby ="ngoding";
                }else {
                    hobby = "nonton";
                }
                //validasi inputan
                if (TextUtils.isEmpty(nm)){
                    nama.setError("nama tidak boleh kosong");
                    nama.requestFocus();
                }else if (TextUtils.isEmpty(em)){
                    email.setError("email tidak boleh kosong");
                    email.requestFocus();
                }else if (TextUtils.isEmpty(u)){
                    usia.setError("usia tidak boleh kosong");
                    usia.requestFocus();
                }else if (TextUtils.isEmpty(hp)){
                    nohp.setError("nohp tidak boleh kosong");
                    nohp.requestFocus();
                }else{
                    Intent i = new Intent(CustomAlertActivity.this,TangkapDataAlertActivity.class);
                    i.putExtra("n",nm);
                    i.putExtra("e",em);
                    i.putExtra("u",u);
                    i.putExtra("h",hp);
                    i.putExtra("j",jenkel);
                    i.putExtra("ho",hobby);
                    startActivity(i);
                    alert.dismiss();
                }
            }

        });
        alert.getButton(AlertDialog.BUTTON_NEGATIVE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.dismiss();
            }
        });
        alert.getButton(AlertDialog.BUTTON_NEUTRAL).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama.setText("");
                usia.setText("");
                email.setText("");
                nohp.setText("");
            }
        });
    }
}