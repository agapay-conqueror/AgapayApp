package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class College extends AppCompatActivity {
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college);
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
}