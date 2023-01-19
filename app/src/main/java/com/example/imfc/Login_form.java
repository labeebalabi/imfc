package com.example.imfc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        getSupportActionBar().setTitle("IMFC Login");
    }

        public void btn_signupForm (View v){
        Intent I=new Intent(this,Signup_Form.class);
        startActivity(I);

    }

        public void Loginform (View view){
            Toast.makeText(this, " Successfully Logged in", Toast.LENGTH_SHORT).show();
            Intent LoginScreen = new Intent(Login_form.this, MainActivity.class);
            startActivity(LoginScreen);
        }


}

