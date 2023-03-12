package com.smltd.smplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class InnaPlayerActivity extends AppCompatActivity {

    WebView innaweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inna_player);
        getSupportActionBar().setTitle("Play");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        innaweb = findViewById(R.id.innaWeb);

        innaweb.getSettings().setJavaScriptEnabled(true);
        innaweb.loadUrl(InnaActivity.innaUrl);
    }
}