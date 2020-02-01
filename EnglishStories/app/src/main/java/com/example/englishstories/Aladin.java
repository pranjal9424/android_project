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

public class Aladin extends AppCompatActivity {
    String title[] = {"Aladdin and the magic lamp","Aladdin story part-1", "Aladdin story part-2","ali-baba and 40 thieves"};
    String story[]={"Long time ago in China, there lived a poor boy, whose name was Aladdin. Aladdin lived with his mother. One day a rich and distinguished looking man came to their house and said to Aladdin's mother, I am a merchant from Arabia and want your son to come with me. I will reward him handsomely. Aladdin's mother instantly agreed. Little did she know that the man pretending to be a rich merchant was in reality a magician. Next day, Aladdin having packed his belongings left with the 'merchant'. After many hours of traveling the 'merchant' stopped. Aladdin too stopped, surprised that they should stop in such a desolate spot. He looked around; there was nothing in sight for miles. The 'merchant' pulled out some colored powder from his pocket and threw in the ground. The next instant the whole place was filled with smoke. As the smoke cleared, Aladdin saw a huge opening in the ground; it was a cave. The 'merchant' turned to Aladdin and said, I want you to go inside this cave; there will be more gold than you have ever seen; take as much as you want. You will also see an old lamp; please bring that back to me. Here, take this ring; it will help you. Aladdin was very suspicious but the decided to do as was told. He lowered himself into the cave, thinking all the while that it would be difficult to climb out without help. Aladdin entered the cave and just like the 'merchant' had said saw gold, jewelry, diamonds and other valuables. He filled his pockets. When this was done, he looked for the lamp it was lying in the corner, full of dust and dirty. He picked it up and ran to the cave's opening and shouted to the 'merchant', I have your lamp. Can you please pull me out? Give me the lamp, said the 'merchant'. Aladdin was not sure that he would be pulled out if he gave back the lamp; so he said, First, please pull me out. Aladdin and The GenieThis angered the 'merchant'. With a loud cry, he pulled out the same colorful powder and threw it on the cave opening, sealing it with a huge boulder. Aladdin was depressed. He thought, That was no rich merchant; he was surely a magician. I wonder why this lamp was so important to him. As he was thinking he rubbed the lamp. All of sudden a strange mist filled the room and from the mist emerged a stranger looking man. He said, My master, I am the genie of the lamp, you have rescued me; what would your wish be? Aladdin was scared but he said in quivering voice, Ta.. Take me back home. And the next moment Aladdin was home hugging his mother. He told her of the magician and the lamp. Aladdin again summoned the genie. This time when the genie appeared he was not scared. He said, Genie, I want a palace, not an old hut. Again to Aladdin and his mother's amazement in front of them was a magnificent palace. Time passed. Aladdin married the Sultan's daughter and was very happy. It so happened that the evil magician got to know of Aladdin's good fortune. He came by Aladdin's palace pretending to exchange old lamps for new. The princes, Aladdin's wife, not knowing the value of the lamp to Aladdin called out to the magician to wait. As soon as the magician saw the lamp he grabbed it from the princess' hand and rubbed it. The genie appeared, you are my master and your wish is my command, he said to the magician. Take Aladdin's palace to the great desert faraway from here, ordered the magician. When Aladdin came home, there was no palace and no princess. He guessed it must be the evil magician who had come to take revenge on him. All was not lost, Aladdin had a ring that the magician had given to him. Aladdin pulled out that ring, rubbed it. Another genie appeared. Aladdin said, Take me to my princess. Soon, Aladdin was in Arabia with his princess. He found his lamp lying on a table next to the magician. Before the magician could react, Aladdin jumped for the lamp and got hold of it. As soon as he had the lamp, Aladdin rubbed it. The genie appeared again and said, My master, Aladdin, it is indeed good to serve you again. What is it that you wish?\" \"I want you to send this magician to another world so that he never harms anybody, said Aladdin. Aladdin's wish was carried out; the evil magician disappeared forever. The genie carried Aladdin, the princes and the palace back to China. He stayed with Aladdin for the rest of his life.\", \"Aladdin is part of a centuries-old stories-within-a-story called The Thousand and One Nights (also called The Arabian Nights). The heroine, Scherherazade, is married to a murderous king, who kills his new wives one day after wedding them. To save her life, she spins a story every night (“Aladdin” is one of many) for her husband, leaves out the ending, but promises to finish it later. Night after night, cliffhangers compel the curious king to delay Scherherazade’s death to find out what happens next. Some of the most famous tales are not only of Aladdin but also Sinbad the Sailor and Ali Baba.\", \"In the both Galland’s text and Richard Burton’s popular 1885 English translation, Aladdin lives “in a city of the cities in China.” Illustrations of the tales from the Victorian era depict the story and its characters as Chinese. The setting and the characters’ ethnicity begins to shift west to Arabia and the Middle East when the story is told on the big screen in the early 20th century.\", \"Ali Baba, a poor woodcutter was in the forest when he saw forty thieves stop in front of a cave. The leader said “Open Sesame!” and before Ali Baba’s amazed eyes the sealed mouth of the cave magically opened and the men disappeared inside. To come out and close the entrance, the leader said “Close Sesame” and the cave sealed itself once more. Trembling with excitement Ali Baba waited till the thieves had left and then entered the cave after saying the magic words. To his delight he found lots of treasure. Ali Baba told his brother Kasim about the wondrous cave. Kasim set off to get some treasure for himself too. Sadly, he forgot the words to leave the cave and the thieves killed him. Ali Baba discovered his brother’s body in the cave. With the help of a slave girl called Morgiana, he was able to take Kasim’s body back home and bury it. Realising that someone else knew about their cave the thieves tracked Ali Baba down. The leader, disguised as an oil seller stayed with Ali Baba. He had brought along mules loaded with forty oil jars containing the other thieves. Clever Morgiana knew who the oil seller really was and poured boiling oil into the jars killing the other thieves. While dancing in front of the leader of the thieves Morgiana stabbed him. Ali Baba was saved and lived happily ever after " };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aladin);
        ListView lv = (ListView) findViewById(R.id.Mylist);
        Aladin.MyAdapter myAdapter= new Aladin.MyAdapter(getApplicationContext(),title);
        lv.setAdapter(myAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ii =new Intent(Aladin.this,Full_story.class);

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
