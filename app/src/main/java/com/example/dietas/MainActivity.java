package com.example.dietas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Animation ani1= AnimationUtils.loadAnimation(this,R.anim.logoarriba);


        TextView tlogo = findViewById(R.id.tlogo);
        ImageView imglogo = findViewById(R.id.dieta.png);

        tlogo.setAnimation(ani1);
        imglogo.setAnimation(ani1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,MainActivityInicio.class);
                startActivity(intent);
                finish();

            }
        },4500);
    }
}