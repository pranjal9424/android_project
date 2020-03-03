package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView tv, tv2, tv3;
    Button btnRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv = (TextView)findViewById(R.id.tvres);
        tv2 = (TextView)findViewById(R.id.tvres2);
        tv3 = (TextView)findViewById(R.id.tvres3);
        btnRestart = (Button) findViewById(R.id.btnRestart);




        StringBuffer sb4 = new StringBuffer();
        sb4.append("Correct answers: " + Level.correct + "\n");
        StringBuffer sb5 = new StringBuffer();
        sb5.append("Wrong Answers: " + Level.wrong + "\n");
        StringBuffer sb6 = new StringBuffer();
        sb6.append("Final Score: " + Level.correct + "\n");
        tv.setText(sb4);
        tv2.setText(sb5);
        tv3.setText(sb6);
        Level.correct=0;
        Level.wrong=0;

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });
    }
    @Override

    public void onBackPressed(){
Intent bac=new Intent(getApplicationContext(),MainActivity.class);
startActivity(bac);
    }



}