package com.example.chankayaneeti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar);

        //toolbar
        Toolbar toolbar=findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Button p1=(Button)findViewById(R.id.part1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part1.class);
                startActivity(i);
            }
        });

        Button p2=(Button)findViewById(R.id.part2);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part2.class);
                startActivity(i);
            }
        });

        Button p3=(Button)findViewById(R.id.part3);
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part3.class);
                startActivity(i);
            }
        });

        Button p4=(Button)findViewById(R.id.part4);
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part4.class);
                startActivity(i);
            }
        });
Button p5=(Button)findViewById(R.id.part5);
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part5.class);
                startActivity(i);
            }
        });
Button p6=(Button)findViewById(R.id.part6);
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part6.class);
                startActivity(i);
            }
        });
Button p7=(Button)findViewById(R.id.part7);
        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part7.class);
                startActivity(i);
            }
        });
Button p8=(Button)findViewById(R.id.part8);
        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part8.class);
                startActivity(i);
            }
        });
Button p9=(Button)findViewById(R.id.part9);
        p9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part9.class);
                startActivity(i);
            }
        });
Button p10=(Button)findViewById(R.id.part10);
        p10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part10.class);
                startActivity(i);
            }
        });
Button p11=(Button)findViewById(R.id.part11);
        p11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part11.class);
                startActivity(i);
            }
        });
Button p12=(Button)findViewById(R.id.part12);
        p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part12.class);
                startActivity(i);
            }
        });
Button p13=(Button)findViewById(R.id.part13);
        p13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part13.class);
                startActivity(i);
            }
        });
Button p14=(Button)findViewById(R.id.part14);
        p14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part14.class);
                startActivity(i);
            }
        });
Button p15=(Button)findViewById(R.id.part15);
        p15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part15.class);
                startActivity(i);
            }
        });
Button p16=(Button)findViewById(R.id.part16);
        p16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part16.class);
                startActivity(i);
            }
        });
Button p17=(Button)findViewById(R.id.part17);
        p17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(MainActivity.this,Part17.class);
                startActivity(i);
            }
        });

    }
}
