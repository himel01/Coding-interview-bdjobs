package com.example.jobhuntjava;

public class JobInfo {
    private String jobTitle;
    private String deadline;
    private String recruitingCompanysProfile;
    private JobDetails jobDetails;
    private String logo;
    private boolean IsFeatured;
    private int minExperience;
    private int maxExperience;
    private String minSalary;
    private String maxSalary;

    public JobInfo(String jobTitle, String deadline, String recruitingCompanysProfile, JobDetails jobDetails, String logo, boolean isFeatured, int minExperience, int maxExperience, String minSalary, String maxSalary) {
        this.jobTitle = jobTitle;
        this.deadline = deadline;
        this.recruitingCompanysProfile = recruitingCompanysProfile;
        this.jobDetails = jobDetails;
        this.logo = logo;
        IsFeatured = isFeatured;
        this.minExperience = minExperience;
        this.maxExperience = maxExperience;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getRecruitingCompanysProfile() {
        return recruitingCompanysProfile;
    }

    public JobDetails getJobDetails() {
        return jobDetails;
    }

    public String getLogo() {
        return logo;
    }

    public boolean isFeatured() {
        return IsFeatured;
    }

    public int getMinExperience() {
        return minExperience;
    }

    public int getMaxExperience() {
        return maxExperience;
    }

    public String getMinSalary() {
        return minSalary;
    }

    public String getMaxSalary() {
        return maxSalary;
    }
}
