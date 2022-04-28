package com.example.newsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class BlankFragment0 extends Fragment  {


    private View first;
    RecyclerView propertyRecyclerView;
    RecyclerView propertyRecyclerView2;
    private ArrayList<Integer>mNotes = new ArrayList<>();

    String s1[],s2[],s3[],s4[];




    int [] imageList = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,R.drawable.e,R.drawable.f};
    int [] imageList1 = {R.drawable.a, R.drawable.b, R.drawable.c};
    int [] imageList2 = {R.drawable.d,R.drawable.e,R.drawable.f};




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        s1 =  getResources().getStringArray(R.array.agent1);
        s2 = getResources().getStringArray(R.array.content1);
        s3 = getResources().getStringArray(R.array.agent2);
        s4 = getResources().getStringArray(R.array.content2);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment

        first = inflater.inflate(R.layout.fragment_blank0, container, false);
        propertyRecyclerView = first.findViewById((R.id.recyclerview));
        propertyRecyclerView2 = first.findViewById(R.id.recyclerview2);

        Myadapter1 myadapter1 = new Myadapter1(this,imageList);
        propertyRecyclerView.setAdapter(myadapter1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        propertyRecyclerView.setLayoutManager(layoutManager);

        //propertyRecyclerView2 = first.findViewById(R.id.recyclerview2);
        Myadapter2 myadapter2 = new Myadapter2(this,s1,s2,imageList1,imageList2,s4,s3);
        propertyRecyclerView2.setAdapter(myadapter2);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity());
        layoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        propertyRecyclerView2.setLayoutManager(layoutManager1);


























        return first;
    }







}