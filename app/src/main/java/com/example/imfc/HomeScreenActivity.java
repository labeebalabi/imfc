package com.example.imfc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeScreenActivity extends AppCompatActivity  implements  View.OnClickListener {
    private CardView resourse, event, report;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //defining cards
        resourse = (CardView) findViewById(R.id.resourses);
        event = (CardView) findViewById(R.id.event);
        report = (CardView) findViewById(R.id.report);
        //add click listener
        resourse.setOnClickListener(this);
        event.setOnClickListener(this);
        report.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.resourses:
                i = new Intent(this, ResoursesActivity.class);
                startActivity(i);
                break;
            case R.id.event:
                i = new Intent(this, EventActivity.class);
                startActivity(i);
                break;
            case R.id.report:
                i = new Intent(this, ReportActivity.class);
                startActivity(i);
                break;
            default:
                break;

        }
    }
}