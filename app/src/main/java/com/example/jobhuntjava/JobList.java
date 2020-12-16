package com.example.jobhuntjava;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class JobList {
    @SerializedName("data")
    private ArrayList<JobInfo> jobInfoArrayList;

    public JobList(ArrayList<JobInfo> jobInfoArrayList) {
        this.jobInfoArrayList = jobInfoArrayList;
    }

    public ArrayList<JobInfo> getJobInfoArrayList() {
        return jobInfoArrayList;
    }
}
