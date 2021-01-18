package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Landforms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landforms);

        PhotoView landforms = findViewById(R.id.landforms);
        PhotoView apo = findViewById(R.id.apo);
        PhotoView dulang = findViewById(R.id.dulang);
        PhotoView pulag = findViewById(R.id.pulag);


        landforms.setImageResource(R.drawable.landforms);
        apo.setImageResource(R.drawable.apo);
        dulang.setImageResource(R.drawable.dulang);
        pulag.setImageResource(R.drawable.pulag);
    }
}