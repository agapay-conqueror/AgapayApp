package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class Socialwork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socialwork);

        PhotoView photoView = findViewById(R.id.socialwork);
        PhotoView photoView1 =findViewById(R.id.social);
        PhotoView photoView2 =findViewById(R.id.social1);
        PhotoView photoView3 =findViewById(R.id.social2);
        PhotoView photoView4 =findViewById(R.id.work);
        PhotoView photoView5 =findViewById(R.id.work1);

        photoView.setImageResource(R.drawable.socialwork);
        photoView1.setImageResource(R.drawable.social1);
        photoView2.setImageResource(R.drawable.social2);
        photoView3.setImageResource(R.drawable.social3);
        photoView4.setImageResource(R.drawable.work);
        photoView5.setImageResource(R.drawable.work1);
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),College.class));
    }
}