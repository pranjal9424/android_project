package com.example.q__a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    Button login,create,skip;
    RelativeLayout anim;
    Animation lefttoight;
    AdView mAdview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=(Button)findViewById(R.id.login);
        create=(Button)findViewById(R.id.create);
        skip=(Button)findViewById(R.id.skip);


        ////animation
        anim=(RelativeLayout)findViewById(R.id.animm);
        lefttoight= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        anim.setAnimation(lefttoight);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Login.class);
                startActivity(intent);
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Create.class);
                startActivity(intent);
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Drawer.class);
                startActivity(intent);
            }
        });


        ////Ad
        MobileAds.initialize(this,"ca-app-pub-3870552280259267~1301218668");
        mAdview=(AdView)findViewById(R.id.adView);

        AdRequest adRequest=new AdRequest.Builder().addTestDevice("3B1D1C41DFB56A8EF0C4254E2420EA42").build();
        mAdview.loadAd(adRequest);

    }


}
