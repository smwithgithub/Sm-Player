package com.smltd.smplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout alanActivity, khsActivity, innaActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alanActivity = findViewById(R.id.alenFile);
        khsActivity = findViewById(R.id.khsFile);
        innaActivity = findViewById(R.id.innaFile);


        alanActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent alanIntent = new Intent(MainActivity.this, AlanActivity.class);
                startActivity(alanIntent);

            }
        });


        khsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent khsIntent = new Intent(MainActivity.this, KhsActivity.class);
                startActivity(khsIntent);

            }
        });

        innaActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent innaIntent = new Intent(MainActivity.this, InnaActivity.class);
                startActivity(innaIntent);

            }
        });



    }
}