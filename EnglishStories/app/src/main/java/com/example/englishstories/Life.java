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

public class Life extends AppCompatActivity {

    String title[] = {"the man and the little car","the poor mane wealth", "the wet pant","the wise old man"};
    String story[]={"One day, an old man was having a stroll in the forest when he suddenly saw a little cat stuck in a hole. The poor animal was struggling to get out. So, he gave him his hand to get him out. But the cat scratched his hand with fear. The man pulled his hand screaming with pain. But he did not stop; he tried to give a hand to the cat again and again. Another man was watching the scene, screamed with surprise, “For god sakes! Stop helping this cat! He’s going to get himself out of there”. The other man did not care about him, he just continued saving that animal until he finally succeeded, And then he walked to that man and said, “Son, it is cat’s Instincts that makes him scratch and to hurt, and it is my job to love and care”. Moral:  Treat everyone around you with your ethics, not with theirs.   Treat the people the way you want to be treated by them.", "Ramchand and Premchand were neighbors. Ramchand was a poor farmer. Premchand was a landlord. Ramchand used to be very relaxed and happy. He never bothered to close the doors and windows of his house at night. He had deep sound sleeps. Although he had no money he was peaceful. Premchand used to be very tense always. He was very keen to close the doors and windows of his house at night. He could not sleep well. He was always bothered that someone might break open his safes and steal away his money. He envied the peaceful Ramchand. One day, Premchand call Ramchand and gave him a boxful of cash saying, “Look my dear friend. I am blessed with plenty of wealth. I find you in poverty. So, take this cash and live in prosperity.” Ramchand was overwhelmingly happy. He was joyful throughout the day. Night came. Ramchand went to bed as usual. But, to-day, he could not sleep. He went and closed the doors and windows. He still could not sleep. He began to keep on looking at the box of cash. The whole night he was disturbed. As soon as day broke, Ramchand took the box of cash to Premchand. He gave away the box to Premchand saying, “Dear Friend, I am poor. But, your money took away peace from me. Please bear with me and take back your money.” Moral: Money can not get everything. Learn to be satisfied with what you have and you will always be happy.", "There is a nine-year-old kid sitting at his desk and all of a sudden, there is a puddle between his feet and the front of his pants are wet. He thinks his heart is going to stop because he cannot possibly imagine how this has happened. It’s never happened before, and he knows that when the boys find out he will never hear the end of it.. When the girls find out, they’ll never speak to him again as long as he lives.  The boy believes his heart is going to stop; he puts his head down and prays this prayer, “Dear God, this is an emergency! I need help now! Five minutes from now I’m dead meat.”  He looks up from his prayer and here comes the teacher with a look in her eyes that says he has been discovered. As the teacher is walking toward him, a classmate named Susie is carrying a goldfish bowl that is filled with water. Susie trips in front of the teacher and inexplicably dumps the bowl of water in the boy’s lap. The boy pretends to be angry, but all the while is saying to himself, “Thank you, Lord! Thank you, Lord!” Now all of a sudden, instead of being the object of ridicule, the boy is the object of sympathy. The teacher rushes him downstairs and gives him gym shorts to put on while his pants dry out. All the other children are on their hands and knees cleaning up around his desk. The sympathy is wonderful. But as life would have it, the ridicule that should have been his has been transferred to someone else – Susie.  She tries to help, but they tell her to get out. “You’ve done enough, you klutz!” Finally, at the end of the day, as they are waiting for the bus, the boy walks over to Susie and whispers, “You did that on purpose, didn’t you?” Susie whispers back, “I wet my pants once too.” Moral:  All of us go through all good and bad things in life.  We should always remember how we felt when we were in same condition and should not mock others for being in it.  Always try to understand their situation as if you are in it and help much as possible praying to god that today you are in a condition to help someone who needs it.", "A wealthy man requested an old scholar to wean his son away from his bad habits.  The scholar took the youth for a stroll through a garden. Stopping suddenly he asked the boy to pull out a tiny plant growing there. The youth held the plant between his thumb and forefinger and pulled it out. The old man then asked him to pull out a slightly bigger plant. The youth pulled hard and the plant came out, roots and all. “Now pull out that one,” said the old man pointing to a bush. The boy had to use all his strength to pull it out. “Now take this one out,” said the old man, indicating a guava tree. The youth grasped the trunk and tried to pull it out. But it would not budge. “It’s impossible,” said the boy, panting with the effort. “So it is with bad habits,” said the sage. “When they are young it is easy to pull them out but when they take hold they cannot be uprooted.” The session with the old man changed the boy’s life. Moral: Don’t wait for Bad Habits to grow in you, drop them while you have control over it else they will get control you." };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life);

        ListView lv = (ListView) findViewById(R.id.Mylist);
        Life.MyAdapter myAdapter= new Life.MyAdapter(getApplicationContext(),title);
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ii =new Intent(Life.this,Full_story.class);

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
