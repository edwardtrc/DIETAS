package com.example.dietas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityMus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mus);


        Button btnfa1 = (Button) findViewById(R.id.btnfa1);
        btnfa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MainActivityEjercicio.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btnmed1 = (Button) findViewById(R.id.btnmed1);
        btnmed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),MainActivityEjercicio.class);
                startActivityForResult(intent, 0);
            }
        });


        Button btnextre1 = (Button) findViewById(R.id.btnextre1);
        btnextre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),MainActivityEjercicio.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}