package com.example.englishstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class English extends AppCompatActivity {
    String title[] = {"English Quotes - 1","English Quotes - 2", "English Quotes - 3","English Quotes - 4"};
    String story[]={"The best way to predict the future is to create it. – Abraham Lincoln If you want to be a fluent speaker of English in the future, you need to make it happen.", "You are never too old to set another goal or to dream a new dream. – C.S.Lewis Many people say it’s easier to learn a language when you are young but there are advantages to learning a language when you are older.", " Live as if you were to die tomorrow. Learn as if you were to live forever. – Gandhi Enjoy living in the moment but remember that learning English will prepare you for the future.", "Learning is not a spectator sport. – D. Blocher If you want to master English, get involved and practise as much as possible." };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        ListView lv = (ListView) findViewById(R.id.Mylist);
        English.MyAdapter myAdapter= new English.MyAdapter(getApplicationContext(),title);
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ii =new Intent(English.this,Full_story.class);

                ii.putExtra("title",title[i]);
                ii.putExtra("story",story[i]);

                startActivity(ii);


            }
        });
    }
    public class MyAdapter extends BaseAdapter {
        Context context;

        String title[];
        LayoutInflater inflater;

        public MyAdapter(Context applicationContext,String[] name){
            this.context=applicationContext;
            this.title=name;

            inflater=(LayoutInflater.from(getApplicationContext()));

        }

        @Override
        public int getCount() {
            return title.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = inflater.inflate(R.layout.listitem,null);
            TextView lv=(TextView) view.findViewById(R.id.title);
            lv.setText(title[i]);
            return view;
        }

    }
}
