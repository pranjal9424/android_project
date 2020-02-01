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

public class Inspiration extends AppCompatActivity {
    String title[] = {"The elephant rop","Thinking out of the box", "the group of frog","a pound of butter"};
    String story[]={"As a man was passing the elephants, he suddenly stopped, confused by the fact that these huge creatures were being held by only a small rope tied to their front leg. No chains, no cages. It was obvious that the elephants could, at anytime, break away from their bonds but for some reason, they did not. He saw a trainer nearby and asked why these animals just stood there and made no attempt to get away. “Well,” trainer said, “when they are very young and much smaller we use the same size rope to tie them and, at that age, it’s enough to hold them. As they grow up, they are conditioned to believe they cannot break away. They believe the rope can still hold them, so they never try to break free.” The man was amazed. These animals could at any time break free from their bonds but because they believed they couldn’t, they were stuck right where they were.", "In a small Italian town, hundreds of years ago, a small business owner owed a large sum of money to a loan-shark. The loan-shark was a very old, unattractive looking guy that just so happened to fancy the business owner’s daughter. He decided to offer the businessman a deal that would completely wipe out the debt he owed him. However, the catch was that we would only wipe out the debt if he could marry the businessman’s daughter. Needless to say, this proposal was met with a look of disgust. The loan-shark said that he would place two pebbles into a bag, one white and one black. The daughter would then have to reach into the bag and pick out a pebble. If it was black, the debt would be wiped, but the loan-shark would then marry her. If it was white, the debt would also be wiped, but the daughter wouldn’t have to marry the loan-shark. Standing on a pebble-strewn path in the businessman’s garden, the loan-shark bent over and picked up two pebbles. Whilst he was picking them up, the daughter noticed that he’d picked up two black pebbles and placed them both into the bag. He then asked the daughter to reach into the bag and pick one. The daughter naturally had three choices as to what she could have done: Refuse to pick a pebble from the bag. Take both pebbles out of the bag and expose the loan-shark for cheating. Pick a pebble from the bag fully well knowing it was black and sacrifice herself for her father’s freedom. She drew out a pebble from the bag, and before looking at it ‘accidentally’ dropped it into the midst of the other pebbles. She said to the loan-shark; “Oh, how clumsy of me. Never mind, if you look into the bag for the one that is left, you will be able to tell which pebble I picked.", "As a group of frogs was traveling through the woods, two of them fell into a deep pit. When the other frogs crowded around the pit and saw how deep it was, they told the two frogs that there was no hope left for them. However, the two frogs decided to ignore what the others were saying and they proceeded to try and jump out of the pit. Despite their efforts, the group of frogs at the top of the pit were still saying that they should just give up. That they would never make it out. Eventually, one of the frogs took heed to what the others were saying and he gave up, falling down to his death. The other frog continued to jump as hard as he could. Again, the crowd of frogs yelled at him to stop the pain and just die. He jumped even harder and finally made it out. When he got out, the other frogs said, “Did you not hear us?” The frog explained to them that he was deaf. He thought they were encouraging him the entire time.", "As a group of frogs was traveling through the woods, two of them fell into a deep pit. When the other frogs crowded around the pit and saw how deep it was, they told the two frogs that there was no hope left for them. However, the two frogs decided to ignore what the others were saying and they proceeded to try and jump out of the pit. Despite their efforts, the group of frogs at the top of the pit were still saying that they should just give up. That they would never make it out. Eventually, one of the frogs took heed to what the others were saying and he gave up, falling down to his death. The other frog continued to jump as hard as he could. Again, the crowd of frogs yelled at him to stop the pain and just die. He jumped even harder and finally made it out. When he got out, the other frogs said, “Did you not hear us?” The frog explained to them that he was deaf. He thought they were encouraging him the entire time." };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspiration);
        ListView lv = (ListView) findViewById(R.id.Mylist);
        Inspiration.MyAdapter myAdapter= new Inspiration.MyAdapter(getApplicationContext(),title);
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ii =new Intent(Inspiration.this,Full_story.class);

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
