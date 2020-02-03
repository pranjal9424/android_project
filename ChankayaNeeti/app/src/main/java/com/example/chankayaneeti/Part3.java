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

public class Part3 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/21","2/21","3/21", "4/21","5/21","6/21","7/21","8/21","9/21","10/21","11/21","12/21","13/21","14/21","15/21","16/21","17/21","18/21","19/21","20/21","21/21"};
    String head="अध्याय :- 3";
    String story[]={"1. इस दुनिया  मे ऐसा किसका घर है जिस पर कोई कलंक नहीं, वह कौन है जो रोग और दुख से मुक्त है.सदा सुख किसको रहता है?", "२. मनुष्य के कुल की ख्याति उसके आचरण से होती है, मनुष्य के बोल चल से उसके देश की ख्याति बढ़ती है, मान सम्मान उसके प्रेम को बढ़ता है, एवं उसके शारीर का गठन उसे भोजन से बढ़ता है. ", "३. लड़की का बयाह अच्छे खानदान मे करना चाहिए. पुत्र  को अचछी शिक्षा देनी चाहिए,  शत्रु को आपत्ति और कष्टों में डालना चाहिए, एवं मित्रों को धर्म कर्म में लगाना चाहिए.", "4. एक दुर्जन और एक सर्प मे यह अंतर है की साप तभी डंख मरेगा जब उसकी जान को खतरा हो लेकिन दुर्जन पग पग पर हानि पहुचने की कोशिश करेगा .", "५. राजा लोग अपने आस पास अच्छे कुल के लोगो को इसलिए रखते है क्योंकि ऐसे लोग ना आरम्भ मे, ना बीच मे और  ना ही  अंत मे साथ छोड़कर जाते है.", "६. जब प्रलय का समय आता है तो समुद्र भी अपनी मयारदा छोड़कर किनारों को छोड़ अथवा तोड़ जाते है, लेकिन सज्जन पुरुष प्रलय के सामान भयंकर आपत्ति अवं विपत्ति में भी आपनी मर्यादा नहीं बदलते.", "७. मूर्खो के साथ मित्रता नहीं रखनी चाहिए उन्हें त्याग देना ही उचित है, क्योंकि प्रत्यक्ष रूप से वे दो पैरों वाले पशु के सामान हैं,जो अपने  धारदार वचनो से वैसे ही हदय को छलनी करता है जैसे अदृश्य काँटा शारीर में घुसकर छलनी करता है .", "८. रूप और यौवन से सम्पन्न तथा कुलीन परिवार में जन्मा लेने पर भी विद्या हीन पुरुष पलाश के फूल के समान है जो सुन्दर तो है लेकिन खुशबु रहित है.", "९. कोयल की सुन्दरता उसके गायन मे है. एक स्त्री की सुन्दरता उसके अपने पिरवार के प्रति समर्पण मे है. एक बदसूरत आदमी की सुन्दरता उसके ज्ञान मे है तथा एक तपस्वी की सुन्दरता उसकी क्षमाशीलता मे है.", "१०. कुल की रक्षा के लिए  एक सदस्य का बिलदान दें,गाव की रक्षा के लिए एक कुल  का बिलदान  दें, देश  की रक्षा के लिए एक गाव का बिलदान  दें, आतमा की रक्षा के लिए देश का बिलदान  दें.", "११.जो उद्यमशील हैं, वे गरीब नहीं हो सकते, जो हरदम भगवान को याद करते है उनहे पाप नहीं छू सकता. जो मौन रहते है वो झगड़ों मे नहीं पड़ते. जो जागृत रहते है वो िनभरय होते है.", "12. आत्याधिक सुन्दरता के कारन सीताहरण हुआ, अत्यंत घमंड के कारन रावन का अंत हुआ,  अत्यधिक दान देने के कारन रजा बाली को बंधन में बंधना पड़ा, अतः सर्वत्र अति को त्यागना चाहिए.", "१3. शक्तिशाली लोगों के लिए कौनसा कार्य कठिन है ? व्यापारिओं के लिए कौनसा जगह दूर है, विद्वानों के लिए कोई देश विदेश नहीं है, मधुभाषियों का कोई शत्रु नहीं. ", "१४. जिस तरह सारा वन केवल एक ही पुष्प अवं सुगंध भरे  वृक्ष से महक जाता है उसी तरह एक ही गुणवान पुत्र  पुरे कुल का नाम बढाता है.", "१५. जिस प्रकार केवल एक सुखा हुआ जलता वृक्ष सम्पूर्ण वन को जला देता है उसी प्रकार एक ही कुपुत्र सरे कुल के मान, मर्यादा और प्रतिष्ठा को नष्ट कर देता है.", "१६. विद्वान एवं सदाचारी एक ही पुत्र के कारन सम्पूर्ण परिवार वैसे ही खुशहाल रहता है जैसे चन्द्रमा के निकालने पर रात्रि जगमगा उठती है.", "१७. ऐसे अनेक पुत्र किस काम के जो दुःख और निराशा पैदा करे. इससे तो वह एक ही पुत्र अच्छा है जो समपूणर घर को सहारा और शांित पदान करे.", "१८. पांच साल तक पुत्र को लाड एवं प्यार से पालन करना चाहिए, दस साल तक उसे छड़ी की मार से डराए. लेकिन जब वह १६ साल का हो जाए तो उससे मित्र के समान वयवहार करे.", " १९. वह व्यक्ति सुरक्षित रह सकता है जो नीचे दी हुई परिस्थितियां उत्पन्न होने पर भाग जाए. १. भयावह आपदा. २. विदेशी आक्रमण ३. भयंकर अकाल ४. दुष व्यक्ति का संग.", "२०. जो व्यक्ति निम्नलिखित बाते अर्जित नहीं करता वह बार बार जनम लेकर मरता है. १. धमर २. अर्थ ३. काम ४. मोक्ष", "२१. धन की देवी लक्ष्मी स्वयं वहां चली आती है जहाँ ... १. मूखो का सम्मान नहीं होता. २. अनाज का अचछे से भणडारण िकया जाता है. ३. पित, पत्नी मे आपस मे लड़ाई बखेड़ा नहीं होता है." };


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
        if(current < 20) {
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