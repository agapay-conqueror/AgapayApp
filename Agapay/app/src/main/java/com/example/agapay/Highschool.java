package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Highschool extends AppCompatActivity {
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highschool);

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
}