package com.example.inspiration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView011;
    String[] mTopic;
    int[] flags = new int[] { R.drawable.a,
            R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.g,
                R.drawable.h,
                R.drawable.i,
                R.drawable.j,
                R.drawable.k,
                R.drawable.l,
                R.drawable.m,
                R.drawable.n,
                R.drawable.o,
                R.drawable.p,
                R.drawable.q,
                R.drawable.r,
                R.drawable.s,
                R.drawable.t

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.bar);


        mTopic = getResources().getStringArray(R.array.smsTopic);

        // txtStatus = (TextView) findViewById(R.id.textview_facestatus);
        listView011 = (ListView) findViewById(R.id.listview01);
        // txtStatus.setText(topic);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 20; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("txt", " " + mTopic[i]);
            hm.put("flag", Integer.toString(flags[i]));
            aList.add(hm);
        }

        int[] to = { R.id.profile_image, R.id.txt };
        String[] from = { "flag", "txt" };
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList,
                R.layout.listview_layout, from, to);

        listView011.setAdapter(adapter);
        listView011.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
                                    long arg3) {
                switch (pos) {
                    case 0:
                        Intent intent = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent.putExtra("key5", 0);
                        intent.putExtra("keyTopic", mTopic[0]);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent1.putExtra("key5", 1);
                        intent1.putExtra("keyTopic", mTopic[1]);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent2.putExtra("key5", 2);
                        intent2.putExtra("keyTopic", mTopic[2]);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent3.putExtra("key5", 3);
                        intent3.putExtra("keyTopic", mTopic[3]);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent4.putExtra("key5", 4);
                        intent4.putExtra("keyTopic", mTopic[4]);
                        startActivity(intent4);

                        break;

                    case 5:
                        Intent intent5 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent5.putExtra("key5", 5);
                        intent5.putExtra("keyTopic", mTopic[5]);
                        startActivity(intent5);

                        break;

                    case 6:
                        Intent intent6 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent6.putExtra("key5", 6);
                        intent6.putExtra("keyTopic", mTopic[6]);
                        startActivity(intent6);

                        break;
                    case 7:
                        Intent intent7 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent7.putExtra("key5", 7);
                        intent7.putExtra("keyTopic", mTopic[7]);
                        startActivity(intent7);

                        break;
                    case 8:
                        Intent intent8 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent8.putExtra("key5", 8);
                        intent8.putExtra("keyTopic", mTopic[8]);
                        startActivity(intent8);

                        break;
                    case 9:
                        Intent intent9 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent9.putExtra("key5", 9);
                        intent9.putExtra("keyTopic", mTopic[9]);
                        startActivity(intent9);

                        break;
                    case 10:
                        Intent intent10 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent10.putExtra("key5", 10);
                        intent10.putExtra("keyTopic", mTopic[10]);
                        startActivity(intent10);

                        break;
                    case 11:
                        Intent intent11 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent11.putExtra("key5", 11);
                        intent11.putExtra("keyTopic", mTopic[11]);
                        startActivity(intent11);

                        break;
                    case 12:
                        Intent intent12 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent12.putExtra("key5", 12);
                        intent12.putExtra("keyTopic", mTopic[12]);
                        startActivity(intent12);

                        break;
                    case 13:
                        Intent intent13 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent13.putExtra("key5", 13);
                        intent13.putExtra("keyTopic", mTopic[13]);
                        startActivity(intent13);

                        break;
                    case 14:
                        Intent intent14 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent14.putExtra("key5", 14);
                        intent14.putExtra("keyTopic", mTopic[14]);
                        startActivity(intent14);

                        break;
                    case 15:
                        Intent intent15 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent15.putExtra("key5", 15);
                        intent15.putExtra("keyTopic", mTopic[15]);

                        startActivity(intent15);

                        break;
                    case 16:
                        Intent intent16 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent16.putExtra("key5", 16);
                        intent16.putExtra("keyTopic", mTopic[16]);
                        startActivity(intent16);

                        break;
                    case 17:
                        Intent intent17 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent17.putExtra("key5", 17);
                        intent17.putExtra("keyTopic", mTopic[17]);
                        startActivity(intent17);

                        break;
                    case 18:
                        Intent intent18 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent18.putExtra("key5", 18);
                        intent18.putExtra("keyTopic", mTopic[18]);
                        startActivity(intent18);

                        break;
                    case 19:
                        Intent intent19 = new Intent(MainActivity.this,
                                MsgActivity.class);
                        intent19.putExtra("key5", 19);
                        intent19.putExtra("keyTopic", mTopic[19]);
                        startActivity(intent19);

                        break;

                    default:

                        break;
                }

            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        System.exit(0);
    }


}
