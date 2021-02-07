package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class Sociology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sociology);

        PhotoView photoView = findViewById(R.id.sociology);
        PhotoView photoView1 = findViewById(R.id.matter);
        PhotoView photoView2 = findViewById(R.id.status);
        PhotoView photoView3 = findViewById(R.id.hierarchy);
        PhotoView photoView4 = findViewById(R.id.rehabilitaion);
        PhotoView photoView5 = findViewById(R.id.neo);

        photoView.setImageResource(R.drawable.sociology);
        photoView1.setImageResource(R.drawable.matter);
        photoView2.setImageResource(R.drawable.status);
        photoView3.setImageResource(R.drawable.heirarchy);
        photoView4.setImageResource(R.drawable.rehabilitation);
        photoView5.setImageResource(R.drawable.neo);
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),College.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }

    public void btn_QuizSociology(View view) {
        startActivity(new Intent(getApplicationContext(), QuizSociology.class));
    }
}