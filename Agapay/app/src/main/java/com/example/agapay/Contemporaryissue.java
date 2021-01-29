package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Contemporaryissue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contemporaryissue);

        PhotoView photoView = findViewById(R.id.issue);
        PhotoView photoView1 = findViewById(R.id.climate);

        photoView.setImageResource(R.drawable.issue);
        photoView1.setImageResource(R.drawable.climate);
    }
}