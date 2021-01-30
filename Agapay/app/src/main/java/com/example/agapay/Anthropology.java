package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.chrisbanes.photoview.PhotoView;

public class Anthropology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anthropology);

        PhotoView photoView =findViewById(R.id.anthropology);
        PhotoView photoView1 =findViewById(R.id.imperialism);
        PhotoView photoView2 =findViewById(R.id.imperialism1);
        PhotoView photoView3 =findViewById(R.id.imperialism2);
        PhotoView photoView4 =findViewById(R.id.imperialism3);
        PhotoView photoView5 =findViewById(R.id.anthro);
        PhotoView photoView6 =findViewById(R.id.anthro1);

        photoView.setImageResource(R.drawable.anthropology);
        photoView1.setImageResource(R.drawable.imperialism);
        photoView2.setImageResource(R.drawable.imperialism1);
        photoView3.setImageResource(R.drawable.imperialism2);
        photoView4.setImageResource(R.drawable.imperialism3);
        photoView5.setImageResource(R.drawable.anthro);
        photoView6.setImageResource(R.drawable.anthro1);
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),College.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }
}