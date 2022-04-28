package com.example.newsapp;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

public class Myadapter2 extends RecyclerView.Adapter<Myadapter2.MyViewHolder> {


    String data1[], data2[],data3[],data4[];
    int image[], image1[];
    BlankFragment0 context;
    public Myadapter2(BlankFragment0 ct,String s1[],String s2[], int[] imag,int [] imag1,String s4[],String[] s3){

        context = ct;
        image = imag;

        data1 = s1;
        data2 = s2;

        data4 = s4;
        data3 = s3;
        image1 = imag1;


    }
    @NonNull
    @Override
    public Myadapter2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.itemnews, null);
        LayoutInflater inflater = LayoutInflater.from(context.getContext());


        Myadapter2.MyViewHolder myViewHoder = new Myadapter2.MyViewHolder(view);
        return myViewHoder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter2.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.imageButton.setImageResource(image[position]);


        holder.mytext1.setText(data1[position]);
        holder.mytext2.setText(data2[position]);
        holder.imageButton1.setImageResource(image1[position]);
        holder.mytext3.setText(data3[position]);
        holder.mytext4.setText(data4[position]);
        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0) {

                    AppCompatActivity appCompatActivity=(AppCompatActivity)view.getContext();
                    BlankFragment1 blankFragment1 = new BlankFragment1();
                    appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,blankFragment1).addToBackStack(null).commit();
                }
                if (position == 1) {

                    AppCompatActivity appCompatActivity=(AppCompatActivity)view.getContext();
                    BlankFragment2 blankFragment2 = new BlankFragment2();
                    appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,blankFragment2).addToBackStack(null).commit();
                }
                if (position == 2) {

                    AppCompatActivity appCompatActivity=(AppCompatActivity)view.getContext();
                    BlankFragment3 blankFragment3 = new BlankFragment3();
                    appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,blankFragment3).addToBackStack(null).commit();
                }
            }
        });
        holder.imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0) {

                    AppCompatActivity appCompatActivity=(AppCompatActivity)view.getContext();
                    BlankFragment4 blankFragment4 = new BlankFragment4();
                    appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,blankFragment4).addToBackStack(null).commit();
                }
                if (position == 1) {

                    AppCompatActivity appCompatActivity=(AppCompatActivity)view.getContext();
                    BlankFragment5 blankFragment5 = new BlankFragment5();
                    appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,blankFragment5).addToBackStack(null).commit();
                }
                if (position == 2) {

                    AppCompatActivity appCompatActivity=(AppCompatActivity)view.getContext();
                    BlankFragment6 blankFragment6 = new BlankFragment6();
                    appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,blankFragment6).addToBackStack(null).commit();
                }

            }
        });






    }



    @Override
    public int getItemCount() {
        return image.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder  {
        ImageButton imageButton,imageButton1;
        TextView mytext1, mytext2,mytext3,mytext4;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageButton = itemView.findViewById(R.id.imageButton);
            mytext1 = itemView.findViewById(R.id.agent);
            mytext2 = itemView.findViewById(R.id.content);
            mytext3 = itemView.findViewById(R.id.agnet1);
            mytext4 = itemView.findViewById(R.id.content1);
            imageButton1 = itemView.findViewById(R.id.imageButton1);




        }

    }

}
