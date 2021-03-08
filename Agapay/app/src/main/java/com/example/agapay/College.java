package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class College extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college);


        Toast toast = Toast.makeText(this, "Click the Button Below to proceed!", LENGTH_LONG);
        toast.setGravity(Gravity.TOP | Gravity.START, 90, 90);
        toast.show();

        }


    public void btn_politics(View view) {
        startActivity(new Intent(getApplicationContext(),Politics.class));
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }

    public void btn_sociology(View view) {
        startActivity(new Intent(getApplicationContext(),Sociology.class));
    }

    public void btn_anthropology(View view) {
        startActivity(new Intent(getApplicationContext(),Anthropology.class));
    }

    public void btn_socialwork(View view) {
        startActivity(new Intent(getApplicationContext(),Socialwork.class));
    }

    public void btn_development(View view) {
        startActivity(new Intent(getApplicationContext(),Developmentstudies.class));
    }

    public void btn_home(View view) {
        startActivity(new Intent(getApplicationContext(),Home.class));
    }
}