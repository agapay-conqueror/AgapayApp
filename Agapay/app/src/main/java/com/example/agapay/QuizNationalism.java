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

public class QuizNationalism extends AppCompatActivity {

    private TextView countLabel;
    private TextView questionLabel;
    private Button choice1;
    private Button choice2;

    private String rightAnswer;
    private int rightAnswerCount = 0;
    private int quizCount = 1;

    static final private int QUIZ_COUNT = 10;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {
            //{"Question", "Right Answer", "choice1"},
            {"(TRUE OR FALSE) Nationalism is simply love of country with all its inhabitants.", "True", "False"},
            {"(TRUE OR FALSE) During their 333-year rule of the Philippines, the Spanish rulers referred the natives as Indios.", "True", "False"},
            {"(TRUE OR FALSE) Economy, is one of the 3 major factors of Filipino Nationalism.", "True", "False"},
            {"(TRUE OR FALSE) King Carlos II ordered the Jesuits to be expelled from Spain.", "False", "True"},
            {"(TRUE OR FALSE) Philippine independence was declared on June 12.", "True", "False"},
            {"(TRUE OR FALSE) Before the arrival of Buen Consejo, the Philippines had more direct contact to Europe and the ideas circulating.", "False", "True"},
            {"(TRUE OR FALSE) Raon died before the judgement for him was laid.", "True", "False"},
            {"(TRUE OR FALSE) Filipino Nationalism, refers to the awakening and support of a political identity.", "True", "False"},
            {"(TRUE OR FALSE) Philippine Revolution served as the backbone of the first nationalist revolution in Asia.", "True", "False"},
            {"(TRUE OR FALSE) Insulares, Criollos or Creoles, were also called Indios.", "False", "True"}

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_nationalism);

        countLabel = (TextView) findViewById(R.id.countLabel);
        questionLabel = (TextView) findViewById(R.id.questionLabel);
        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);

        //Create quizArray from quizData.
        for (int i = 0; i < quizData.length; i++) {
            //prepare Array.
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(quizData[i][0]); //QUESTION
            tmpArray.add(quizData[i][1]); //RIGHT ANSWER
            tmpArray.add(quizData[i][2]); //CHOICE1

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