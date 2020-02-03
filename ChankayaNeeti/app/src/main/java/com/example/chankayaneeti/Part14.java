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

public class Part14 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/19","2/19","3/19", "4/19","5/19","6/19","7/19","8/19","9/19","10/19","11/19","12/19","13/19","14/19","15/19","16/19","17/19","18/19","19/19"};
    String head="अध्याय :- 14";
    String story[]={"गरीबी, दुःख और एक बंदी का जीवन यह सब व्यक्ति के किए हुए पापो का ही फल है.", "आप दौलत, मित्र, पत्नी और राज्य गवाकर वापस पा सकते है लेकिन यदि आप अपनी काया गवा देते है तो वापस नहीं मिलेगी.", "यदि हम बड़ी संख्या में एकत्र हो जाए तो दुश्मन को हरा सकते है. उसी प्रकार जैसे घास के तिनके एक दुसरे के साथ रहने के कारण भारी बारिश में भी क्षय नहीं होते.", "पानी पर तेल, एक कमीने आदमी को बताया हुआ राज, एक लायक व्यक्ति को दिया हुआ दान और एक बुद्धिमान व्यक्ति को पढाया हुआ शास्त्रों का ज्ञान अपने स्वभाव के कारण तेजी से फैलते है.", "वह व्यक्ति क्यों मुक्ति को नहीं पायेगा जो निम्न लिखित परिस्थितियों में जो उसके मन की अवस्था होती है उसे कायम रखता है... जब वह धर्म के अनुदेश को सुनता है. जब वह स्मशान घाट में होता है. जब वह बीमार होता है.", "वह व्यक्ति क्यों पूर्णता नहीं हासिल करेगा जो पश्चाताप में जो मन की अवस्था होती है, उसी अवस्था को काम करते वक़्त बनाए रखेंगा.", "हमें अभिमान नहीं होना चाहिए जब हम ये बाते करते है.. १. परोपकार २. आत्म संयम ३. पराक्रम ४. शास्त्र का ज्ञान हासिल करना. ५. विनम्रता ६. नीतिमत्ता यह करते वक़्त अभिमान करने की इसलिए जरुरत नहीं क्यों की दुनिया बहुत कम दिखाई देने वाले दुर्लभ रत्नों से भरी पड़ी है.", "वह जो हमारे मन में रहता हमारे निकट है. हो सकता है की वास्तव में वह हमसे बहुत दूर हो. लेकिन वह व्यक्ति जो हमारे निकट है लेकिन हमारे मन में नहीं है वह हमसे बहोत दूर है.", "यदि हम किसीसे कुछ पाना चाहते है तो उससे ऐसे शब्द बोले जिससे वह प्रसन्न हो जाए. उसी प्रकार जैसे एक शिकारी मधुर गीत गाता है जब वह हिरन पर बाण चलाना चाहता है.", "जो व्यक्ति राजा से, अग्नि से, धर्म गुरु से और स्त्री से बहुत परिचय बढ़ाता है वह विनाश को प्राप्त होता है. जो व्यक्ति इनसे पूर्ण रूप से अलिप्त रहता है, उसे अपना भला करने का कोई अवसर नहीं मिलता. इसलिए इनसे सुरक्षित अंतर रखकर सम्बन्ध रखना चाहिए.", "हम इनके साथ बहुत सावधानी से पेश आये.. १. अग्नि २. पानी ३. औरत ४. मुर्ख ५. साप ६. राज परिवार के सदस्य. जब जब हम इनके संपर्क में आते है. क्योकि ये हमें एक झटके में मौत तक पंहुचा सकते है.", "वही व्यक्ति जीवित है जो गुणवान है और पुण्यवान है. लेकिन जिसके पास धर्म और गुण नहीं उसे क्या शुभ कामना दी जा सकती है.", "यदि आप दुनिया को एक काम करके जितना चाहते हो तो इन पंधरा को अपने काबू में रखो. इन्हें इधर उधर ना भागने दे. पांच इन्द्रियों के विषय १. जो दिखाई देता है २. जो सुनाई देता है ३. जिसकी गंध आती है ४. जिसका स्वाद आता है. ५. जिसका स्पर्श होता है. पांच इन्द्रिय १. आँख २. कान ३. नाक ४. जिव्हा ५. त्वचा पांच कर्मेन्द्रिय १. हाथ २. पाँव ३. मुह ४. जननेंद्रिय ५. गुदा", "वही पंडित है जो वही बात बोलता है जो प्रसंग के अनुरूप हो. जो अपनी शक्ति के अनुरूप दुसरो की प्रेम से सेवा करता है. जिसे अपने क्रोध की मर्यादा का पता है.", "एक ही वस्तु देखने वालो की योग्यता के अनुरूप बिलग बिलग दिखती है. तप करने वाले में वस्तु को देखकर कोई कामना नहीं जागती. लम्पट आदमी को हर वास्तु में स्त्री दिखती है. कुत्ते को हर वस्तु में मांस दिखता है.", "जो व्यक्ति बुद्धिमान है वह निम्न लिखित बाते किसी को ना बताये... वह औषधि उसने कैसे बनायीं जो अच्छा काम कर रही है. वह परोपकार जो उसने किया. उसके घर के झगडे. उसकी उसके पत्नी के साथ होने वाली व्यक्तिगत बाते. उसने जो ठीक से न पका हुआ खाना खाया. जो गालिया उसने सुनी.", "कोकिल तब तक मौन रहते है. जबतक वो मीठा गाने की क़ाबलियत हासिल नहीं कर लेते और सबको आनंद नहीं पंहुचा सकते.", "हम निम्न लिखित बाते प्राप्त करे और उसे कायम रखे. हमें पुण्य कर्म के जो आशीर्वाद मिले. धन, अनाज, वो शब्द जो हमने हमारे अध्यात्मिक गुरु से सुने. कम पायी जाने वाली दवाइया. हम ऐसा नहीं करते है तो जीना मुश्किल हो जाएगा.", "कुसंग का त्याग करे और संत जानो से मेलजोल बढाए. दिन और रात गुणों का संपादन करे. उसपर हमेशा चिंतन करे जो शाश्वत है और जो अनित्य है उसे भूल जाए." };


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
        if(current < 18) {
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
