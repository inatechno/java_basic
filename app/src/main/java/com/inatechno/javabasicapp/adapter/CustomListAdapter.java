package com.inatechno.javabasicapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.inatechno.javabasicapp.CustomListViewActivity;
import com.inatechno.javabasicapp.R;

public class CustomListAdapter extends BaseAdapter {

    String[] namaHelm;
    int[] gambar;
    Activity act;

    public CustomListAdapter(CustomListViewActivity customListViewActivity, String[] namaHelm, int[] gambarHelm) {
        this.namaHelm = namaHelm;
        gambar = gambarHelm;
        act = customListViewActivity;
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
        convertView  = inflater.inflate(R.layout.customlist,null);
        ImageView imghelm = convertView.findViewById(R.id.imghelm);
        TextView txtnamahelm = convertView.findViewById(R.id.txtnamahelm);
        imghelm.setImageResource(gambar[position]);
        txtnamahelm.setText(namaHelm[position]);
        return convertView;
    }
}
