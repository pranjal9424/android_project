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

public class Moral extends AppCompatActivity {
    String title[] = {"the ant and the dove","the apple tree and the farmer", "the fox and the grapes","the lion and mouse"};
    String story[]={"On a hot day of summer, an ant was searching for some water. After walking around for some time, she came near the river. To drink the water, she climbed up on a small rock. While trying to drink a water, she slipped and fell into the river.There was a dove sitting on a branch of a tree who saw an ant falling into the river. The dove quickly plucked a leaf and dropped it into the river near the struggling ant. The ant moved towards the leaf and climbed up onto it. Soon, the leaf drifted to dry ground, and the ant jumped out. She looked up to the tree and thanked the dove.Later, the same day, a bird catcher nearby was about to throw his net over the dove hoping to trap it. An ant saw him and guessed what he was about to do. The dove was resting and he had no idea about the bird catcher. An ant quickly bit him on the foot. Feeling the pain, the bird catcher dropped his net and let out a light scream. The dove noticed it and quickly flew away.Moral:  If you do good, good will come to you.  One good turn deserves another.","This is a story about the farmer and his apple tree. One day there was a farmer that had a huge form. There were the old apple tree,other trees,plants and flowers, when he was a little boy he really loved playing with the apple tree. At that time, the tree gave him apples.The farmer decided to cut the tree and he wanted to make some furniture with the wood. He forgot that he spent his childhood by climbing tree and eating the apples. The apple tree was home to some animals now. The begged to the farmer not to cut the tree.They said that the farmer used to play with the animal when he was child under the apple tree.  The tree was home of the animals. The farmer ignored the mand he raised his axe. The farmer noticed something shiny in the apple tree.There was beehive that full of honey. He tasted it and it was very delicious. Suddenly, the farmer remembers his childhood. He felt happy just by eating honey. The animals spoke in unison. The bee would provide honey the squirrel would share nuts, and the birds would sing many songs. The farmer realized that the apple tree as a home to many animals and his childhood memory.","One afternoon, a fox was walking through the forest and spotted a bunch of grapes hanging from a lofty branch. Just the thing to quench my thirst, said the fox.Taking a few steps back, the fox jumped and just missed the hanging grapes. Again, the fox took a few paces back and tried to reach them, but still failed.Finally, giving up, the fox turned up his nose and said, They're probably sour anyway. Then he walked away.The Fox and the Grapes StoryMORAL: IT'S EASY TO DESPISE WHAT YOU CANNOT HAVE.A note about the storyThe ‘Fox and the Grapes’ is often cited as an example for cognitive dissonance: the discomfort people experience when their beliefs/actions are at odds with other beliefs/actions. In the story, the fox sees some grapes on a vine and wants to eat them. He tries to jump up, but cannot reach them because they are too high. When he realizes he will not be able to eat any grapes, the fox becomes disdainful; he tells himself that those grapes were sour and not worthy of desire anyway.Psychologist and teacher Leon Festinger pointed out in 1957, that often, people hold two conflicting beliefs, or they believe one thing but do something that is against that belief. The resulting cognitive dissonance is psychologically distressful, and we often try to alleviate it by justifying our actions or changing our beliefs. Either way, the goal is to get our beliefs and actions in line with each other.","Let us enjoy reading this story of The Lion and The Mouse.A lion was sleeping in a forest. A mouse started playing on it. The lion was disturbed and arose from his sleep. It caught up the mouse angrily and tried to crush it to death.Then the mouse prayed the lion to leave him off and assured that it would help him when it needed. The lion laughed at it and let him off.One day the lion was caught in a net spread by a hunter. It roared and tried to escape but in vain. The mouse heared the lion's roaring and came there. It started cutting the net with its teeth. The lion escaped and thanked the mouse.MORAL : Everything has its own value."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moral);
        ListView lv = (ListView) findViewById(R.id.Mylist);
        Moral.MyAdapter myAdapter= new Moral.MyAdapter(getApplicationContext(),title);
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ii =new Intent(Moral.this,Full_story.class);

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
