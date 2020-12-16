package com.example.jobhuntjava;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("InterviewJson.json")
    Call<JobList> getJobInfoArrayList();

}
