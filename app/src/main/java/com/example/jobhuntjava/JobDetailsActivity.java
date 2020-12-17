package com.example.jobhuntjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JobDetailsActivity extends AppCompatActivity {
    private String title,name,date,instruction,first,last,newDate;
    private TextView titleTV,nameTV,dateTV,instructionTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_details);
        init();
        if(getIntent().getExtras()!=null)
        {
            title=getIntent().getExtras().getString("title");
            date=getIntent().getExtras().getString("date");
            name=getIntent().getExtras().getString("name");
            instruction=getIntent().getExtras().getString("instruction");

            first=date.substring(0,8);
            last=date.substring(date.length()-5);
            newDate=first.concat(",".concat(last));

            titleTV.setText("Title: "+title);
            nameTV.setText("Company: "+name);
            dateTV.setText("Last Date: "+newDate);
            instructionTV.setText("Instruction: "+instruction);
        }
    }

    private void init() {
        titleTV=findViewById(R.id.titleTV);
        nameTV=findViewById(R.id.nameTV);
        dateTV=findViewById(R.id.deadLineTV);
        instructionTV=findViewById(R.id.instructionTV);
    }

    public void back(View view) {
        onBackPressed();
    }
}