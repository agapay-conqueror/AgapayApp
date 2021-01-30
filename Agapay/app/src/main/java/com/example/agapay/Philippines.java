package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.github.chrisbanes.photoview.PhotoView;

public class Philippines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philippines);

        PhotoView philippines = findViewById(R.id.philippines);
        PhotoView philippines1 = findViewById(R.id.philippines1);
        PhotoView flag = findViewById(R.id.flag);
        PhotoView flag1 = findViewById(R.id.flag1);
        PhotoView coat = findViewById(R.id.coat);
        PhotoView lupanghinirang =findViewById(R.id.lupanghinirang1);

        philippines.setImageResource(R.drawable.philippines);
        philippines1.setImageResource(R.drawable.philippines1);
        flag.setImageResource(R.drawable.flag);
        flag1.setImageResource(R.drawable.flag1);
        coat.setImageResource(R.drawable.coat);
        lupanghinirang.setImageResource(R.drawable.lupanghinirang1);

    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),Elementary.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }
}