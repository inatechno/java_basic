package com.inatechno.javabasicapp.adapter;

import android.app.Activity;
import android.app.Service;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.inatechno.javabasicapp.R;
import com.inatechno.javabasicapp.RecyclerViewActivity;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder> {

    Activity act;
    String[] namabuah;
    int[] gambarBuah;
    public CustomRecyclerAdapter(RecyclerViewActivity recyclerViewActivity, String[] namabuah, int[] gambarBuah) {
        this.namabuah =namabuah;
        this.gambarBuah= gambarBuah;
        act = recyclerViewActivity;

    }

    @Override
    public CustomRecyclerAdapter.MyViewHolder onCreateViewHolder(  ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater)act.getSystemService(Service.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.customrecycler,parent,false);
        return new MyViewHolder(v);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgbuah;
        TextView txtbuah;
        public MyViewHolder(View itemView) {
            super(itemView);
            imgbuah = itemView.findViewById(R.id.imgbuah);
            txtbuah = itemView.findViewById(R.id.txtnamaBuah);
        }
    }

    @Override
    public void onBindViewHolder( CustomRecyclerAdapter.MyViewHolder holder, int position) {
        holder.imgbuah.setImageResource(gambarBuah[position]);
        holder.txtbuah.setText(namabuah[position]);

    }

    @Override
    public int getItemCount() {
        return gambarBuah.length;
    }


}
