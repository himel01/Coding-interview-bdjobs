package com.example.jobhuntjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class JobAdapter extends RecyclerView.Adapter<JobAdapter.ViewHolder> {
    private JobList jobList;
    private Context context;

    public JobAdapter(JobList jobList, Context context) {
        this.jobList = jobList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.model_job,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

       //JobInfo jobInfo= infoArrayList.get(position);
       JobInfo jobInfo=jobList.getJobInfoArrayList().get(position);
       holder.jobTitle.setText(jobInfo.getJobTitle());
       holder.companyName.setText(jobInfo.getJobDetails().getCompanyName());
       holder.deadline.setText(jobInfo.getDeadline());
       holder.experience.setText(String.valueOf(jobInfo.getMinExperience()));

       if(jobInfo.getMinSalary()==" " && jobInfo.getMaxSalary()==" "){holder.salaryTV.setText("Negotiable");}
       else if(jobInfo.getMinSalary()=="" && jobInfo.getMaxSalary()!=""){holder.salaryTV.setText(jobInfo.getMaxSalary()+" bdt");}
       else if(jobInfo.getMaxSalary()!="" && jobInfo.getMaxSalary()==""){holder.salaryTV.setText(jobInfo.getMinSalary()+" bdt");}
       else {holder.salaryTV.setText(jobInfo.getMinSalary()+"-"+jobInfo.getMaxSalary());}

       if(jobInfo.isFeatured()==true)
       {
           holder.isVerified.setText("Verified");
           holder.isVerified.setTextColor(context.getResources().getColor(R.color.green));
       }
      //holder.companyLogo.setImageBitmap(bmp);

    }

    @Override
    public int getItemCount() {
        return jobList.getJobInfoArrayList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView jobTitle,companyName,deadline,experience,isVerified,salaryTV;
        private ImageView companyLogo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jobTitle=itemView.findViewById(R.id.jobTitleTV);
            companyName=itemView.findViewById(R.id.companyNameTV);
            deadline=itemView.findViewById(R.id.deadLineTV);
            experience=itemView.findViewById(R.id.experienceTV);
            companyLogo=itemView.findViewById(R.id.companyIV);
            isVerified=itemView.findViewById(R.id.verifiedTV);
            salaryTV=itemView.findViewById(R.id.salaryTV);

        }
    }
}
