package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class Economics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economics);

        PhotoView photoView =findViewById(R.id.economics);
        PhotoView photoView1 =findViewById(R.id.economics1);

        photoView.setImageResource(R.drawable.economics);
        photoView1.setImageResource(R.drawable.economics1);
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),Highschool.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }
}