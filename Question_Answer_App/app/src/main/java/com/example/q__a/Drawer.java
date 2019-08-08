package com.example.q__a;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;

public class Drawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
CardView java,python,aptitude;
AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        ////Ad
        MobileAds.initialize(this,"ca-app-pub-3870552280259267~1301218668");
        mAdview=(AdView)findViewById(R.id.adView);

        AdRequest adRequest=new AdRequest.Builder().addTestDevice("3B1D1C41DFB56A8EF0C4254E2420EA42").build();
        mAdview.loadAd(adRequest);

        ///java calling
        java=(CardView)findViewById(R.id.java);
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Drawer.this,JavaActivity.class);
                startActivity(intent);
            }
        });

        ////python calling
        python=(CardView)findViewById(R.id.python);
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Drawer.this,PythonActivity.class);
                startActivity(intent);
            }
        });

        ///aptitude
        aptitude=(CardView)findViewById(R.id.aptitude);
        aptitude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Drawer.this,AptitudeActivity.class);
                startActivity(intent);
            }
        });



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Drawer.this,Feedback.class);
                startActivity(intent);
                Toast.makeText(Drawer.this,"Feedback",Toast.LENGTH_LONG).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }





    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_login) {
            Intent intent=new Intent(Drawer.this,Login.class);
            startActivity(intent);
        }else if (id == R.id.nav_create) {

            Intent intent=new Intent(Drawer.this,Create.class);
            startActivity(intent);
        }
        if (id == R.id.nav_update) {
            Toast.makeText(this,"Coming soon",Toast.LENGTH_LONG).show();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
///// share option
//////share
@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.main_menu,menu);

    return super.onCreateOptionsMenu(menu);
}

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {



        switch (item.getItemId()){
            case R.id.nav_share:
                Intent shareIntent=new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String shareBody="https://developer.android.com/preview?gclid=CjwKCAjw-ITqBRB7EiwAZ1c5UxFGPykblFa56qIyPRUUoc9r9Ws7Nd8SFgcmfwW6CCdYpxeb2V-DCxoCGwgQAvD_BwE";
                String sharesubject="your subject here";

                shareIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,sharesubject);
                startActivity(Intent.createChooser(shareIntent,"share using"));
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
