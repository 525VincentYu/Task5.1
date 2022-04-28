package com.example.newsapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myadapter7 extends RecyclerView.Adapter<Myadapter7.MyViewHolder> {
    int image[];
    String data1[], data2[];
    BlankFragment5 context;
    public Myadapter7(BlankFragment5 ct, int[] imag, String []s1, String[]s2){
       this.context = ct;
        image = imag;
        data1 = s1;
        data2 = s2;


    }
    @NonNull
    @Override
    public Myadapter7.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.itemrelated, null);
        Myadapter7.MyViewHolder myViewHoder = new Myadapter7.MyViewHolder(view);
        return myViewHoder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter7.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(image[position]);
        holder.text1.setText(data1[position]);
        holder.text2.setText(data2[position]);

    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView text1;
        TextView text2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.new1imageView);
            text1 = itemView.findViewById(R.id.new1title);
            text2 = itemView.findViewById(R.id.context);
        }
    }
}
