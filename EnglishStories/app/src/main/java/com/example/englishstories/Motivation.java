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

public class Motivation extends AppCompatActivity {
    String title[] = {"the dreaming priest","Boy's job Appraisal", "Keep your dream","Lazy donkey"};
    String story[]={"Long time ago there lived a priest who was extremely lazy and poor at the same time. He did not want to do any hard work but used to dream of being rich one day. He got his food by begging for alms. One morning he got a pot of milk as part of the alms. He was extremely delighted and went home with the pot of milk. He boiled the milk, drank some of it and put the remaining milk in a pot. He added slight curds in the pot for converting the milk to curd. He then lay down to sleep. Soon he started imagining about the pot of curd while he lay asleep. He dreamed that if he could become rich somehow all his miseries would be gone. His thoughts turned to the pot of milk he had set to form curd. He dreamed on; “By morning the pot of milk would set, it would be converted to curd. I would churn the curd and make butter from it. I would heat the butter and make ghee out of it. I will then go to that market and sell that ghee, and make some money. With that money i will buy a hen. The hen will lay may eggs which will hatch and there will be many chicken. These chicken will in turn lay hundreds of eggs and I will soon have a poultry farm of my own.” He kept on imagining. “I will sell all the hens of my poultry and buy some cows, and open a milk dairy. All the town people will buy milk from me. I will be very rich and soon I shall buy jewels. The king will buy all the jewels from me. I will be so rich that I will be able to marry an exceptionally beautiful girl from a rich family. Soon I will have a handsome son. If he does any mischief I will be very angry and to teach him a lesson, I will hit him with a big stick.”During this dream, he involuntarily picked up the stick next to his bed and thinking that he was beating his son, raised the stick and hit the pot. The pot of milk broke and he awoke from his day dream. Moral: There is no substitute for hard work. Dreams cannot be fulfilled without hard work.", "A little boy went into a drug store, reached for a soda carton and pulled it over to the telephone. He climbed onto the carton so that he could reach the buttons on the phone and proceeded to punch in seven digits (phone numbers).  The store-owner observed and listened to the conversation. Boy: ‘Lady, Can you give me the job of cutting your lawn? Woman: (at the other end of the phone line): ‘I already have someone to cut my lawn.’ Boy: ‘Lady, I will cut your lawn for half the price of the person who cuts your lawn now.’ Woman: I’m very satisfied with the person who is presently cutting my lawn. Boy: (with more perseverance): ‘Lady, I’ll even sweep your curb and your sidewalk, so on Sunday you will have the prettiest lawn in all of Palm beach, Florida.’ Woman: No, thank you. With a smile on his face, the little boy replaced the receiver.  The store-owner, who was listening to all this, walked over to the boy. Store Owner: ‘Son… I like your attitude; I like that positive spirit and would like to offer you a job.’ Boy: ‘No thanks.’ Store Owner: But you were really pleading for one. Boy: No Sir, I was just checking my performance at the Job I already have. I am the one who is working for that lady I was talking to!’ Moral: This is what we call ‘Self Appraisal’.  Every time if we don’t get ahead of others, we blame others for it.  We should look to our self and compare, find own weaknesses and work hard to throw away weaknesses.  Always Work Hard, Honest and with full Dedication.  It will always pay up.", "I have a friend named Monty Roberts who owns a horse ranch in San Isidro. He had let me use his horse ranch to put on fund-raising events to raise money for youth at risk programs. The last time I was there he introduced me by saying, “I want to tell you why I let you use my horse ranch. It all goes back to a story about a young man who was the son of an itinerant horse trainer who would go from stable to stable, race track to race track, farm to farm and ranch to ranch, training horses. As a result, the boy’s high school career was continually interrupted. When he was a senior, he was asked to write a paper about what he wanted to be and do when he grew up.” “That night he wrote a seven-page paper describing his goal of someday owning a horse ranch. He wrote about his dream in great detail and he even drew a diagram of a 200-acre ranch, showing the location of all the buildings, the stables, and the track. Then he drew a detailed floor plan for a 4,000-square-foot house that would sit on a 200-acre dream ranch.” He put a great deal of his heart into the project and the next day he handed it into his teacher. Two days later he received his paper back. On the front page was a large red F with a note that read, `See me after class.’ The boy with the dream went to see the teacher after class and asked, `Why did I receive an F?’ The teacher said, `This is an unrealistic dream for a young boy like you. You have no money. You come from an itinerant family. You have no resources. Owning a horse ranch requires a lot of money. You have to buy the land. You have to pay for the original breeding stock and later you’ll have to pay large stud fees. There’s no way you could ever do it.’ Then the teacher added, `If you will rewrite this paper with a more realistic goal, I will reconsider your grade.’ The boy went home and thought about it long and hard. He asked his father what he should do. His father said, `Look, son, you have to make up your own mind on this. However, I think it is a very important decision for you.’ Finally, after sitting with it for a week, the boy turned in the same paper, making no changes at all. He stated, “You can keep the F and I’ll keep my dream.” Monty then turned to the assembled group and said, “I tell you this story because you are sitting in my 4,000-square-foot house in the middle of my 200-acre horse ranch. I still have that school paper framed over the fireplace.” He added, “The best part of the story is that two summers ago that same schoolteacher brought 30 kids to camp out on my ranch for a week.” When the teacher was leaving, he said, “Look, Monty, I can tell you this now. When I was your teacher, I was something of a dream stealer. During those years I stole a lot of kids dreams. Fortunately, you had enough gumption not to give up on yours.” Moral: Don’t let anyone steal your dreams. Follow your heart, no matter what.   No Dream is too big or too small when one works hard to live it.  One should always try making dreams come true no matter what.", "Bhola owns a donkey called Khandya. Bhola is a very tolerant and kind master. The donkey is lazy and is always finding ways to avoid work. Once while returning with loads of salt on his back, Khandya falls in the river. He realizes that the fall has lessened the weights of the sacks as the salt has dissolved in the water. The next few days Khandya purposely falls into the water every day. Bhola is unhappy at the way Khandya is behaving because he is losing money in the process. He decides to teach Khandya a lesson. The next day instead of salt bags he loads Khandya with bags of cotton. Khandya is unaware of the change. As planned, he falls into the water and gets the bags wet. He is surprised to find the load unbearable. His otherwise master also starts beating him. Khandya learns his lesson and starts behaving. Moral: Work with honesty and sincerity because laziness will ruin you." };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);
        ListView lv = (ListView) findViewById(R.id.Mylist);
        Motivation.MyAdapter myAdapter= new Motivation.MyAdapter(getApplicationContext(),title);
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ii =new Intent(Motivation.this,Full_story.class);

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
