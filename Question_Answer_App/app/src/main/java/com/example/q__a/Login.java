package com.example.q__a;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity {
    public static final String LOGIN_URL="https://compulsory-rug.000webhostapp.com/login.php";
    public static final String SHARED_PREF_NAME="tech";
    public static final String LOGIN_SUCCESS="success";
    public static final String EMAIL_SHARED_PREF="email";
    public static final String LOGGEDIN_SHARED_PREF="loggedin";
    public static final String KEY_EMAIL="email";
    public static final String KEY_PASSWORD="password";
    private boolean loggedIn=false;
    Button BtnLogin;
    RelativeLayout anim;
    Animation lefttoight;
    EditText editTextPassword;
    EditText editTextEmail;
    ProgressDialog loading;
    AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ////Ad
        MobileAds.initialize(this,"ca-app-pub-3870552280259267~1301218668");
        mAdview=(AdView)findViewById(R.id.adView);

        AdRequest adRequest=new AdRequest.Builder().addTestDevice("3B1D1C41DFB56A8EF0C4254E2420EA42").build();
        mAdview.loadAd(adRequest);

        anim=(RelativeLayout)findViewById(R.id.anim);
        BtnLogin=(Button)findViewById(R.id.edit_login);
        editTextEmail=(EditText)findViewById(R.id.email);
        editTextPassword=(EditText)findViewById(R.id.password);

        ///Animation
        lefttoight= AnimationUtils.loadAnimation(this,R.anim.uptodown);
        anim.setAnimation(lefttoight);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void login() {
        final String email = editTextEmail.getText().toString().trim().toLowerCase();
        final  String password = editTextPassword.getText().toString().trim().toLowerCase();
        loading = ProgressDialog.show(Login.this, "Please Wait", null, true, true);

        StringRequest stringRequest=new StringRequest(Request.Method.POST, LOGIN_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if (response.trim().equalsIgnoreCase(LOGIN_SUCCESS)) {
                            SharedPreferences sharedPreferences = Login.this.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
                            SharedPreferences.Editor editor = sharedPreferences.edit();

                            editor.putBoolean(LOGGEDIN_SHARED_PREF, true);
                            editor.putString(EMAIL_SHARED_PREF, email);

                            editor.commit();

                            Intent intent = new Intent(Login.this, Drawer.class);
                            startActivity(intent);
                        } else {
                            loading.dismiss();
                            Toast.makeText(Login.this, "Invalid username or password", Toast.LENGTH_LONG).show();
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                    }
                }){
            @Override
            protected Map<String,String> getParams() throws AuthFailureError {
                Map<String,String> prams=new HashMap<>();
                prams.put(KEY_EMAIL,email);
                prams.put(KEY_PASSWORD ,  password);

                return prams;
            }
        };
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
