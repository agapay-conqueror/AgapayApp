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

public class QuizPdc extends AppCompatActivity {

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
            {"Refers to agriculture-related activities that put farmers, processors, distributors and consumers.", "Agribusiness", "IT BPM kpo", "Tourism", "Manufacturing"},
            {"It comprises more than half of the Philippine's industrial sector.", "Manufacturing", "Infrastructure", "Tourism", "IT BPM KPO"},
            {"It is an important sector for Philippine economy.", "Tourism", "Manufacturing", "Agribusiness", "Logistics"},
            {"What is GDP?", "Gross Domestic Product", "Grass Domestic Product", "Gross Domestic Production", "Gross Domestic Producer"},
            {"In 2019, the travel and tourism industry contributed how many percent?", "12.7%", "12%", "13%", "13.7%"},
            {"The difference between welding at long and short wavelengths is due to ________.", "high absorptivity", "high reflectivity", "polarisation", "shroud design"},
            {"Surface grinding is done to produce.", "Flat surface", "Tapered surface", "Internal cylindrical holes", "All of these"},
            {"Scuba diving can be associated with", "Eco Tourism", "Farm Tourism", "Adventure Tourism", "Green Tourism"},
            {"How many islands that Philippines have?", "7,641", "3,879", "7,640", "5,789"},
            {"IT-BPM stands for...", "Information Technology and Business Process Management", "Information Technology and Buy Product Manager", "Information Technology and Business Process Manager", "Informal Technical and Business Process Management"}

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_pdc);

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