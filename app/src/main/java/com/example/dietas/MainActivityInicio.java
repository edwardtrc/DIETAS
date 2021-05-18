package com.example.dietas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inicio);


        Button btnadel = (Button) findViewById(R.id.btnadel);
        btnadel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MainActivityAdel.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btnmus = (Button) findViewById(R.id.btnmus);
        btnmus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),MainActivityMus.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btnimc = (Button) findViewById(R.id.btnimc);
        btnimc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnimc=getPackageManager().getLaunchIntentForPackage("com.example.imccalculadora");
                startActivity(btnimc);
            }
        });

    }
}