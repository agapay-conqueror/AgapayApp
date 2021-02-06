package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class Nationalism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nationalism);

        PhotoView photoView = findViewById(R.id.nationalism);
        PhotoView photoView1 = findViewById(R.id.nationalism1);
        PhotoView photoView2 = findViewById(R.id.nationalism2);
        PhotoView photoView3 = findViewById(R.id.economy);
        PhotoView photoView4 = findViewById(R.id.secularization);


        photoView.setImageResource(R.drawable.nationalism);
        photoView1.setImageResource(R.drawable.nationalism1);
        photoView2.setImageResource(R.drawable.nationalism2);
        photoView3.setImageResource(R.drawable.economy);
        photoView4.setImageResource(R.drawable.secularization);

    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),Elementary.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }

    public void btn_QuizNationalism(View view) {
        startActivity(new Intent(getApplicationContext(), QuizNationalism.class));
    }
}