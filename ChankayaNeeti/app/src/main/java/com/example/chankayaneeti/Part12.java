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

public class Part12 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/22","2/22","3/22", "4/22","5/22","6/22","7/22","8/22","9/22","10/22","11/22","12/22","13/22","14/22","15/22","16/22","17/22","18/22","19/22","20/22","21/22","22/22"};
    String head="अध्याय :- 12";
    String story[]={"वह गृहस्थ भगवान् की कृपा को पा चुका है जिसके घर में आनंददायी वातावरण है. जिसके बच्चे गुणी है. जिसकी पत्नी मधुर वाणी बोलती है. जिसके पास अपनी जरूरते पूरा करने के लिए पर्याप्त धन है. जो अपनी पत्नी से सुखपूर्ण सम्बन्ध रखता है. जिसके नौकर उसका कहा मानते है. जिसके घर में मेहमान का स्वागत किया जाता है. जिसके घर में मंगल दायी भगवान की पूजा रोज की जाती है. जहा स्वाद भरा भोजन और पान किया जाता है. जिसे भगवान् के भक्तो की संगती में आनंद आता है.He is a blessed grhasta (householder) in whose house there is a blissful atmosphere, whose sons are talented, whose wife speaks sweetly, whose wealth is enough to satisfy his desires, who finds pleasure in the company of his wife, whose servants are obedient, in whose house hospitality is shown, the auspicious Supreme Lord is worshiped daily, delicious food and drink is partaken, and who finds joy in the company of devotees. जो एक संकट का सामना करने वाले ब्राह्मण को भक्ति भाव से अल्प दान देता है उसे बदले में विपुल लाभ होता है.", "वे लोग जो इस दुनिया में सुखी है. जो अपने संबंधियों के प्रति उदार है. अनजाने लोगो के प्रति सह्रदय है. अच्छे लोगो के प्रति प्रेम भाव रखते है. नीच लोगो से धूर्तता पूर्ण व्यवहार करते है. विद्वानों से कुछ नहीं छुपाते. दुश्मनों के सामने साहस दिखाते है. बड़ो के प्रति विनम्र और पत्नी के प्रति सख्त है.", "अरे लोमड़ी !!! उस व्यक्ति के शरीर को तुरंत छोड़ दे. जिसके हाथो ने कोई दान नहीं दिया. जिसके कानो ने कोई विद्या ग्रहण नहीं की. जिसके आँखों ने भगवान् का सच्चा भक्त नहीं देखा. जिसके पाँव कभी तीर्थ क्षेत्रो में नहीं गए. जिसने अधर्म के मार्ग से कमाए हुए धन से अपना पेट भरा. और जिसने बिना मतलब ही अपना सर ऊँचा उठा रखा है. अरे लोमड़ी !! उसे मत खा. नहीं तो तू दूषित हो जाएगी.", "धिक्कार है उन्हें जिन्हें भगवान् श्री कृष्ण जो माँ यशोदा के लाडले है उन के चरण कमलो में कोई भक्ति नहीं. मृदंग की ध्वनि धिक् तम धिक् तम करके ऐसे लोगो का धिक्कार करती है.", "बसंत ऋतू क्या करेगी यदि बास पर पत्ते नहीं आते. सूर्य का क्या दोष यदि उल्लू दिन में देख नहीं सकता. बादलो का क्या दोष यदि बारिश की बूंदे चातक पक्षी की चोच में नहीं गिरती. उसे कोई कैसे बदल सकता है जो किसी के मूल में है.", "एक दुष्ट के मन में सद्गुणों का उदय हो सकता है यदि वह एक भक्त से सत्संग करता है. लेकिन दुष्ट का संग करने से भक्त दूषित नहीं होता. जमीन पर जो फूल गिरता है उससे धरती सुगन्धित होती है लेकिन पुष्प को धरती की गंध नहीं लगती.", "उसका सही में कल्याण हो जाता है जिसे भक्त के दर्शन होते है. भक्त में तुरंत शुद्ध करने की क्षमता है. पवित्र क्षेत्र में तो लम्बे समय के संपर्क से शुद्धि होती है.", "एक अजनबी ने एक ब्राह्मण से पूछा. बताइए, इस शहर में महान क्या है?. ब्राह्मण ने जवाब दिया की खजूर के पेड़ का समूह महान है. अजनबी ने सवाल किया की यहाँ दानी कौन है? जवाब मिला के वह धोबी जो सुबह कपडे ले जाता है और शाम को लौटाता है. प्रश्न हुआ यहाँ सबसे काबिल कौन है. जवाब मिला यहाँ हर कोई दुसरे का द्रव्य और दारा हरण करने में काबिल है. प्रश्न हुआ की आप ऐसी जगह रह कैसे लेते हो? जवाब मिला की जैसे एक कीड़ा एक दुर्गन्ध युक्त जगह पर रहता है.", "वह घर जहा ब्राह्मणों के चरण कमल को धोया नहीं जाता, जहा वैदिक मंत्रो का जोर से उच्चारण नहीं होता. और जहा भगवान् को और पितरो को भोग नहीं लगाया जाता वह घर एक स्मशान है.", "सत्य मेरी माता है. अध्यात्मिक ज्ञान मेरा पिता है. धर्माचरण मेरा बंधू है. दया मेरा मित्र है. भीतर की शांति मेरी पत्नी है. क्षमा मेरा पुत्र है. मेरे परिवार में ये छह लोग है.", "हमारे शारीर नश्वर है. धन में तो कोई स्थायी भाव नहीं है. म्रत्यु हरदम हमारे निकट है. इसीलिए हमें तुरंत पुण्य कर्म करने चाहिए.", "ब्राह्मणों को स्वादिष्ट भोजन में आनंद आता है. गायो को ताज़ी कोमल घास खाने में. पत्नी को पति के सान्निध्य में. क्षत्रियो को युद्ध में आनंद आता है.", "जो दुसरे के पत्नी को अपनी माता मानता है, दुसरे को धन को मिटटी का ढेला, दुसरे के सुख दुःख को अपने सुख दुःख. उसी को सही दृष्टी प्राप्त है और वही विद्वान है.", "भगवान राम में ये सब गुण है. १. सद्गुणों में प्रीती. २. मीठे वचन ३. दान देने की तीव्र इच्छा शक्ति. ४. मित्रो के साथ कपट रहित व्यवहार. ५. गुरु की उपस्थिति में विनम्रता ६. मन की गहरी शान्ति. ६. शुद्ध आचरण ७. गुणों की परख ८. शास्त्र के ज्ञान की अनुभूति ८. रूप की सुन्दरता ९. भगवत भक्ति.", "कल्प तरु तो एक लकड़ी ही है. सुवर्ण का सुमेर पर्वत तो निश्छल है. चिंता मणि तो एक पत्थर है. सूर्य में ताप है. चन्द्रमा तो घटता बढ़ता रहता है. अमर्याद समुद्र तो खारा है. काम देव का तो शरीर ही जल गया. महाराज बलि तो राक्षस कुल में पैदा हुए. कामधेनु तो पशु ही है. भगवान् राम के समान कौन है.", "विद्या सफ़र में हमारा मित्र है. पत्नी घर पर मित्र है. औषधि रुग्ण व्यक्ति की मित्र है. मरते वक्त तो पुण्य कर्म ही मित्र है.", "राज परिवारों से शिष्टाचार सीखे. पंडितो से बोलने की कला सीखे. जुआरियो से झूट बोलना सीखे. एक औरत से छल सीखे.", "बिना सोचे समझे खर्च करने वाला, नटखट बच्चा जिसे अपना घर नहीं, झगड़े पर आमदा आदमी, अपनी पत्नी को दुर्लक्षित करने वाला, जो अपने आचरण पर ध्यान नहीं देता है. ये सब लोग जल्दी ही बर्बाद हो जायेंगे.", "एक विद्वान व्यक्ति ने अपने भोजन की चिंता नहीं करनी चाहिए. उसे सिर्फ अपने धर्म को निभाने की चिंता होनी चाहिए. हर व्यक्ति का भोजन पर जन्म से ही अधिकार है.", "जिसे दौलत, अनाज और विद्या अर्जित करने में और भोजन करने में शर्म नहीं आती वह सुखी रहता है.", "बूंद बूंद से सागर बनता है. इसी तरह बूंद बूंद से ज्ञान, गुण और संपत्ति प्राप्त होते है.", "जो व्यक्ति अपने बुढ़ापे में भी मुर्ख है वह सचमुच ही मुर्ख है. उसी प्रकार जिस प्रकार इन्द्र वरुण का फल कितना भी पके मीठा नहीं होता." };


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
