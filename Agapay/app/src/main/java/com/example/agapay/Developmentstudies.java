package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class Developmentstudies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developmentstudies);

        PhotoView photoView =findViewById(R.id.ds);
        PhotoView photoView1 =findViewById(R.id.mod);

        photoView.setImageResource(R.drawable.ds);
        photoView1.setImageResource(R.drawable.mod);
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),College.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }
}