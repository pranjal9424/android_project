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

public class Animal extends AppCompatActivity {
    String title[] = {"A friend in need is a friend indeed","A town and A country mouse", "Elephant and friends","Four friend"};
    String story[]={"Once upon a time there lived a lion in a forest. One day after a heavy meal. It was sleeping under a tree. After a while, there came a mouse and it started to play on the lion. Suddenly the lion got up with anger and looked for those who disturbed its nice sleep. Then it saw a small mouse standing trembling with fear. The lion jumped on it and started to kill it. The mouse requested the lion to forgive it. The lion felt pity and left it. The mouse ran away. On another day, the lion was caught in a net by a hunter. The mouse came there and cut the net. Thus it escaped. There after, the mouse and the lion became friends. They lived happily in the forest afterwards. Moral : A friend in need is a friend indeed.", "A Town Mouse and a Country Mouse were friends. The Country Mouse one day invited his friend to come and see him at his home in the fields. The Town Mouse came and they sat down to a dinner of barleycorns and roots the latter of which had a distinctly earthy flavour. The flavour was not much to the taste of the guest and presently he broke out with “My poor dear friend, you live here no better than the ants. Now, you should just see how I fare! My larder is a regular horn of plenty. You must come and stay with me and I promise you shall live on the fat of the land.So when he returned to town he took the Country Mouse with him and showed him into a larder containing flour and oatmeal and figs and honey and dates. The Country Mouse had never seen anything like it and sat down to enjoy the luxuries his friend provided. But before they had well begun, the door of the larder opened and some one came in. The two Mice scampered off and hid themselves in a narrow and exceedingly uncomfortable hole. Presently, when all was quiet, they ventured out again. But some one else came in, and off they scuttled again. This was too much for the visitor. Good bye, said he, I'm off. You live in the lap of luxury, I can see, but you are surrounded by dangers whereas at home I can enjoy my simple dinner of roots and corn in peace. Moral : Safety is the first importance.", "A lone elephant wandered the forest looking for friends. She came across a monkey and asked, “Will you be my friend, monkey?” “You are too big and cannot swing on trees as I do. So I cannot be your friend”, said the monkey. The elephant them came across a rabbit and asked him if she could be his friend. “You are too big to fit inside my burrow. You cannot be my friend”, replied the rabbit. Then the elephant met a frog and asked if she could be her friend. The frog said “You are too big and heavy. You cannot jump like me. I am sorry, but you cannot be my friend”. The elephant asked a fox, and he got the same reply, that he was too big. The next day, all the animals in the forest were running in fear. The elephant stopped a bear and asked what was happening and was told that a tiger has been attacking all the animals. The elephant wanted to save the other weak animals and went to the tiger and said “Please sir, leave my friends alone. Do not eat them”. The tiger didn’t listen and asked the elephant to mind her own business. Seeing no other way to solve the problem, the elephant kicked the tiger and scared it away. She then went back to the others and told them what happened. On hearing how the elephant saved their lives, the animals agreed in unison, “You are just the right size to be our friend”. Moral: Friends come in all shapes and sizes!", "The four decide to go a place called Manasa, which is considered an asylum for scholars. On their way, they have to pass through a forest. There they come across bones of a lion. Satyanand decides to show his knowledge by recreating the lion’s skeleton. The other friend reconstructs the lion’s muscles and structure. Vidyanand then wants to show his superior powers by breathing life into the lion. Shivanand tries to stop them and warns them of the consequences of their plans. But they do not stop. Shivanand climbs a tree before Vidyanand foolishly proceeds with his plans. The lion comes to life and devours the three learned fools. Shivanand’s practical nature saves him. Moral: It is better to be practical than learned." };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        ListView lv = (ListView) findViewById(R.id.Mylist);
        Animal.MyAdapter myAdapter= new Animal.MyAdapter(getApplicationContext(),title);
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ii =new Intent(Animal.this,Full_story.class);

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
