package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class Pdc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdc);

        PhotoView pdc = findViewById(R.id.pdc);
        PhotoView pdc1 = findViewById(R.id.pdc1);
        PhotoView manufacturing = findViewById(R.id.manufacturing);
        PhotoView tourism = findViewById(R.id.tourism);
        PhotoView tourism1 = findViewById(R.id.tourism1);
        PhotoView tourism2 = findViewById(R.id.tourism2);
        PhotoView bpo = findViewById(R.id.bpo);
        PhotoView infrastructure = findViewById(R.id.infrastructure);
        PhotoView agribusiness = findViewById(R.id.agribusiness);

        pdc.setImageResource(R.drawable.pdc);
        pdc1.setImageResource(R.drawable.pdc1);
        manufacturing.setImageResource(R.drawable.manufacturing);
        tourism.setImageResource(R.drawable.tourism);
        tourism1.setImageResource(R.drawable.tourism1);
        tourism2.setImageResource(R.drawable.tourism2);
        bpo.setImageResource(R.drawable.bpo);
        infrastructure.setImageResource(R.drawable.infrastructure);
        agribusiness.setImageResource(R.drawable.agribusiness);

    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),Elementary.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }
}