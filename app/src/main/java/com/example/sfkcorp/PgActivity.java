package com.example.sfkcorp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class PgActivity extends AppCompatActivity implements View.OnClickListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;




    RelativeLayout mcom,msc,bed,ma;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pg);

        //drawerLayout = findViewById(R.id.drawerlayout);
        // navigationView =(NavigationView) findViewById(R.id.navigationview);


        toolbar = findViewById(R.id.toolbar);
        mcom = findViewById(R.id.mcom);
        mcom.setOnClickListener(this);
        ma = findViewById(R.id.ma);
        ma.setOnClickListener(this);
        msc = findViewById(R.id.msc);
        msc.setOnClickListener(this);
        bed = findViewById(R.id.bed);
        bed.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {


            case R.id.mcom:
                Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
             break;
            case R.id.ma:
                Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.msc:
                Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bed:
                Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}