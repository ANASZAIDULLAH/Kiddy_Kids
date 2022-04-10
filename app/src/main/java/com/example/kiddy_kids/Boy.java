package com.example.kiddy_kids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Boy extends AppCompatActivity {
    CardView c1,c2,c3, c4, c5, c6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boy);


        c1 = (CardView) findViewById(R.id.c1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Oneyear.class);
            }
        });

        c2 = (CardView) findViewById(R.id.c2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Twoyear.class);
            }
        });

        c3 = (CardView) findViewById(R.id.c3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Threeyear.class);
            }
        });

        c4 = (CardView) findViewById(R.id.c4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Fouryear.class);
            }
        });

        c5 = (CardView) findViewById(R.id.c5);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Fiveyear.class);
            }
        });


        c6 = (CardView) findViewById(R.id.c6);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),sixyear.class);
            }
        });
    }



}