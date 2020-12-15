package com.example.jobhuntjava;

public class JobDetails {
    private String Title;
    private String LastDate;
    private String CompanyName;
    private String ApplyInstruction;

    public JobDetails(String title, String lastDate, String companyName, String applyInstruction) {
        Title = title;
        LastDate = lastDate;
        CompanyName = companyName;
        ApplyInstruction = applyInstruction;
    }

    public String getTitle() {
        return Title;
    }

    public String getLastDate() {
        return LastDate;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public String getApplyInstruction() {
        return ApplyInstruction;
    }
}
