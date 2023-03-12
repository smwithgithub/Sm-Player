package com.smltd.smplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class InnaActivity extends AppCompatActivity {

    LinearLayout innaYalla, innaHeaven, innaRuleta, innaAmazing, innaCola, innaGimme, innaMaza, innaNirvana, innaSean, innaTuManera;
    public static String innaUrl = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inna);

        getSupportActionBar().setTitle("Inna");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        innaYalla = findViewById(R.id.innaYalla);
        innaHeaven = findViewById(R.id.innaHeaven);
        innaRuleta = findViewById(R.id.innaRuleta);
        innaAmazing = findViewById(R.id.innaAmazing);
        innaCola = findViewById(R.id.innaCola);
        innaGimme = findViewById(R.id.innaGimme);
        innaMaza = findViewById(R.id.innaMaza);
        innaNirvana = findViewById(R.id.innaNirvana);
        innaSean = findViewById(R.id.innaSean);
        innaTuManera = findViewById(R.id.innaTuManera);

        /*====================*/
        innaYalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                innaUrl = "https://www.youtube.com/embed/i7wveOu5hkQ";
                Intent innaIntent = new Intent(InnaActivity.this, InnaPlayerActivity.class);
                startActivity(innaIntent);
            }
        });

        /*======================*/
        innaHeaven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                innaUrl = "https://www.youtube.com/embed/ZRkdyjJ_MdM";
                Intent innaIntent = new Intent(InnaActivity.this, InnaPlayerActivity.class);
                startActivity(innaIntent);
            }
        });

        /*====================*/
        innaRuleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                innaUrl = "https://www.youtube.com/embed/ax9ge-ymWIQ";
                Intent innaIntent = new Intent(InnaActivity.this, InnaPlayerActivity.class);
                startActivity(innaIntent);
            }
        });

        /*======================*/
        innaAmazing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                innaUrl = "https://www.youtube.com/embed/gKHe12T6GMY";
                Intent innaIntent = new Intent(InnaActivity.this, InnaPlayerActivity.class);
                startActivity(innaIntent);
            }
        });

        /*======================*/
        innaCola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                innaUrl = "https://www.youtube.com/embed/Yz2658gzOuM";
                Intent innaIntent = new Intent(InnaActivity.this, InnaPlayerActivity.class);
                startActivity(innaIntent);
            }
        });

        /*====================*/
        innaGimme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                innaUrl = "https://www.youtube.com/embed/Jr4TMIU9oQ4";
                Intent innaIntent = new Intent(InnaActivity.this, InnaPlayerActivity.class);
                startActivity(innaIntent);
            }
        });

        /*======================*/
        innaMaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                innaUrl = "https://www.youtube.com/embed/m_W5-0EY8Bk";
                Intent innaIntent = new Intent(InnaActivity.this, InnaPlayerActivity.class);
                startActivity(innaIntent);
            }
        });

        /*======================*/
        innaNirvana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                innaUrl = "https://www.youtube.com/embed/OfS1jFck8YQ";
                Intent innaIntent = new Intent(InnaActivity.this, InnaPlayerActivity.class);
                startActivity(innaIntent);
            }
        });

        /*====================*/
        innaSean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                innaUrl = "https://www.youtube.com/embed/8Fl6d_fSRNs";
                Intent innaIntent = new Intent(InnaActivity.this, InnaPlayerActivity.class);
                startActivity(innaIntent);
            }
        });

        /*======================*/
        innaTuManera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                innaUrl = "https://www.youtube.com/embed/jLS_Oz_ZffA";
                Intent innaIntent = new Intent(InnaActivity.this, InnaPlayerActivity.class);
                startActivity(innaIntent);
            }
        });


    }
}