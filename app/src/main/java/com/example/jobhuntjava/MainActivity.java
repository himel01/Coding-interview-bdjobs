package com.example.jobhuntjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private JobAdapter adapter;
    private ArrayList<JobInfo> infoArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        recyclerView=findViewById(R.id.jobRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        infoArrayList=new ArrayList<>();
    }
}