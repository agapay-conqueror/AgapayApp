package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class Worldhistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worldhistory);

        PhotoView photoView = findViewById(R.id.world);
        PhotoView photoView1 = findViewById(R.id.world1);
        PhotoView photoView2 = findViewById(R.id.pre);

        photoView.setImageResource(R.drawable.world);
        photoView1.setImageResource(R.drawable.world1);
        photoView2.setImageResource(R.drawable.pre);
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),Highschool.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }
}