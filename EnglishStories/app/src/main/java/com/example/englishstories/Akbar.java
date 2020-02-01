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

public class Akbar extends AppCompatActivity {
    String title[] = {"Mughal empire","Akbar life summary","the croen in the kingdom", "wise birbal?"};
    String story[]={"The Mughal Empire ruled over much of modern-day India and Pakistan from 1504 to 1857, bringing together a number of smaller kingdoms and building great cities and works of art. Learn about this empire's growth and legacy in this lesson. Building Up When you think about India, what are some things that immediately come to mind? Spicy food might be one, lots of people might be another. What about the Taj Mahal palace? It's as famous as the Eiffel Tower is to France or the Statue of Liberty is to the United States, but the Taj Mahal is much older than these two icons. The Taj Mahal was built some 400 years ago during the reign of the Mughal Empire, a great power that ruled over the area that today is India and Pakistan between 1504 and 1857. The Taj Mahal, built during the Mughal Empire Photo of Taj Mahal In The Beginning The Mughal Empire began with a Muslim leader named Babur, who is said to be a relative of the great Genghis Khan. Babur has become a legend as a great warrior, having conquered a city named Samarkand at the age of just 14. He came to India in 1526 in search of new lands to conquer, and another Indian leader asked him to help in a fight with the Sultan of Delhi. Babur defeated the Sultan, who had an army four times larger than his, and then went on to control most of northern India, establishing an empire. Outsiders call this the Mughal Empire, a name that refers to Babur as a Mongol. By about 500 years ago, the Mughal Empire spread from Pakistan to northern India. Babur, the first leader of the Mughal Empire Babur, ruler of Mughals Babur died soon after establishing power in India. His next son ruled, but also died soon after, and so control passed down to a 13-year-old grandson named Akbar in 1556. Akbar married a princess so that her father's army would help him, even though he was Muslim and she was a Hindu. Akbar was famous for loving hunting and using cheetahs to catch deer! He also expanded the empire across new parts of eastern India, but made sure his subjects had peace and justice. Mughal Culture We know much about the Mughal Empire because of the fantastic artwork and legacy of the culture. Many emperors supported artists: Akbar's own son even painted pictures of nature and portraits of important persons. Mughal architects built fantastic buildings and palaces that still survive, including the Taj Mahal. During this time, the Mughals built the city that would become Delhi, which today is the second-largest city in India and the third-largest in the world.", "On one fine sunny day, Akbar and Birbal were taking a leisurely walk in the palace gardens. Suddenly, Akbar thought of testing Birbal’s wits by asking him a tricky question. Emperor asked Birbal, “How many crows are there in our kingdom?” Birbal could sense the amusement in the king’s voice, and within a few minutes Birbal replied, “My king, there are eighty thousand nine hundred and seventy-one crows in our kingdom”. Surprised and amazed, Akbar further tested Birbal, “What if we have more crows?” Birbal replied, “Oh, then the crows from the other kingdoms must be visiting us’’. “ What if there are lesser crows?” asked Akbar. “Well, then some of our crows must be visiting other kingdoms”, replied Birbal with a grin on his face. Akbar smiled at Birbal’s great sense of humour and wit. Moral There is always a solution if one thinks with ease.", "Once upon a time, King Akbar lost a ring that was very precious to him. This ring was a gift from his father and losing it made the king very sad. Akbar summoned Birbal and requested him to find the ring. The court was full of courtiers. Birbal announced, “My great king, the ring is right here in the courtroom, and the one who has the ring has a straw stuck in his beard.” Everyone started looking at each other, and one of the courtiers started touching his beard to find the straw. Birbal called the guards and asked them to search the suspect. On searching the suspect, the ring was retrieved. Akbar was amazed at how Birbal managed to find the ring. Birbal said, “My King, the one who is guilty will always feel scared”. Moral The guilty conscience needs no accusation." };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akbar);
        ListView lv = (ListView) findViewById(R.id.Mylist);
        Akbar.MyAdapter myAdapter= new Akbar.MyAdapter(getApplicationContext(),title);
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ii =new Intent(Akbar.this,Full_story.class);

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
