package com.example.project;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {
    SwipeRefreshLayout mSwipeRefreshLayout;
    public static final String URI_DATA="https://inxdevp.000webhostapp.com/message.php";
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<Listitem> listItems;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meessge);



        ///floatingbutton
        FloatingActionButton fab=findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,SentMessage.class);
                startActivity(i);
            }
        });



        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.activity_java);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mSwipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary);

        mSwipeRefreshLayout.post(new Runnable() {

            @Override
            public void run() {

                mSwipeRefreshLayout.setRefreshing(true);


                loadrecyclerviewdata();
            }
        });



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
                                Listitem item = new Listitem(
                                        o.getString("question"),
                                        o.getString("answer"),
                                o.getString("time"),
                                o.getString("likes"));
                                listItems.add(item);

                            }

                            adapter = new Myadapter(listItems, getApplicationContext());
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
                        Toast.makeText(getApplicationContext(),"no internet",Toast.LENGTH_SHORT).show();
                        mSwipeRefreshLayout.setRefreshing(false);

                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }



    @Override
    public void onRefresh() {
        loadrecyclerviewdata();
    }
}
