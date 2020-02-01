package com.example.englishstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar);

        TextView tv=(TextView)findViewById(R.id.short_stories);
        tv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        Intent i=new Intent(MainActivity.this,Short_stories.class);
        startActivity(i);
       }
       });


        TextView ak=(TextView)findViewById(R.id.akbar);
        ak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Akbar.class);
                startActivity(i);
            }
        });

        TextView ala=(TextView)findViewById(R.id.ala);
        ala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Aladin.class);
                startActivity(i);
            }
        });
        TextView an=(TextView)findViewById(R.id.animal);
        an.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Animal.class);
                startActivity(i);
            }
        });
        TextView bed=(TextView)findViewById(R.id.bed);
        bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Bedtime.class);
                startActivity(i);
            }
        });
        TextView cl=(TextView)findViewById(R.id.clas);
        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Classic.class);
                startActivity(i);
            }
        });
        TextView gen=(TextView)findViewById(R.id.general);
        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,General.class);
                startActivity(i);
            }
        });
        TextView in=(TextView)findViewById(R.id.insp);
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Inspiration.class);
                startActivity(i);
            }
        });
        TextView mo=(TextView)findViewById(R.id.moral);
        mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Moral.class);
                startActivity(i);
            }
        });
        TextView mt=(TextView)findViewById(R.id.mot);
        mt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Motivation.class);
                startActivity(i);
            }
        });

        TextView pan=(TextView)findViewById(R.id.pancha);
        pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Pancha.class);
                startActivity(i);
            }
        });

        TextView fam=(TextView)findViewById(R.id.fam);
        fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Family.class);
                startActivity(i);
            }
        });
        TextView kid=(TextView)findViewById(R.id.kid);
        kid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Kid.class);
                startActivity(i);
            }
        });
        TextView lf=(TextView)findViewById(R.id.life);
        lf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Life.class);
                startActivity(i);
            }
        });
        TextView edu=(TextView)findViewById(R.id.edu);
        edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Education.class);
                startActivity(i);
            }
        });
        TextView lon=(TextView)findViewById(R.id.lon);
        lon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Long.class);
                startActivity(i);
            }
        });
        TextView e=(TextView)findViewById(R.id.eng);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,English.class);
                startActivity(i);
            }
        });
        TextView ep=(TextView)findViewById(R.id.eng_pro);
        ep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,English_pro.class);
                startActivity(i);
            }
        });
        TextView oth=(TextView)findViewById(R.id.oth);
        oth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Other.class);
                startActivity(i);
            }
        });


    }
}
