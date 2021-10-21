package com.example.knowme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button yes;
    Button no;
    TextView textView2;
    private String questions[] = {"Do you have kids?", "Do you know Java?", "How much money do you have?", "Is Owner going to be selected in your company?",
            "Do you like to recommend such apps to someone starting android dev?"};

    private boolean answers[] = {true,false,false,true,true};
    private int index = 0;
    private int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        textView2 = findViewById(R.id.textView2);
        textView2.setText(questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index<questions.length){
                    if (answers[index]==true){
                        score++;
                    }
                    index++;
                    if (index<questions.length){
                        textView2.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (index<questions.length){
                    if (answers[index]==false){
                        score++;
                    }
                    index++;
                    if (index<questions.length){
                        textView2.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}