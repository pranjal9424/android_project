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

public class Part15 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/18","2/18","3/18", "4/18","5/18","6/18","7/18","8/18","9/18","10/18","11/18","12/18","13/18","14/18","15/18","16/18","17/18","18/18"};
    String head="अध्याय :- 15";
    String story[]={"वह व्यक्ति जिसका ह्रदय हर प्राणी मात्र के प्रति करुणा से पिघलता है. उसे जरुरत क्या है किसी ज्ञान की, मुक्ति की, सर के ऊपर जटाजूट रखने की और अपने शारीर पर राख मलने की.", "इस दुनिया में वह खजाना नहीं है जो आपको आपके सदगुरु ने ज्ञान का एक अक्षर दिया उसके कर्जे से मुक्त कर सके.", "काटो से और दुष्ट लोगो से बचने के दो उपाय है. पैर में जुते पहनो और उन्हें इतना शर्मसार करो की वो अपना सर उठा ना सके और आपसे दूर रहे.", "जो अस्वच्छ कपडे पहनता है. जिसके दात साफ़ नहीं. जो बहोत खाता है. जो कठोर शब्द बोलता है. जो सूर्योदय के बाद उठता है. उसका कितना भी बड़ा व्यक्तित्व क्यों न हो, वह लक्ष्मी की कृपा से वंचित रह जायेगा.", "जब व्यक्ति दौलत खोता है तो उसके मित्र, पत्नी, नौकर, सम्बन्धी उसे छोड़कर चले जाते है. और जब वह दौलत वापस हासिल करता है तो ये सब लौट आते है. इसीलिए दौलत ही सबसे अच्छा रिश्तेदार है.", "पाप से कमाया हुआ पैसा दस साल रह सकता है. ग्यारवे साल में वह लुप्त हो जाता है, उसकी मुद्दल के साथ.", "एक महान आदमी जब कोई गलत काम करता है तो उसे कोई कुछ नहीं कहता. एक नीच आदमी जब कोई अच्छा काम भी करता है तो उसका धिक्कार होता है. देखिये अमृत पीना तो अच्छा है लेकिन राहू की मौत अमृत पिने से ही हुई. विष पीना नुकसानदायी है लेकिन भगवान् शंकर ने जब विष प्राशन किया तो विष उनके गले का अलंकार हो गया.", "एक सच्चा भोजन वह है जो ब्राह्मण को देने के बाद शेष है. प्रेम वह सत्य है जो दुसरो को दिया जाता है. खुद से जो प्रेम होता है वह नहीं. वही बुद्धिमत्ता है जो पाप करने से रोकती है. वही दान है जो बिना दिखावे के किया जाता है.", "यदि आदमी को परख नहीं है तो वह अनमोल रत्नों को तो पैर की धुल में पडा हुआ रखता है और घास को सर पर धारण करता है. ऐसा करने से रत्नों का मूल्य कम नहीं होता और घास के तिनको की महत्ता नहीं बढती. जब विवेक बुद्धि वाला आदमी आता है तो हर चीज को उसकी जगह दिखाता है.", "शास्त्रों का ज्ञान अगाध है. वो कलाए अनंत जो हमें सीखनी छाहिये. हमारे पास समय थोडा है. जो सिखने के मौके है उसमे अनेक विघ्न आते है. इसीलिए वही सीखे जो अत्यंत महत्वपूर्ण है. उसी प्रकार जैसे हंस पानी छोड़कर उसमे मिला हुआ दूध पी लेता है.", "वह आदमी चंडाल है जो एक दूर से अचानक आये हुए थके मांदे अतिथि को आदर सत्कार दिए बिना रात्रि का भोजन खुद खाता है.", "एक व्यक्ति को चारो वेद और सभी धर्मं शास्त्रों का ज्ञान है. लेकिन उसे यदि अपने आत्मा की अनुभूति नहीं हुई तो वह उसी चमचे के समान है जिसने अनेक पकवानों को हिलाया लेकिन किसी का स्वाद नहीं चखा.", "वह लोग धन्य है, ऊँचे उठे हुए है जिन्होंने संसार समुद्र को पार करते हुए एक सच्चे ब्राह्मण की शरण ली. उनकी शरणागति ने नौका का काम किया. वे ऐसे मुसाफिरों की तरह नहीं है जो ऐसे सामान्य जहाज पर सवार है जिसके डूबने का खतरा है.", "चन्द्रमा जो अमृत से लबालब है और जो औषधियों की देवता माना जाता है, जो अमृत के समान अमर और दैदीप्यमान है. उसका क्या हश्र होता है जब वह सूर्य के घर जाता है अर्थात दिन में दिखाई देता है. तो क्या एक सामान्य आदमी दुसरे के घर जाकर लघुता को नहीं प्राप्त होगा.", "यह मधु मक्खी जो कमल की नाजुक पंखडियो में बैठकर उसके मीठे मधु का पान करती थी, वह अब एक सामान्य कुटज के फूल पर अपना ताव मारती है. क्यों की वह ऐसे देश में आ गयी है जहा कमल है ही नहीं, उसे कुटज के पराग ही अच्छे लगते है.", "हे भगवान् विष्णु, मेरे स्वामी, मै ब्राह्मणों के घर में इस लिए नहीं रहती क्यों की..... अगस्त्य ऋषि ने गुस्से में समुद्र को ( जो मेरे पिता है) पी लिया. भृगु मुनि ने आपकी छाती पर लात मारी. ब्राह्मणों को पढने में बहोत आनंद आता है और वे मेरी जो स्पर्धक है उस सरस्वती की हरदम कृपा चाहते है. और वे रोज कमल के फूल को जो मेरा निवास है जलाशय से निकलते है और भगवान् शिव की पूजा करते है.", "दुनिया में बाँधने के ऐसे अनेक तरीके है जिससे व्यक्ति को प्रभाव में लाया जा सकता है और नियंत्रित किया जा सकता है. सबसे मजबूत बंधन प्रेम का है. इसका उदाहरण वह मधु मक्खी है जो लकड़ी को छेड़ सकती है लेकिन फूल की पंखुडियो को छेदना पसंद नहीं करती चाहे उसकी जान चली जाए.", "चन्दन कट जाने पर भी अपनी महक नहीं छोड़ते. हाथी बुढा होने पर भी अपनी लीला नहीं छोड़ता. गन्ना निचोड़े जाने पर भी अपनी मिठास नहीं छोड़ता. उसी प्रकार ऊँचे कुल में पैदा हुआ व्यक्ति अपने उन्नत गुणों को नहीं छोड़ता भले ही उसे कितनी भी गरीबी में क्यों ना बसर करना पड़े." };


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
        if(current < 17) {
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
