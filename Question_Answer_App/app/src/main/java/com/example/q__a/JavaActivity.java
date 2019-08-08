package com.example.q__a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class JavaActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {
    SwipeRefreshLayout mSwipeRefreshLayout;
    public static final String URI_DATA="http://subjiwala.org/quiz_androidinter_java.php";
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<Listitem_j> listItems;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);


        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.activity_java);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mSwipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary,
                android.R.color.holo_green_dark,
                android.R.color.holo_orange_dark,
                android.R.color.holo_blue_dark);

        mSwipeRefreshLayout.post(new Runnable() {

            @Override
            public void run() {

                mSwipeRefreshLayout.setRefreshing(true);


                loadrecyclerviewdata();
            }
        });


        //add interstitial
        MobileAds.initialize(this, "ca-app-pub-3870552280259267~1301218668");
        prePaperAd();

        ScheduledExecutorService scheduler =
                Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if(mInterstitialAd.isLoaded()){
                            mInterstitialAd.show();
                        }
                        else {
                            Log.d("Tag","Interstitals Ad not Loaded");
                        }
                    }
                });
            }
        },10,10, SECONDS);
    }

    //ad
    public  void prePaperAd(){
        mInterstitialAd =new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3870552280259267/9500941181");
        mInterstitialAd.loadAd(new AdRequest.Builder().addTestDevice("3B1D1C41DFB56A8EF0C4254E2420EA42").build());
    }



    @Override
    public void onRefresh() {

        loadrecyclerviewdata();


    }

    private void loadrecyclerviewdata() {
        mSwipeRefreshLayout.setRefreshing(true);
        /*final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading data...");
        progressDialog.show();
*/
        StringRequest stringRequest = new StringRequest(Request.Method.GET,
                URI_DATA,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        //  progressDialog.dismiss();

                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            JSONArray jsonArray = jsonObject.getJSONArray("result");

                            for (int i =0;i<jsonArray.length();i++){

                                JSONObject o = jsonArray.getJSONObject(i);
                                Listitem_j item = new Listitem_j(
                                        o.getString("question"),
                                        o.getString("answer"));
                                listItems.add(item);

                            }

                            adapter = new MyAdapter_j(listItems, getApplicationContext());
                            recyclerView.setAdapter(adapter);


                        } catch (JSONException e) {

                        }
                        mSwipeRefreshLayout.setRefreshing(false);

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        //progressDialog.dismiss();
                        Toast.makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_SHORT).show();
                        mSwipeRefreshLayout.setRefreshing(false);

                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }
}
