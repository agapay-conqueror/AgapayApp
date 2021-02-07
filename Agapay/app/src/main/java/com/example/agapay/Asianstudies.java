package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class Asianstudies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asianstudies);

        PhotoView photoView = findViewById(R.id.asia);
        PhotoView photoView1 = findViewById(R.id.asia1);
        PhotoView photoView2 = findViewById(R.id.sumer);
        PhotoView photoView3 = findViewById(R.id.babylon);
        PhotoView photoView4 = findViewById(R.id.assyria);
        PhotoView photoView5 = findViewById(R.id.culture);
        PhotoView photoView6 = findViewById(R.id.culture1);
        PhotoView photoView7 = findViewById(R.id.culture2);

        photoView.setImageResource(R.drawable.asia);
        photoView1.setImageResource(R.drawable.asia1);
        photoView2.setImageResource(R.drawable.sumer);
        photoView3.setImageResource(R.drawable.babylon);
        photoView4.setImageResource(R.drawable.assyria);
        photoView5.setImageResource(R.drawable.culture);
        photoView6.setImageResource(R.drawable.culture1);
        photoView7.setImageResource(R.drawable.culture2);
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),Highschool.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }

    public void btn_QuizAsianstudies(View view) {
        startActivity(new Intent(getApplicationContext(), QuizAsianstudies.class));
    }
}