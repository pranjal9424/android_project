package com.example.chankayaneeti;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Part16 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/16","2/16","3/16", "4/16","5/16","6/16","7/16","8/16","9/16","10/16","11/16","12/16","13/16","14/16","15/16","16/16"};
    String head="अध्याय :- 16";
    String story[]={"स्त्री (यहाँ लम्पट स्त्री या पुरुष अभिप्रेत है) का ह्रदय पूर्ण नहीं है वह बटा हुआ है. जब वह एक आदमी से बात करती है तो दुसरे की ओर वासना से देखती है और मन में तीसरे को चाहती है.", "मुर्ख को लगता है की वह हसीन लड़की उसे प्यार करती है. वह उसका गुलाम बन जाता है और उसके इशारो पर नाचता है.", "ऐसा यहाँ कौन है जिसमे दौलत पाने के बाद मस्ती नहीं आई. क्या कोई बेलगाम आदमी अपने संकटों पर रोक लगा पाया. इस दुनिया में किस आदमी को औरत ने कब्जे में नहीं किया. किस के ऊपर राजा की हरदम मेहेरबानी रही. किसके ऊपर समय के प्रकोप नहीं हुए. किस भिखारी को यहाँ शोहरत मिली. किस आदमी ने दुष्ट के दुर्गुण पाकर सुख को प्राप्त किया.", "व्यक्ति को महत्ता उसके गुण प्रदान करते है वह जिन पदों पर काम करता है सिर्फ उससे कुछ नहीं होता. क्या आप एक कौवे को गरुड़ कहेंगे यदि वह एक ऊँची ईमारत के छत पर जाकर बैठता है.", "जो व्यक्ति गुणों से रहित है लेकिन जिसकी लोग सराहना करते है वह दुनिया में काबिल माना जा सकता है. लेकिन जो आदमी खुद की ही डींगे हाकता है वो अपने आप को दुसरे की नजरो में गिराता है भले ही वह स्वर्ग का राजा इंद्र हो.", "यदि एक विवेक संपन्न व्यक्ति अच्छे गुणों का परिचय देता है तो उसके गुणों की आभा को रत्न जैसी मान्यता मिलती है. एक ऐसा रत्न जो प्रज्वलित है और सोने के अलंकर में मढने पर और चमकता है.", "वह व्यक्ति जो सर्व गुण संपन्न है अपने आप को सिद्ध नहीं कर सकता है जबतक उसे समुचित संरक्षण नहीं मिल जाता. उसी प्रकार जैसे एक मणि तब तक नहीं निखरता जब तक उसे आभूषण में सजाया ना जाए.", "मुझे वह दौलत नहीं चाहिए जिसके लिए कठोर यातना सहनी पड़े, या सदाचार का त्याग करना पड़े या अपने शत्रु की चापलूसी करनी पड़े.", "जो अपनी दौलत, पकवान और औरते भोगकर संतुष्ट नहीं हुए ऐसे बहोत लोग पहले मर चुके है. अभी भी मर रहे है और भविष्य में भी मरेंगे.", "सभी परोपकार और तप तात्कालिक लाभ देते है. लेकिन सुपात्र को जो दान दिया जाता है और सभी जीवो को जो संरक्षण प्रदान किया जाता है उसका पुण्य कभी नष्ट नहीं होता.", "घास का तिनका हल्का है. कपास उससे भी हल्का है. भिखारी तो अनंत गुना हल्का है. फिर हवा का झोका उसे उड़ाके क्यों नहीं ले जाता. क्योकि वह डरता है कही वह भीख न मांग ले.", "बेइज्जत होकर जीने से अच्छा है की मर जाए. मरने में एक क्षण का दुःख होता है पर बेइज्जत होकर जीने में हर रोज दुःख उठाना पड़ता है.", "सभी जीव मीठे वचनों से आनंदित होते है. इसीलिए हम सबसे मीठे वचन कहे. मीठे वचन की कोई कमी नहीं है.", "इस दुनिया के वृक्ष को दो मीठे फल लगे है. मधुर वचन और सत्संग.", "पहले के जन्मो की अच्छी आदते जैसे दान, विद्यार्जन और तप इस जनम में भी चलती रहती है. क्योकि सभी जनम एक श्रुंखला से जुड़े है.", "जिसका ज्ञान किताबो में सिमट गया है और जिसने अपनी दौलत दुसरो के सुपुर्द कर दी है वह जरुरत आने पर ज्ञान या दौलत कुछ भी इस्तमाल नहीं कर सकता."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part1);

        //toolbar
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sto=(TextView)findViewById(R.id.summary);
        rt=(TextView)findViewById(R.id.ratio);
        hd=(TextView)findViewById(R.id.top);

        sto.setText(story[current]);
        rt.setText(page[current]);
        hd.setText(head);

        FloatingActionButton btnshare=(FloatingActionButton) findViewById(R.id.btnshare);
        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = sto.getText().toString();
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
                view.getContext().startActivity(Intent.createChooser(sharingIntent, "Share Story via"));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.btncopy:
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                clipboard.setText(sto.getText());
                Toast.makeText(getApplicationContext(), "Message copied",
                        Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void next(View view){
        if(current < 15) {
            current++;
            sto.setText(story[current]);
            rt.setText(page[current]);
        }
    }

    public void prev(View view){
        if(current > 0) {
            current--;
            sto.setText(story[current]);
            rt.setText(page[current]);
        }
    }

}