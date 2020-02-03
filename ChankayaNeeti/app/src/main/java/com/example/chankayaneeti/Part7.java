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

public class Part7 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/22","2/22","3/22", "4/22","5/22","6/22","7/22","8/22","9/22","10/22","11/22","12/22","13/22","14/22","15/22","16/22","17/22","18/22","19/22","20/22","21/22","22/22"};
    String head="अध्याय :- 7";
    String story[]={"एक बुद्धिमान व्यक्ति को निम्नलिखित बातें किसी को नहीं बतानी चाहिए .. १. की उसकी दौलत खो चुकी है. २. उसे क्रोध आ गया है. ३. उसकी पत्नी ने जो गलत व्यवहार किया. ४. लोगो ने उसे जो गालिया दी. ५. वह किस प्रकार बेइज्जत हुआ है.", "जो व्यक्ति आर्थिक व्यवहार करने में, ज्ञान अर्जन करने में, खाने में और काम-धंदा करने में शर्माता नहीं है वो सुखी हो जाता है.", "जो सुख और शांति का अनुभव स्वरुप ज्ञान को प्राप्त करने से होता है, वैसा अनुभव जो लोभी लोग धन के लोभ में यहाँ वहा भटकते रहते है उन्हें नहीं होता.", "व्यक्ति नीचे दी हुए ३ चीजो से संतुष्ट रहे... १. खुदकी पत्नी २. वह भोजन जो विधाता ने प्रदान किया. ३. उतना धन जितना इमानदारी से मिल गया.", "लेकिन व्यक्ति को नीचे दी हुई ३ चीजो से संतुष्ट नहीं होना चाहिए... १. अभ्यास २. भगवान् का नाम स्मरण. ३. परोपकार", "इन दोनों के मध्य से कभी ना जाए.. १. दो ब्राह्मण. २. ब्राह्मण और उसके यज्ञ में जलने वाली अग्नि. ३. पति पत्नी. ४. स्वामी और उसका चाकर. ५. हल और बैल.", "अपना पैर कभी भी इनसे न छूने दे...१. अग्नि २. अध्यात्मिक गुरु ३. ब्राह्मण ४. गाय ५. एक कुमारिका ६. एक उम्र में बड़ा आदमी. ५. एक बच्चा.", "हाथी से हजार गज की दुरी रखे. घोड़े से सौ की. सिंग वाले जानवर से दस की. लेकिन दुष्ट जहा हो उस जगह से ही निकल जाए.", "हाथी को अंकुश से नियंत्रित करे. घोड़े को थप थपा के. सिंग वाले जानवर को डंडा दिखा के. एक बदमाश को तलवार से.", "ब्राह्मण अच्छे भोजन से तृप्त होते है. मोर मेघ गर्जना से. साधू दुसरो की सम्पन्नता देखकर और दुष्ट दुसरो की विपदा देखकर.", "एक शक्तिशाली आदमी से उसकी बात मानकर समझौता करे. एक दुष्ट का प्रतिकार करे. और जिनकी शक्ति आपकी शक्ति के बराबर है उनसे समझौता विनम्रता से या कठोरता से करे.", "एक राजा की शक्ति उसकी शक्तिशाली भुजाओ में है. एक ब्राह्मण की शक्ति उसके स्वरुप ज्ञान में है. एक स्त्री की शक्ति उसकी सुन्दरता, तारुण्य और मीठे वचनों में है.", "अपने व्यवहार में बहुत सीधे ना रहे. आप यदि वन जाकर देखते है तो पायेंगे की जो पेड़ सीधे उगे उन्हें काट लिया गया और जो पेड़ आड़े तिरछे है वो खड़े है.", "हंस वहा रहते है जहा पानी होता है. पानी सूखने पर वे उस जगह को छोड़ देते है. आप किसी आदमी को ऐसा व्यवहार ना करने दे की वह आपके पास आता जाता रहे.", "संचित धन खर्च करने से बढ़ता है. उसी प्रकार जैसे ताजा जल जो अभी आया है बचता है, यदि पुराने स्थिर जल को निकल बहार किया जाये.", "वह व्यक्ति जिसके पास धन है उसके पास मित्र और सम्बन्धी भी बहोत रहते है. वही इस दुनिया में टिक पाता है और उसीको इज्जत मिलती है.", "स्वर्ग में निवास करने वाले देवता लोगो में और धरती पर निवास करने वाले लोगो में कुछ साम्य पाया जाता है. उनके समान गुण है १. परोपकार २. मीठे वचन ३. भगवान् की आराधना. ४. ब्राह्मणों के जरूरतों की पूर्ति.", "नरक में निवास करने वाले और धरती पर निवास करने वालो में साम्यता - १. अत्याधिक क्रोध २. कठोर वचन ३. अपने ही संबंधियों से शत्रुता ४. नीच लोगो से मैत्री ५. हीन हरकते करने वालो की चाकरी.", "यदि आप शेर की गुफा में जाते हो तो आप को हाथी के माथे का मणि मिल सकता है. लेकिन यदि आप लोमड़ी जहा रहती है वहा जाते हो तो बछड़े की पूछ या गधे की हड्डी के अलावा कुछ नहीं मिलेगा.", "एक अनपढ़ आदमी की जिंदगी किसी कुत्ते की पूछ की तरह बेकार है. उससे ना उसकी इज्जत ही ढकती है और ना ही कीड़े मक्खियों को भागने के काम आती है.", "यदि आप दिव्यता चाहते है तो आपके वाचा, मन और इन्द्रियों में शुद्धता होनी चाहिए. उसी प्रकार आपके ह्रदय में करुणा होनी चाहिए.", "जिस  प्रकार एक फूल में खुशबु है. तील में तेल है. लकड़ी में अग्नि है. दूध में घी है. गन्ने में गुड है. उसी प्रकार यदि आप ठीक से देखते हो तो हर व्यक्ति में परमात्मा है." };


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
        if(current < 21) {
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