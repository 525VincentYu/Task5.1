package com.example.newsapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myadapter1 extends RecyclerView.Adapter<Myadapter1.MyViewHolder> {
    int image[];
    BlankFragment0 context;
    public Myadapter1(BlankFragment0 ct, int[] imag){
        context = ct;
        image = imag;


    }
    @NonNull
    @Override
    public Myadapter1.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.property1, null);
        Myadapter1.MyViewHolder myViewHoder = new Myadapter1.MyViewHolder(view);
        return myViewHoder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter1.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(image[position]);

    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
