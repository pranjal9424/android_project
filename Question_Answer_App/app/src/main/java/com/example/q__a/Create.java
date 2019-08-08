package com.example.q__a;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Create extends AppCompatActivity {
    EditText edit_username,edit_email,edit_pass;
    Button btn_sign;
    private static String REGISTER_URL="https://compulsory-rug.000webhostapp.com/register.php";
    RelativeLayout anim;
    Animation lefttoight;
    AdView mAdview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        ////Ad
        MobileAds.initialize(this,"ca-app-pub-3870552280259267~1301218668");
        mAdview=(AdView)findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().addTestDevice("3B1D1C41DFB56A8EF0C4254E2420EA42").build();
        mAdview.loadAd(adRequest);

        edit_username=(EditText)findViewById(R.id.create_name);
        edit_email=(EditText)findViewById(R.id.create_email);
        edit_pass=(EditText)findViewById(R.id.create_password);
        btn_sign=(Button)findViewById(R.id.create_account);

        ///animation 
        anim=(RelativeLayout)findViewById(R.id.animn);
        lefttoight= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        anim.setAnimation(lefttoight);

        btn_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser();
            }
        });
    }

    private void registerUser() {
        String username=edit_username.getText().toString().trim().toLowerCase();
        String email=edit_email.getText().toString().trim().toLowerCase();
        String password=edit_pass.getText().toString().trim().toLowerCase();
        register(username,email,password);
    }
    private void register(String username, String password, String email) {
        String urlSuffix = "?username=" + username + "&password=" + password + "&email=" + email;
        class RegisterUser extends AsyncTask<String, Void, String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(Create.this, "Please Wait", null, true, true);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(getApplicationContext(), "Registered", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Create.this,MainActivity.class);
            }

            @Override
            protected String doInBackground(String... params) {
                String s = params[0];
                BufferedReader bufferReader = null;
                try {
                    URL url = new URL(REGISTER_URL + s);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    bufferReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String result;
                    result = bufferReader.readLine();
                    return result;

                } catch (Exception e) {
                    return null;
                }
            }

        }
        RegisterUser ur = new RegisterUser();
        ur.execute(urlSuffix);
    }

}