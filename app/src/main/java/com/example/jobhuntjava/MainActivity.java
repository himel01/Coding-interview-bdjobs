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
    private ArrayList<JobInfo> infoArrayList;
    private JobList jobLists;
    private RecyclerView recyclerView;
    private JobAdapter adapter;
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
        Call<JobList> call=retrofitInterface.getJobInfoArrayList();
        call.enqueue(new Callback<JobList>() {
            @Override
            public void onResponse(Call<JobList> call, Response<JobList> response) {
                jobLists=response.body();
                adapter=new JobAdapter(jobLists,MainActivity.this);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<JobList> call, Throwable t) {

                Toast.makeText(MainActivity.this, ""+t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void init() {
        recyclerView=findViewById(R.id.jobRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        infoArrayList=new ArrayList<>();
        jobLists=new JobList(infoArrayList);

    }
}