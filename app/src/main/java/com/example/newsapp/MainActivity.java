package com.example.newsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //RecyclerView RecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_main);


        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft1 = fm.beginTransaction();
        Fragment fl1 = new BlankFragment0();
        ft1.replace(R.id.fragment_layout,fl1);
        ft1.commit();

    }
}

        /*propertyRecyclerView = findViewById((R.id.recyclerview2));
        propertyadapter = new propertyadapter(propertyList, MainActivity.this);
        propertyRecyclerView.setAdapter(propertyadapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        propertyRecyclerView.setLayoutManager(layoutManager);*/


       /* for(int i =0;i<imageList.length;i++)
        {
            com.example.newsapp.property property = new com.example.newsapp.property(i,imageList[i]);
            propertyList.add(property);
        }*/


