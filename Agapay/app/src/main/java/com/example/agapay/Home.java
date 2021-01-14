package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.widget.Toast.*;

public class Home extends AppCompatActivity {
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button = (ImageButton) findViewById(R.id.btn_help);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    public void openDialog(){
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }


    public void btn_topics(View view){
        startActivity(new Intent(getApplicationContext(),Topics.class));
    }

    public void btn_phMap(View view){
        startActivity(new Intent(getApplicationContext(),PhilippineMap.class));
    }

    public void btn_videos(View view){
        startActivity(new Intent(getApplicationContext(),Videos.class));
    }
}