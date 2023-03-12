package com.smltd.smplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class KhsPlayerActivity extends AppCompatActivity {

    WebView khsWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khs_player);
        getSupportActionBar().setTitle("Play");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        khsWeb = findViewById(R.id.khsWeb);

        khsWeb.getSettings().setJavaScriptEnabled(true);
        khsWeb.loadUrl(KhsActivity.khsUrl);
    }
}