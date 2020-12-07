package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class PhilippineMap extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_philippine_map);

        PhotoView photoView =findViewById(R.id.imageview);

        photoView.setImageResource(R.drawable.philippinesmap);

    }
}