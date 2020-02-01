package com.example.englishstories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Short_stories extends AppCompatActivity {

    String title[] = {"17 Camels and 3 sons","A merchant and his donkey","unhelpful friends", "Greedy boy"};
    String story[]={"Long ago, there lived an old man with his three sons in a deserted village, located in the vicinity of a desert. He had 17 camels, and they were the main source of his income. He used to rent out camels as a means of shipping in the desert. One day, he passed away. He had left a will, leaving his assets for his three sons.After the funeral and the other obligations were over, the three sons read the will. While their father had divided all the property he had into three equal parts, he had divided the 17 camels in a different way. They were not shared equally among the three as ‘17’ is an odd number and a prime number, which cannot be divided.The old man had stated that the eldest son will own half of the 17 camels, the middle one will get one third of the 17 camels, and the youngest one will get his share of camels as one ninth!All of them were stunned to read the will and questioned each other how to divide the 17 camels as mentioned in the will. It is not possible to divide 17 camels and give half of the 17 camels to the eldest one. It is not possible also to divide the camels for the other two sons.They spent several days thinking of ways to divide the camels as mentioned in the will, but none could find the answer.They finally took the issue to the wise man in their village. The wise man heard the problem and instantly found a solution. He asked them to bring all the 17 camels to him.The sons brought the camels to the wise man’s place. The wise man added a camel owned by him and made the total number of camels 18.Now, he asked the first son to read the will. As per the will, the eldest son got half the camels, which now counted to 18 / 2 = 9 camels! The eldest one got 9 camels as his share.The remaining camels were 9.The wise man asked the second son to read the will. He was assigned 1 / 3 of the total camels.It came to 18 / 3 = 6 camels. The second son got 6 camels as his share.Total number of camels shared by the elder sons – 9 + 6 = 15 camels.The third son read out his share of camels: 1 / 9th of the total number of camels – 18 / 9 = 2 camels.The youngest one got 2 camels as his share.Totally there were 9 + 6 + 2 camels shared by the brothers, which counted to 17 camels.Now, the one camel added by the wise man was taken back.The wise man solved this problem smartly with his intelligence.","One beautiful spring morning, a merchant loaded his donkey with bags of salt to go to the market in order to sell them. The merchant and his donkey were walking along together.They had not walked far when they reached a river on the road. Unfortunately, the donkey slipped and fell into the river and noticed that the bags of salt loaded on his back became lighter.There was nothing the merchant could do, except return home where he loaded his donkey with more bags of salt. As they readied the slippery riverbank, now deliberately, the donkey fell into the river and wasted all the bags of salt on its back again.The merchant quickly discovered the donkey’s trick. He then returned home again but reloaded his donkey with bags of sponges.The foolish, tricky donkey again set on its way. On reaching the river he again fell into the water. But instead of the load becoming lighter, it became heavier.The merchant laughed at him and said: You foolish donkey…. Your trick had been discovered, you should know that, those who are too clever sometimes over reach themselves.","Rabbit lived in the woods. He had numerous companions. He was pleased with his companions. One day hare heard the uproarious woofing of wild mutts. He was terrified. He chose to request help. He rapidly went to his companion deer. He state Dear companion, some wild canines are pursuing me. Would you be able to pursue them away with your sharp prongs? The deer stated, That is correct, I can. Be that as it may, presently I am occupied. For what reason don't you approach bear for assistance?Rabbit hurried to the endure. My dear companion, you are exceptionally solid. Kindly assistance me. Some wild canines are after me. If you don't mind pursue them away, he mentioned to the tolerate.The bear answered, I am grieved. I am ravenous and tired. I have to discover some nourishment. If you don't mind approach the monkey for assistance.Poor Rabbit went to the monkey, the elephant, the goat and all his different companions. Rabbit felt tragic that no one was prepared to support him.He comprehended that he needed to think about an exit plan without anyone else's input. He stowed away under a bramble. He lay still. The wild mutts did not discover the rabbit. They went pursuing different creatures.Rabbit discovered that he needed to figure out how to get by independent from anyone else, not relying upon his unhelpful companions.Moral: It is smarter to depend on yourself than rely upon others","Sam and Tom were identical twins. They were so identical that even their mother found it difficult to distinguish one from the other, at least during their initial days on earth.However, they were very different from each other when it came to everything other than their appearance. Sam had no friends, while Tom was a great friendship maker. Sam loved sweets, but Tom loved spicy food and detested sweets. Sam was mommy’s pet and Tom was daddy’s pet. While Sam was generous and selfless, Tom was greedy and selfish!As Sam and Tom grew up, their father wanted to share his fortune equally amongst them. However, Tom did not agree and he argued that whoever proved to be more intelligent and strong would have to get a bigger share of the wealth.Sam agreed. Their father decided to organize a competition between the two. He asked the two sons to walk as long as they could, and return home before sunset. The wealth would be divided in proportion to the distance covered. As a rule of the competition, they were not permitted to carry a watch to keep track of the time.The following day, Sam and Tom set out to walk. It was a rather sunny day. Sam walked slowly and steadily, while Tom broke into a sprint as he was bent on winning the race and also winning a greater portion of his father’s wealth.Sam knew that it would be ideal to walk as far as possible till noon and start for home at noon as it would take the same amount of time to walk back home. Knowing this, Sam decided to turn back for home at noon so as reach home on time.However, Tom, with his greed to earn more wealth, did not attempt to return home even after mid-noon. He walked twice as long as Sam, and thought he would still be able to return home before sunset. He hurried back when he saw the sun turn orange. Unfortunately, he could not even make it half way home as the sun started to set. Slowly darkness engulfed his path and he had to drag his tired feet back home.He had lost the race. Only because of his greed."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_short_stories);

        ListView lv = (ListView) findViewById(R.id.Mylist);
        MyAdapter myAdapter= new MyAdapter(getApplicationContext(),title);
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ii =new Intent(Short_stories.this,Full_story.class);

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

