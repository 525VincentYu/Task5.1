package com.example.newsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BlankFragment1 extends Fragment {
    private View related1;
    RecyclerView recyclerView;
    String d1[],d2[];
    int [] imageListt = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,R.drawable.e,R.drawable.f};







    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        d1 =  getResources().getStringArray(R.array.title);
        d2 = getResources().getStringArray(R.array.content);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    related1 = inflater.inflate(R.layout.fragment_blank1, container, false);
    recyclerView = related1.findViewById(R.id.re);


    Myadapter3 myadapter3 = new Myadapter3(this,imageListt,d1,d2);
    recyclerView.setAdapter(myadapter3);
    LinearLayoutManager layoutManager3 = new LinearLayoutManager(getActivity());
    recyclerView.setLayoutManager(layoutManager3);




    return related1;

    }
}