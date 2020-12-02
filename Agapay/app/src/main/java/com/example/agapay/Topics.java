package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class Topics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
    }

    public void btn_help(View view) {
        Toast toast = Toast.makeText(Topics.this,"Click the button bellow to proceed!",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP,0,250);
        toast.show();
    }
}