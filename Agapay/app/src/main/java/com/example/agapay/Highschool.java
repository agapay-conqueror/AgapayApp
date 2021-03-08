package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class Highschool extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highschool);


        Toast toast = Toast.makeText(this, "Click the Button Below to proceed!", LENGTH_LONG);
        toast.setGravity(Gravity.TOP | Gravity.START, 90, 90);
        toast.show();
    }



    public void btn_asian(View view) {
        startActivity(new Intent(getApplicationContext(),Asianstudies.class));
    }

    public void btn_world(View view) {
        startActivity(new Intent(getApplicationContext(),Worldhistory.class));
    }

    public void btn_economics(View view) {
        startActivity(new Intent(getApplicationContext(),Economics.class));
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }

    public void btn_contemporary(View view) {
        startActivity(new Intent(getApplicationContext(),Contemporaryissue.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Home.class));
    }
}