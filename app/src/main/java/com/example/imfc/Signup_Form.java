package com.example.imfc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Signup_Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup__form);
        getSupportActionBar().setTitle("IMFC SignIn");
        Button b1=(Button)findViewById(R.id.btn_register);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Signup_Form.this, "NEW USER REGISTERED", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Signup_Form.this, Login_form.class);
                startActivity(i);
            }
        });

    }
}
