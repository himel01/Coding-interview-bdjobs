package com.example.jobhuntjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private JobAdapter adapter;
    private ArrayList<JobInfo> infoArrayList;
    private RetrofitInterface retrofitInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        getData();
    }

    private void getData() {
        retrofitInterface=new ApiClient().getInstance().getApi();
        Call<ArrayList<JobInfo>> call=retrofitInterface.getData();
        call.enqueue(new Callback<ArrayList<JobInfo>>() {
            @Override
            public void onResponse(Call<ArrayList<JobInfo>> call, Response<ArrayList<JobInfo>> response) {
                infoArrayList=response.body();
                adapter=new JobAdapter(infoArrayList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<JobInfo>> call, Throwable t) {

                Toast.makeText(MainActivity.this, ""+t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void init() {
        recyclerView=findViewById(R.id.jobRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        infoArrayList=new ArrayList<>();
    }
}