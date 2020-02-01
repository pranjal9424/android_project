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

public class English_pro extends AppCompatActivity {

    String title[] = {"English Proverbs - 1","English Proverbs - 2", "English Proverbs - 3","English Proverbs - 4"};
    String story[]={"A bad workman always blames his tools:This proverb is used when someone blames the quality of their equipment or other external factors when they perform a task poorly. Example: X: The turkey isn’t cooked well because the oven is not functioning well. Y: Well, it’s the case of a bad workman blaming his tools.", "A bird in hand is worth two in the bush.:Things we already have are more valuable than what we hope to get. Example: X: Why did you turn down that job offer when you don’t have anything concrete in hand at the moment? Y: Well, I’m confident I’ll land one of the two jobs I interviewed for last week. And they’re better than this one. X: In my opinion, you should’ve taken it. A bird in hand is worth two in the bush.", "Absence makes the heart grow fonder.:When people we love are not with us, we love them even more. Example: When I was with her she always fought with me but now she cries for me on phone. I think distance made her heart grow fonder.", "A cat has nine lives.:Cat can survive seemingly fatal events. Example: I haven’t seen him for several weeks, but I wouldn’t really worry about him. Everyone knows a cat has nine lives." };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_pro);

        ListView lv = (ListView) findViewById(R.id.Mylist);
        English_pro.MyAdapter myAdapter= new English_pro.MyAdapter(getApplicationContext(),title);
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ii =new Intent(English_pro.this,Full_story.class);

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
