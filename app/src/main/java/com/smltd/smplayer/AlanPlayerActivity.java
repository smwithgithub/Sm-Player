package com.smltd.smplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class AlanPlayerActivity extends AppCompatActivity {

    WebView alanWeb ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alan_player);
        getSupportActionBar().setTitle("Play");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        alanWeb = findViewById(R.id.alanWeb);

        alanWeb.getSettings().setJavaScriptEnabled(true);
        alanWeb.loadUrl(AlanActivity.alanUrl);
    }
}