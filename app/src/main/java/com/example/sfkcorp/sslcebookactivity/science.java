package com.example.sfkcorp.sslcebookactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sfkcorp.CivilEbook.CEbookActvity2;
import com.example.sfkcorp.R;

public class science extends AppCompatActivity implements View.OnClickListener {
    Button button, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {

            case R.id.button5:
                intent = new Intent(this, Pcmb.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(this, CEbookActvity2.class);
                startActivity(intent);
                break;
        }
    }
}