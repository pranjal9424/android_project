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

public class Other extends AppCompatActivity {
    String title[] = {"A Fox and A Crow","A lion and A rabbit", "Benevolent jumbo","Brakes Fail"};
    String story[]={"Once a crow was looking for something to eat. Suddenly he saw a piece of cheese. He lifted the piece in his beak. He flew to a tree nearby. A fox was also in search of food. While wandering he came under that tree. He saw the crow and his piece of cheese. His mouth watered. He wanted to have it. He was very cunning. He hit upon a plan to trick the crow. He said to the crow.”You are a fine bird. Your wings are very pretty. Your voice must be very sweet. Would you not sing me a song?” The foolish crow was taken in. He opened his beak to sing. The piece of cheese fell down. The fox ate it up and ran away. Moral: Beware of flatterers.", "One day, it was the turn of the rabbits. A little rabbit voluntarily agreed to go to the lion’s cage. The little rabbit reached the lion’s den very late. The angry lion roared at the little rabbit and asked, “Why are you late?” The rabbit acted wisely and told the king that, “I met another lion on the way, which is bigger than you. It threatened to eat me.” The lion angrily asked the rabbit “Do you know where he lives?”. The rabbit replied ‘Yes’ and asked the king to follow him. The rabbit reached an old well and said the king, “That lion lives in this well.” The foolish lion peeped into the well and mistook his own reflection as another lion and roared loudly. Hearing the echo of his own, the lion got angry and jumped into the well and drowned. That was the end of the lion and all animals lived happily in the jungle. Morals: “Wisdom is stronger than physical strength”.", "Jumbo, a big elephant, was very kind and caring towards others. One day, he saw a little boy crying. Jumbo went to him and asked him the reason for crying. The boy replied, I was carrying water to my home, when I noticed a hole in my bucket. All the water had been drained out. Now how will I take water to my home? Jumbo consoled the boy and thought of a plan. He filled his trunk with water and went along with the boy to his home. There he poured the water from his trunk into another basket. The boy felt very happy and gave Jumbo bananas to eat.", "One day, James was cycling with his brother. At a distance, they saw a steep slide. They decided to cycle down the slide. While they were cycling down the slide, James realized that the brakes of his cycle had failed. So, he started shouting for help. Hearing his shouts, his brother quickly cycled down to him and put his leg in front of his cycle. In a bid to save Victor his brother got injured. Victor also lost his balance and fell down. But he was saved from a very big mishap only because of his brother. He hugged his brother and both of them went back home." };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        ListView lv = (ListView) findViewById(R.id.Mylist);
        Other.MyAdapter myAdapter= new Other.MyAdapter(getApplicationContext(),title);
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ii =new Intent(Other.this,Full_story.class);

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
