package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class Topics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);


        Toast toast = Toast.makeText(this, "Click the Button Below to proceed!", LENGTH_LONG);
        toast.setGravity(Gravity.TOP | Gravity.START, 90, 90);
        toast.show();
    }


    public void btn_elementary(View view) {
        startActivity(new Intent(getApplicationContext(),Elementary.class));
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),Home.class));
    }

    public void btn_highshcool(View view) {
        startActivity(new Intent(getApplicationContext(),Highschool.class));
    }

    public void btn_college(View view) {
        startActivity(new Intent(getApplicationContext(),College.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Home.class));
    }
}