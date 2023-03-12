package com.smltd.smplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AlanActivity extends AppCompatActivity {
    LinearLayout alanFaded, alanAlone, alanIgnite, alanDarkside, alanFalling, alanParadise, alanIselin, alanSpectre, alanLost, alanUnity;
    public static String alanUrl = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alan);

        getSupportActionBar().setTitle("Alan Walker");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        alanFaded = findViewById(R.id.alanFaded);
        alanAlone = findViewById(R.id.alanAlone);
        alanIgnite = findViewById(R.id.alanIgnite);
        alanDarkside = findViewById(R.id.alanDarkside);
        alanFalling = findViewById(R.id.alanFalling);
        alanParadise = findViewById(R.id.alanParadise);
        alanIselin = findViewById(R.id.alanIselin);
        alanSpectre = findViewById(R.id.alanSpectre);
        alanLost = findViewById(R.id.alanLost);
        alanUnity = findViewById(R.id.alanUnity);

        /*====================*/
        alanFaded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alanUrl = "https://www.youtube.com/embed/60ItHLz5WEA";
                Intent fadedIntent = new Intent(AlanActivity.this, AlanPlayerActivity.class);
                startActivity(fadedIntent);
            }
        });

        /*======================*/
        alanAlone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alanUrl = "https://www.youtube.com/embed/HhjHYkPQ8F0";
                Intent fadedIntent = new Intent(AlanActivity.this, AlanPlayerActivity.class);
                startActivity(fadedIntent);
            }
        });

        /*====================*/
        alanIgnite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alanUrl = "https://www.youtube.com/embed/23oxCvVhvF4";
                Intent fadedIntent = new Intent(AlanActivity.this, AlanPlayerActivity.class);
                startActivity(fadedIntent);
            }
        });

        /*======================*/
        alanDarkside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alanUrl = "https://www.youtube.com/embed/M-P4QBt-FWw";
                Intent fadedIntent = new Intent(AlanActivity.this, AlanPlayerActivity.class);
                startActivity(fadedIntent);
            }
        });

        /*======================*/
        alanFalling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alanUrl = "https://www.youtube.com/embed/tQGfIcWAu6k";
                Intent fadedIntent = new Intent(AlanActivity.this, AlanPlayerActivity.class);
                startActivity(fadedIntent);
            }
        });

        /*====================*/
        alanParadise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alanUrl = "https://www.youtube.com/embed/stURztsCOZs";
                Intent fadedIntent = new Intent(AlanActivity.this, AlanPlayerActivity.class);
                startActivity(fadedIntent);
            }
        });

        /*======================*/
        alanIselin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alanUrl = "https://www.youtube.com/embed/4u-D0Lm5PNc";
                Intent fadedIntent = new Intent(AlanActivity.this, AlanPlayerActivity.class);
                startActivity(fadedIntent);
            }
        });

        /*======================*/
        alanSpectre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alanUrl = "https://www.youtube.com/embed/wJnBTPUQS5A";
                Intent fadedIntent = new Intent(AlanActivity.this, AlanPlayerActivity.class);
                startActivity(fadedIntent);
            }
        });

        /*====================*/
        alanLost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alanUrl = "https://www.youtube.com/embed/-Ed-GNq2EyU";
                Intent fadedIntent = new Intent(AlanActivity.this, AlanPlayerActivity.class);
                startActivity(fadedIntent);
            }
        });

        /*======================*/
        alanUnity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alanUrl = "https://www.youtube.com/embed/n36bfqEsi4A";
                Intent fadedIntent = new Intent(AlanActivity.this, AlanPlayerActivity.class);
                startActivity(fadedIntent);
            }
        });




    }
}