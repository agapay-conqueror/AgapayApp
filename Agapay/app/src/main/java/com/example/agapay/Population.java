package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class Population extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_population);

        PhotoView population = findViewById(R.id.population);
        PhotoView population1 = findViewById(R.id.population1);
        PhotoView ph = findViewById(R.id.ph);

        population.setImageResource(R.drawable.population);
        population1.setImageResource(R.drawable.population1);
        ph.setImageResource(R.drawable.ph);
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),Elementary.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }

    public void btn_QuizPopulation(View view) {
        startActivity(new Intent(getApplicationContext(), QuizPopulation.class));
    }
}