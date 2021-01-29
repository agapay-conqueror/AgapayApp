package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Philippines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philippines);

        PhotoView philippines = findViewById(R.id.philippines);
        PhotoView philippines1 = findViewById(R.id.philippines1);

        philippines1.setImageResource(R.drawable.philippines1);
    }
}