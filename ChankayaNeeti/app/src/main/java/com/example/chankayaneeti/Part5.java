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

public class Part5 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/23","2/23","3/23", "4/23","5/23","6/23","7/23","8/23","9/23","10/23","11/23","12/23","13/23","14/23","15/23","16/23","17/23","18/23","19/23","20/23","21/23","22/23","23/23"};
    String head="अध्याय :- 5";
    String story[]={"ब्राह्मणों को अग्नि की पूजा करनी चाहिए . दुसरे लोगों को ब्राह्मण की पूजा करनी चाहिए . पत्नी को  पति की पूजा करनी चाहिए तथा  दोपहर के भोजन के लिए जो अतिथि आये उसकी सभी को पूजा करनी चाहिए .", "सोने की परख उसे घिस कर, काट कर, गरम कर के और पीट कर की जाती है. उसी तरह व्यक्ति का परीक्षण वह कितना त्याग करता है, उसका आचरण कैसा है, उसमे गुण कौनसे है और उसका व्यवहार कैसा है इससे होता है.", "यदि आप पर मुसीबत आती नहीं है तो उससे सावधान रहे. लेकिन यदि मुसीबत आ जाती है तो किसी भी तरह उससे छुटकारा पाए.", "अनेक व्यक्ति जो एक ही गर्भ से पैदा हुए है या एक ही नक्षत्र में पैदा हुए है वे एकसे नहीं रहते. उसी प्रकार जैसे बेर के झाड के सभी बेर एक से नहीं रहते.", "वह व्यक्ति जिसके हाथ स्वच्छ है कार्यालय में काम नहीं करना चाहता. जिस ने अपनी कामना को ख़तम कर दिया है, वह शारीरिक शृंगार नहीं करता, जो आधा पढ़ा हुआ व्यक्ति है वो मीठे बोल बोल नहीं सकता. जो सीधी बात करता है वह धोका नहीं दे सकता.", "मूढ़ लोग बुद्धिमानो से इर्ष्या करते है. गलत मार्ग पर चलने वाली औरत पवित्र स्त्री से इर्ष्या करती है. बदसूरत औरत खुबसूरत औरत से इर्ष्या करती है.", "खाली बैठने से अभ्यास का नाश होता है. दुसरो को देखभाल करने के लिए देने से पैसा नष्ट होता है. गलत ढंग से बुवाई करने वाला किसान अपने बीजो का नाश करता है. यदि सेनापति नहीं है तो सेना का नाश होता है.", "अर्जित विद्या अभ्यास से सुरक्षित रहती है. घर की इज्जत अच्छे व्यवहार से सुरक्षित रहती है. अच्छे गुणों से इज्जतदार आदमी को मान मिलता है. किसीभी व्यक्ति का गुस्सा उसकी आँखों में दिखता है.", "धर्मं की रक्षा पैसे से होती है. ज्ञान की रक्षा जमकर आजमाने से होती है. राजा से रक्षा उसकी बात मानने से होती है. घर की रक्षा एक दक्ष गृहिणी से होती है.", "जो वैदिक ज्ञान की निंदा करते है, शास्र्त सम्मत जीवनशैली की मजाक उड़ाते है, शांतीपूर्ण स्वभाव के लोगो की मजाक उड़ाते है, बिना किसी आवश्यकता के दुःख को प्राप्त होते है.", "दान गरीबी को ख़त्म करता है. अच्छा आचरण दुःख को मिटाता है. विवेक अज्ञान को नष्ट करता है. जानकारी भय को समाप्त करती है.", "वासना के समान दुष्कर कोई रोग नहीं. मोह के समान कोई शत्रु नहीं. क्रोध के समान अग्नि नहीं. स्वरुप ज्ञान के समान कोई बोध नहीं.", "व्यक्ति अकेले ही पैदा होता है. अकेले ही मरता है. अपने कर्मो के शुभ अशुभ परिणाम अकेले ही भोगता है. अकेले ही नरक में जाता है या सदगति प्राप्त करता है.", "जिसने अपने स्वरुप को जान लिया उसके लिए स्वर्ग तो तिनके के समान है. एक पराक्रमी योद्धा अपने जीवन को तुच्छ मानता है. जिसने अपनी कामना को जीत लिया उसके लिए स्त्री भोग का विषय नहीं. उसके लिए सम्पूर्ण ब्रह्माण्ड तुच्छ है जिसके मन में कोई आसक्ति नहीं.", "जब आप सफ़र पर जाते हो तो विद्यार्जन ही आपका मित्र है. घर में पत्नी मित्र है. बीमार होने पर दवा मित्र है. अर्जित पुण्य मृत्यु के बाद एकमात्र मित्र है.", "समुद्र में होने वाली वर्षा व्यर्थ है. जिसका पेट भरा हुआ है उसके लिए अन्न व्यर्थ है. पैसे वाले आदमी के लिए भेट वस्तु का कोई अर्थ नहीं. दिन के समय जलता दिया व्यर्थ है.", "वर्षा के जल के समान कोई जल नहीं. खुदकी शक्ति के समान कोई शक्ति नहीं. नेत्र ज्योति के समान कोई प्रकाश नहीं. अन्न से बढ़कर कोई संपत्ति नहीं.", "निर्धन को धन की कामना. पशु को वाणी की कामना. लोगो को स्वर्ग की कामना. देव लोगो को मुक्ति की कामना.", "सत्य की शक्ति ही इस दुनिया को धारण करती है. सत्य की शक्ति से ही सूर्य प्रकाशमान है, हवाए चलती है, सही में सब कुछ सत्य पर आश्रित है.", "लक्ष्मी जो संपत्ति की देवता है, वह चंचला है. हमारी श्वास भी चंचला है. हम कितना समय जियेंगे इसका कोई ठिकाना नहीं. हम कहा रहेंगे यह भी पक्का नहीं. कोई बात यहाँ पर पक्की है तो यह है की हमारा अर्जित पुण्य कितना है.", "आदमियों में नाई सबसे धूर्त है. कौवा पक्षीयों में धूर्त है. लोमड़ी प्राणीयो में धूर्त है. औरतो में लम्पट औरत सबसे धूर्त है.", "ये सब आपके पिता है...१. जिसने आपको जन्म दिया. २. जिसने आपका यज्ञोपवित संस्कार किया. ३. जिसने आपको पढाया. ४. जिसने आपको भोजन दिया. ५. जिसने आपको भयपूर्ण परिस्थितियों में बचाया.", "इन सब को  आपनी माता समझें .१. राजा की पत्नी २. गुरु की पत्नी ३. मित्र की पत्नी ४. पत्नी की माँ ५. आपकी माँ."  };


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
        if(current < 22) {
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
