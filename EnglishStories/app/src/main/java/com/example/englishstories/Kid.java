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

public class Kid extends AppCompatActivity {
    String title[] = {"The tiger And the Traveller","the hidden treasure", "Lie Beget Danger","Look before you leap"};
    String story[]={"Once, there was an old Tiger that could no longer hunt. One morning, he stood in a lake and held a blade of holy grass in one paw and a gold bracelet in the other. He was shouting, “Ladies and Gentlemen! A gold bracelet for charity.” A Traveller, passing by, liked the gold bracelet. However, he was scared of the Tiger. The Traveller said, “How can I believe that you would not harm me?” The Tiger replied, “I admit that when I was young, I was wicked and killed many cows and human beings. Then a holy man advised me to give alms. So, now I take a bath and give things for the sake of charity. Besides, I’ve gone old. My teeth and claws have fallen off. So, what have you to fear from me?” The Traveller believed him and went into the lake, but got struck in the deep mud. When the Tiger saw this, he comforted him. “Oh! Don’t worry. I’ll help you,” he said, and slowly waded towards the Traveller and grabbed him. Soon after that, the Tiger killed the Traveller and ate him up.", "Once, there was an old man who had four sons. All four of them were very lazy. One day, the old man fell sick and was counting his last days in bed. He worried a lot about his sons’ future as the young men hesitated a lot to work. The sons believed that luck would favour them. The old man’s health deteriorated every day and he decided to talk to his sons about their future. However, his sons did not listen to him. Finally, the old man decided to play a trick to let his sons realize the importance of work. He called all his sons and let them sit near him on his bed. He said that he had a treasure box with gold coins and expensive gems for them and wanted to share the treasure equally among the four of them. The young men were very happy and asked where his father had placed the treasure. The old man replied, “I cannot exactly remember the place where I have hidden the treasure. However, the treasure box is buried in our land. I’m really not sure about the place where I have hidden the treasure box.” Even though the lazy young sons were happy, they were sad that the old man had forgotten the place where the treasure was hidden. After a few days, the old man died. The sons decided to dig the land to find the treasure box. They worked very hard and dug their land. They could not find any treasure box in the land. Finally, they decided to dig a spot in their land that was a bit different from the rest of the area. The sons believed that the treasure was buried in that spot. They dug the specific spot deeply, but got nothing but water. A passerby who noticed the land and the water flowing from the spot talked to the sons about farming. Upon his advice, the four sons sowed vegetable seeds, and planted greens and flowering plants in their land. Since the land was very fertile with abundant water, within a few weeks, it became a fertile garden with nutritious vegetables and greens. The four sons sold the vegetables at a good price and earned a good amount of money. Then they realized that it was hard work that was referred to as ‘Treasure Box’ by their father. Gradually, the four sons overcame their laziness, worked hard, earned more money and lived happily. Moral: Hard Work Always Pays.", "There was a small village at the foot of a hill, where the villagers lived happily. A shepherd boy also lived there. He used to graze the sheep in the valley from dawn to dusk, and returned home in the evening with his cattle. One day the shepherd boy thought of befooling the villagers.” He shouted at the top of his voice. “Wolf, Wolf!” The villagers came running to-the spot with their sticks and weapons in hand to save the boy and his cattle. But they found no wolf there. The shepherd boy began to laugh, as tie was able to befool the villagers. ADVERTISEMENTS: After a few days, the shepherd boy again shouted, “Wolf, Wolf!” and again, the villagers came running with their sticks and weapons to the rescue of the distressed, but again, they saw the shepherd boy laughing for befooling them. They went back annoyed at the boy. Now one day a wolf really appeared at the valley and attacked the shepherd boy and his cattle. The boy shouted loudly, “Wolf, Wolf!” But the villagers took it for the usual fun that the boy enjoyed by misleading them. So they did not bother themselves to come to the rescue. The shepherd boy was killed, and a few sheep were injured by the wolf. The boy understood before his death that lies do not pay, and they rather create troubles for the liar.", "Let us enjoy reading this story of Look before You leap. Once, a fox was very thirsty. He saw a big well nearby and peeped into it. The fox slipped and fell into the well. He tried to come out. But he could not do so. After some time, there came a goat who was also thirsty. He too peeped into the well. The fox saw the goat and said from inside the well, “The water is very sweet. Come and Come to enjoy. The foolish goat also jumped into the well. The clever fox climbed on the back of the goat and jumped out of the well" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kid);

        ListView lv = (ListView) findViewById(R.id.Mylist);
        Kid.MyAdapter myAdapter= new Kid.MyAdapter(getApplicationContext(),title);
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ii =new Intent(Kid.this,Full_story.class);

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
