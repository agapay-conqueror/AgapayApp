package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Elementary extends AppCompatActivity {
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elementary);
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
}