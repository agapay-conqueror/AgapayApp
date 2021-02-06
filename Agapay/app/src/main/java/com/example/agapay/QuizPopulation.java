package com.example.agapay;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class QuizPopulation extends AppCompatActivity {

    private TextView countLabel;
    private TextView questionLabel;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;

    private String rightAnswer;
    private int rightAnswerCount = 0;
    private int quizCount = 1;

    static final private int QUIZ_COUNT = 10;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {
            //{"Question", "Right Answer", "choice1", "choice2", "choice3"},
            {"In sociology, __________ refers to a collection of humans.", "Population", "Politics", "Statics", "Vaguely"},
            {"It is a social science which entails the statistical study of human populations.", "Demography", "Population", "Average", "Tax"},
            {"Guess the Province by the given Population: 617,301.", "Pasig City", "Cagayan de Oro", "Quezon City", "Antipolo"},
            {"Guess the Province by the given Population: 416,522.", "Pasay", "Iloilo", "Davao", "Bacolod City"},
            {"Guess the Province by the given Population: 2,761,720.", "Quezon City", "Taguig", "San Pedro", "San Fernando"},
            {"Guess the Province by the given Population: 445,103.", "Cagayan de Oro", "Makati City", "Bacoor", "Dagupan City"},
            {"How many years is the median age of the Philippines?", "25.7 years", "27 years", "27.5 years", "27.9 years"},
            {"The total land area of the Philippines is....", "298,170 km2", "200,789 km2", "234,678 km2", "189,456 km2"},
            {"Guess the Province by the given Population: 356, 974.", "Bacoor", "Calamba", "Mandaue City", "Butuan"},
            {"Guess the Province by the given Population: 454,150.", "Mansilingan", "Iligan", "Binan", "Angeles City"}

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_population);

        countLabel = (TextView) findViewById(R.id.countLabel);
        questionLabel = (TextView) findViewById(R.id.questionLabel);
        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);
        choice4 = (Button) findViewById(R.id.choice4);

        //Create quizArray from quizData.
        for (int i = 0; i < quizData.length; i++) {
            //prepare Array.
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(quizData[i][0]); //QUESTION
            tmpArray.add(quizData[i][1]); //RIGHT ANSWER
            tmpArray.add(quizData[i][2]); //CHOICE1
            tmpArray.add(quizData[i][3]); //CHOICE2
            tmpArray.add(quizData[i][4]); //CHOICE3

            //Add tmpArray to quiz Array.
            quizArray.add(tmpArray);
        }
        showNextQuiz();
    }

    public void showNextQuiz() {
        countLabel.setText("Q" + quizCount);

        Random random = new Random();
        int randomNum = random.nextInt(quizArray.size());

        ArrayList<String> quiz = quizArray.get(randomNum);

        questionLabel.setText(quiz.get(0));
        rightAnswer = quiz.get(1);

        //Remove "QUESTION" from quiz and shuffle
        quiz.remove(0);
        Collections.shuffle(quiz);

        //set choices
        choice1.setText(quiz.get(0));
        choice2.setText(quiz.get(1));
        choice3.setText(quiz.get(2));
        choice4.setText(quiz.get(3));

        //Remove this quiz from quizArray.
        quizArray.remove(randomNum);
    }

    public void checkAnswer(View view) {
        //get pushed Button
        Button answerBtn = (Button) findViewById(view.getId());
        String btnText = answerBtn.getText().toString();

        String alertTitle;

        if (btnText.equals(rightAnswer)) {
            //CORRECT
            alertTitle = "Correct!";
            rightAnswerCount++;
        } else {
            //WRONG
            alertTitle = "Wrong...";
        }

        //Create Dialog.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(alertTitle);
        builder.setMessage("Answer : " + rightAnswer);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (quizCount == QUIZ_COUNT) {
                    //show result.
                    Intent intent = new Intent(getApplicationContext(), ResultQuiz.class);
                    intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
                    startActivity(intent);
                } else {
                    quizCount++;
                    showNextQuiz();
                }
            }
        });
        builder.setCancelable(false);
        builder.show();
    }

    public void btn_Exit(View view) {
        startActivity(new Intent(getApplicationContext(), Elementary.class));
    }
}