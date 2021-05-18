package com.example.dietas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityAdel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_adel);

        Button btnfa = (Button) findViewById(R.id.btnfa);
        btnfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MainActivityDieta.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btnmed = (Button) findViewById(R.id.btnmed);
        btnmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),MainActivityDieta.class);
                startActivityForResult(intent, 0);
            }
        });


        Button btnextre = (Button) findViewById(R.id.btnextre);
        btnextre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),MainActivityDieta.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}