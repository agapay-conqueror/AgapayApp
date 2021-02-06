package com.example.agapay;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ResultQuiz extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quiz);
        TextView resultLabel =  (TextView) findViewById(R.id.resultLabel);

        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);




        resultLabel.setText(score + " / 10");

    }

    public void btn_Tryagain(View view) {
        startActivity(new Intent(getApplicationContext(), QuizLandforms.class));
    }

    public void btn_Quit(View view) {
        startActivity(new Intent(getApplicationContext(), Elementary.class));
    }
}