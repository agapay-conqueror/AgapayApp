package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class Contemporaryissue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contemporaryissue);

        PhotoView photoView = findViewById(R.id.issue);
        PhotoView photoView1 = findViewById(R.id.climate);
        PhotoView photoView2 = findViewById(R.id.waste);
        PhotoView photoView3 = findViewById(R.id.econ);
        PhotoView photoView4 =findViewById(R.id.social);

        photoView.setImageResource(R.drawable.issue);
        photoView1.setImageResource(R.drawable.climate);
        photoView2.setImageResource(R.drawable.waste);
        photoView3.setImageResource(R.drawable.econprob);
        photoView4.setImageResource(R.drawable.social);
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),Highschool.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }
}