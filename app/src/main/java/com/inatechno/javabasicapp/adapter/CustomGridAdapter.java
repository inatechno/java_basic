package com.inatechno.javabasicapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.inatechno.javabasicapp.CustomGridViewActivity;
import com.inatechno.javabasicapp.CustomListViewActivity;
import com.inatechno.javabasicapp.R;

public class CustomGridAdapter extends BaseAdapter {

    String[] namaBuah;
    int[] gambar;
    Activity act;

    public CustomGridAdapter(CustomGridViewActivity customGRidViewActivity, String[] namaBuah, int[] gambarBuah) {
        this.namaBuah = namaBuah;
        gambar = gambarBuah;
        act = customGRidViewActivity;
    }

        // untuk menghitung total data yang akan di load / tampilkan
    @Override
    public int getCount() {
        return gambar.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    // untuk mengatur tampilan yang akan dimunculkan
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) act.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView  = inflater.inflate(R.layout.customgrid,null);
        ImageView imgBuah = convertView.findViewById(R.id.imghelm);
        TextView txtnamaBuah = convertView.findViewById(R.id.txtnamahelm);
        imgBuah.setImageResource(gambar[position]);
        txtnamaBuah.setText(namaBuah[position]);
        return convertView;
    }
}
