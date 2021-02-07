package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class Politics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politics);

        PhotoView photoView = findViewById(R.id.politics);
        PhotoView photoView1 = findViewById(R.id.politics1);
        PhotoView photoView2 = findViewById(R.id.legislative);
        PhotoView photoView3 = findViewById(R.id.executive);
        PhotoView photoView4 = findViewById(R.id.judiciary);

        photoView.setImageResource(R.drawable.politics);
        photoView1.setImageResource(R.drawable.politics1);
        photoView2.setImageResource(R.drawable.legislative);
        photoView3.setImageResource(R.drawable.executive);
        photoView4.setImageResource(R.drawable.judiciary);
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),College.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }

    public void btn_QuizPolitics(View view) {
        startActivity(new Intent(getApplicationContext(), QuizPolitics.class));
    }
}