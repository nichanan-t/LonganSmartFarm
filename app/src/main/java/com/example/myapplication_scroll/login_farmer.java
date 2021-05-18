package com.example.myapplication_scroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login_farmer extends AppCompatActivity {
    EditText user, pass;
    Button login, fb, gg, regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_farmer);
        login = (Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeFarmer = new Intent(login_farmer.this,MainActivity.class);
                startActivity(HomeFarmer);
            }
        });

        fb = (Button)findViewById(R.id.fb);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeFarmer = new Intent(login_farmer.this,MainActivity.class);
                startActivity(HomeFarmer);
            }
        });

        gg = (Button)findViewById(R.id.gg);

        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeFarmer = new Intent(login_farmer.this,MainActivity.class);
                startActivity(HomeFarmer);
            }
        });

        regis = (Button)findViewById(R.id.regis);

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regisFarmer = new Intent(login_farmer.this,regisFarmer.class);
                startActivity(regisFarmer);
            }
        });
    }
}