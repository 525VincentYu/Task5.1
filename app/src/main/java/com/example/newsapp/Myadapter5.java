package com.example.newsapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myadapter5 extends RecyclerView.Adapter<Myadapter5.MyViewHolder> {
    int image[];
    String data1[], data2[];
    BlankFragment3 context;
    public Myadapter5(BlankFragment3 ct, int[] imag, String []s1, String[]s2){
       this.context = ct;
        image = imag;
        data1 = s1;
        data2 = s2;


    }
    @NonNull
    @Override
    public Myadapter5.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.itemrelated, null);
        Myadapter5.MyViewHolder myViewHoder = new Myadapter5.MyViewHolder(view);
        return myViewHoder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter5.MyViewHolder holder, int position) {
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
