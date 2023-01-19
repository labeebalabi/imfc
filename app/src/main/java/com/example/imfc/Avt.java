package com.example.imfc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Avt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avt);
    }
    public void booking (View v){
        Intent i= new Intent(this,booking.class);
        startActivity(i);
    }

    public void status(View view) {
        Intent i= new Intent(this,Status.class);
        startActivity(i);
    }
}
