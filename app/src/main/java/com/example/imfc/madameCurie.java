package com.example.imfc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class madameCurie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madame_curie);
    }
    public void booking (View v){
        Intent i= new Intent(this,booking.class);
        startActivity(i);
    }
}
