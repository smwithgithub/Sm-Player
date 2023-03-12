package com.smltd.smplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class KhsActivity extends AppCompatActivity {

    LinearLayout khsCounting, khsLetMe, khsSorry, khsBeauty, khsStayHigh, khsStay, khsPerfect, khsHalsey, khsSomething, khsDusk;
    public static String khsUrl = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khs);

        getSupportActionBar().setTitle("KHS cover");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        khsCounting = findViewById(R.id.khsCounting);
        khsLetMe = findViewById(R.id.khsLetMe);
        khsSorry = findViewById(R.id.khsSorry);
        khsBeauty = findViewById(R.id.khsBeauty);
        khsStayHigh = findViewById(R.id.khsStayHigh);
        khsStay = findViewById(R.id.khsStay);
        khsPerfect = findViewById(R.id.khsPerfect);
        khsHalsey = findViewById(R.id.khsHalsey);
        khsSomething = findViewById(R.id.khsSomething);
        khsDusk = findViewById(R.id.khsDusk);

        /*====================*/
        khsCounting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                khsUrl = "https://www.youtube.com/embed/cSLAO7zxS2M";
                Intent khsIntent = new Intent(KhsActivity.this, KhsPlayerActivity.class);
                startActivity(khsIntent);
            }
        });

        /*======================*/
        khsLetMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                khsUrl = "https://www.youtube.com/embed/ApX3KeY6QfQ";
                Intent khsIntent = new Intent(KhsActivity.this, KhsPlayerActivity.class);
                startActivity(khsIntent);
            }
        });

        /*====================*/
        khsSorry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                khsUrl = "https://www.youtube.com/embed/AD6yT4HmShI";
                Intent khsIntent = new Intent(KhsActivity.this, KhsPlayerActivity.class);
                startActivity(khsIntent);
            }
        });

        /*======================*/
        khsBeauty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                khsUrl = "https://www.youtube.com/embed/n-BXNXvTvV4";
                Intent khsIntent = new Intent(KhsActivity.this, KhsPlayerActivity.class);
                startActivity(khsIntent);
            }
        });

        /*======================*/
        khsStayHigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                khsUrl = "https://www.youtube.com/embed/ARO82lUakMw";
                Intent khsIntent = new Intent(KhsActivity.this, KhsPlayerActivity.class);
                startActivity(khsIntent);
            }
        });

        /*====================*/
        khsStay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                khsUrl = "https://www.youtube.com/embed/uwxJfj1I8_M";
                Intent khsIntent = new Intent(KhsActivity.this, KhsPlayerActivity.class);
                startActivity(khsIntent);
            }
        });

        /*======================*/
        khsPerfect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                khsUrl = "https://www.youtube.com/embed/AAsDUIxuPzE";
                Intent khsIntent = new Intent(KhsActivity.this, KhsPlayerActivity.class);
                startActivity(khsIntent);
            }
        });

        /*======================*/
        khsHalsey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                khsUrl = "https://www.youtube.com/embed/4qXjUC42YWE";
                Intent khsIntent = new Intent(KhsActivity.this, KhsPlayerActivity.class);
                startActivity(khsIntent);
            }
        });

        /*====================*/
        khsSomething.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                khsUrl = "https://www.youtube.com/embed/AVPkGuodyVk";
                Intent khsIntent = new Intent(KhsActivity.this, KhsPlayerActivity.class);
                startActivity(khsIntent);
            }
        });

        /*======================*/
        khsDusk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                khsUrl = "https://www.youtube.com/embed/adfcVmu1bmM";
                Intent khsIntent = new Intent(KhsActivity.this, KhsPlayerActivity.class);
                startActivity(khsIntent);
            }
        });

    }
}