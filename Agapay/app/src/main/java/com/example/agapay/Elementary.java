package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class Elementary extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elementary);

        Toast toast = Toast.makeText(this, "Click the Button Below to proceed!", LENGTH_LONG);
        toast.setGravity(Gravity.TOP | Gravity.START, 90, 90);
        toast.show();

    }



    public void btn_landforms(View view) {
        startActivity(new Intent(getApplicationContext(),Landforms.class));
    }

    public void btn_population(View view) {
        startActivity(new Intent(getApplicationContext(),Population.class));
    }

    public void btn_pdc(View view) {
        startActivity(new Intent(getApplicationContext(),Pdc.class));
    }

    public void btn_philippines(View view) {
        startActivity(new Intent(getApplicationContext(),Philippines.class));
    }

    public void btn_nationalism(View view) {
        startActivity(new Intent(getApplicationContext(),Nationalism.class));
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Home.class));
    }
}