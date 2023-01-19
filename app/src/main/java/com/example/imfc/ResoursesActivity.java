package com.example.imfc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ResoursesActivity extends AppCompatActivity implements  View.OnClickListener{
    private CardView avt,auditorium,ughall,pghall,mchall,jubleehall,openair,addhall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resourses);
        avt= (CardView) findViewById(R.id.avt);
        auditorium= (CardView) findViewById(R.id.auditorium);
        ughall=(CardView) findViewById(R.id.ughall);
        pghall=(CardView) findViewById(R.id.pghall);
        mchall=(CardView) findViewById(R.id.mchall);
        jubleehall=(CardView) findViewById(R.id.jubleehall);
        openair=(CardView) findViewById(R.id.openair);
        addhall=(CardView)findViewById(R.id.addhall);

        avt.setOnClickListener(this);
        auditorium.setOnClickListener(this);
        ughall.setOnClickListener(this);
        pghall.setOnClickListener(this);
        mchall.setOnClickListener(this);
        jubleehall.setOnClickListener(this);
        openair.setOnClickListener(this);
        addhall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.avt:
                i = new Intent(this, Avt.class);
                startActivity(i);
                break;
            case R.id.auditorium:
                i = new Intent(this, auditorium.class);
                startActivity(i);
                break;
            case R.id.ughall:
                i = new Intent(this, UgHall.class);
                startActivity(i);
                break;
            case R.id.pghall:
                i = new Intent(this, PgHall.class);
                startActivity(i);
                break;
            case R.id.mchall:
                i = new Intent(this, madameCurie.class);
                startActivity(i);
                break;
            case R.id.jubleehall:
                i = new Intent(this, JubleeHall.class);
                startActivity(i);
                break;
            case R.id.openair:
                i = new Intent(this, conventionCenter.class);
                startActivity(i);
                break;
            case R.id.addhall:
                i = new Intent(this,ResourseAdd.class);
                startActivity(i);
                break;
            default:break;

        }

    }
}
