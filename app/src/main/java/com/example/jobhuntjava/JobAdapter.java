package com.example.jobhuntjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder> {
    private ArrayList<JobInfo> jobInfos;


    public JobAdapter(ArrayList<JobInfo> jobInfos) {
        this.jobInfos = jobInfos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.model_job,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

       JobInfo jobInfo= jobInfos.get(position);
       holder.jobTitle.setText(jobInfo.getJobTitle());
       holder.companyName.setText(jobInfo.getJobDetails().getCompanyName());
       holder.deadline.setText(jobInfo.getDeadline());
       holder.experience.setText(jobInfo.getMinExperience());
       holder.companyLogo.setImageResource(Integer.parseInt(jobInfo.getLogo()));

    }

    @Override
    public int getItemCount() {
        return jobInfos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView jobTitle,companyName,deadline,experience;
        private ImageView companyLogo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jobTitle=itemView.findViewById(R.id.jobTitleTV);
            companyName=itemView.findViewById(R.id.companyNameTV);
            deadline=itemView.findViewById(R.id.deadLineTV);
            experience=itemView.findViewById(R.id.experienceTV);
            companyLogo=itemView.findViewById(R.id.companyIV);
        }
    }
}
