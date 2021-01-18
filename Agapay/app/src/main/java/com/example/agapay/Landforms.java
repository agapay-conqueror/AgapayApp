package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Landforms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landforms);

        PhotoView photoView = findViewById(R.id.landforms);
        PhotoView photoView1 = findViewById(R.id.apo);

        photoView.setImageResource(R.drawable.landforms);
        photoView1.setImageResource(R.drawable.apo);
    }
}