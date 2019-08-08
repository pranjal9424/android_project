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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Feedback extends AppCompatActivity {
    EditText f_name,f_email,f_message;
    Button btn_feed;
    private static String REGISTER_URL="https://compulsory-rug.000webhostapp.com/feedback.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        f_name=(EditText)findViewById(R.id.feedback_name);
        f_email=(EditText)findViewById(R.id.feedback_email);
        f_message=(EditText)findViewById(R.id.feedback_message);
        btn_feed=(Button)findViewById(R.id.feedback_submit);

        ///animation

        btn_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser();
            }
        });
    }

    private void registerUser() {
        String name=f_name.getText().toString().trim().toLowerCase();
        String email=f_email.getText().toString().trim().toLowerCase();
        String message=f_message.getText().toString().trim().toLowerCase();
        register(name,email,message);
    }
    private void register(String name, String email, String message) {
        String urlSuffix = "?name=" + name + "&email=" + email + "&message=" + message;
        class RegisterUser extends AsyncTask<String, Void, String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(Feedback.this, "Please Wait", null, true, true);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(getApplicationContext(), "Thank You", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Feedback.this,MainActivity.class);
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
