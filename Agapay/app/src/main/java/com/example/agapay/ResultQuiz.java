package com.example.agapay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quiz);
        TextView resultLabel =  (TextView) findViewById(R.id.resultLabel);
        TextView totalScoreLabel = (TextView) findViewById(R.id.totalScoreLabel);

        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);

        SharedPreferences settings = getSharedPreferences("quizApp", Context.MODE_PRIVATE);
        int totalScore = settings.getInt("totalScore", 0);
        totalScore += score;

        resultLabel.setText(score + " / 10");
        totalScoreLabel.setText("Total Score : " + totalScore);

        //update total score;.
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("totalScore", + totalScore);
        editor.commit();
    }

    public void btn_Tryagain(View view) {
        startActivity(new Intent(getApplicationContext(), QuizLandforms.class));
    }

    public void btn_Quit(View view) {
        startActivity(new Intent(getApplicationContext(), Elementary.class));
    }
}