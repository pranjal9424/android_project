package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class Login extends AppCompatActivity {
    LinearLayout li;
    Animation uptodwon;
    Button skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ///animatiom
        li=(LinearLayout) findViewById(R.id.layout);
        uptodwon= AnimationUtils.loadAnimation(this,R.anim.uptodwon);
        li.setAnimation(uptodwon);



        //Login
        skip=(Button)findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Login.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}
