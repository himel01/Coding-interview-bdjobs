package com.example.jobhuntjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JobDetailsActivity extends AppCompatActivity {
    private String title,name,date,instruction;
    private TextView titleTV,nameTV,dateTV,instructionTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_details);
        init();
        if(getIntent().getExtras()!=null)
        {
            title=getIntent().getExtras().getString("title");
            name=getIntent().getExtras().getString("date");
            date=getIntent().getExtras().getString("name");
            instruction=getIntent().getExtras().getString("instruction");
            titleTV.setText(title);
            nameTV.setText(name);
            dateTV.setText(date);
            instructionTV.setText(instruction);
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