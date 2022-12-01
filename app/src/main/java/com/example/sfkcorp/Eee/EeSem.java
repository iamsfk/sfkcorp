package com.example.sfkcorp.Eee;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sfkcorp.EeEbook.eeesem1;
import com.example.sfkcorp.EeEbook.eeesem2;
import com.example.sfkcorp.EeEbook.eeesem3;
import com.example.sfkcorp.EeEbook.eeesem4;
import com.example.sfkcorp.EeEbook.eeesem5;
import com.example.sfkcorp.EeEbook.eeesem6;
import com.example.sfkcorp.EeEbook.eeesem7;
import com.example.sfkcorp.EeEbook.eeesem8;
import com.example.sfkcorp.R;

public class EeSem extends AppCompatActivity implements View.OnClickListener {
    ImageView semo,semt,semth,semf,semfi,sems,semse,seme;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem);

        seme = findViewById(R.id.sem8);
        seme.setOnClickListener(this);
        semse = findViewById(R.id.sem7);
        semse.setOnClickListener(this);
        sems = findViewById(R.id.sem6);
        sems.setOnClickListener(this);
        semfi = findViewById(R.id.sem5);
        semfi.setOnClickListener(this);
        semf = findViewById(R.id.sem4);
        semf.setOnClickListener(this);
        semo = findViewById(R.id.sem1);
        semo.setOnClickListener(this);
        semt = findViewById(R.id.sem2);
        semt.setOnClickListener(this);
        semth = findViewById(R.id.sem3);
        semth.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {

            case R.id.sem1:
                intent = new Intent(this, eeesem1.class);
                startActivity(intent);
                break;
            case R.id.sem2:
                intent = new Intent(this,  eeesem2.class);
                startActivity(intent);
                break;
            case R.id.sem3:
                intent = new Intent(this,   eeesem3.class);
                startActivity(intent);
                break;
            case R.id.sem4:
                intent = new Intent(this,   eeesem4.class);
                startActivity(intent);
                break;
            case R.id.sem5:
                intent = new Intent(this,  eeesem5.class);
                startActivity(intent);
                break;
            case R.id.sem6:
                intent = new Intent(this,   eeesem6.class);
                startActivity(intent);
                break;
            case R.id.sem7:
                intent = new Intent(this,   eeesem7.class);
                startActivity(intent);
                break;
            case R.id.sem8:
                intent = new Intent(this,   eeesem8.class);
                startActivity(intent);
                break;
        }
    }
}