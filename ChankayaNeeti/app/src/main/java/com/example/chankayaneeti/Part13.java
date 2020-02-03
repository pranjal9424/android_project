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

public class Part13 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/21","2/21","3/21", "4/21","5/21","6/21","7/21","8/21","9/21","10/21","11/21","12/21","13/21","14/21","15/21","16/21","17/21","18/21","19/21","20/21","21/21"};
    String head="अध्याय :- 13";
    String story[]={"यदि आदमी एक पल के लिए भी जिए तो भी उस पल को वह शुभ कर्म करने में खर्च करे. एक कल्प तक जी कर कोई लाभ नहीं. दोनों लोक इस लोक और पर-लोक में तकलीफ होती है.", "हम उसके लिए ना पछताए जो बीत गया. हम भविष्य की चिंता भी ना करे. विवेक बुद्धि रखने वाले लोग केवल वर्तमान में जीते है.", "यह देवताओ का, संत जनों का और पालको का स्वभाव है की वे जल्दी प्रसन्न हो जाते है. निकट के और दूर के रिश्तेदार तब प्रसन्न होते है जब उनका आदर सम्मान किया जाए. उनके नहाने का, खाने पिने का प्रबंध किया जाए. पंडित जन जब उन्हें अध्यात्मिक सन्देश का मौका दिया जाता है तो प्रसन्न होते है.", "जब बच्चा माँ के गर्भ में होता है तो यह पाच बाते तय हो जाती है... १. कितनी लम्बी उम्र होगी. २. वह क्या करेगा ३. और ४. कितना धन और ज्ञान अर्जित करेगा. ५. मौत कब होगी.", "देखिये क्या आश्चर्य है? बड़े लोग अनोखी बाते करते है. वे पैसे को तो तिनके की तरह मामूली समझते है लेकिन जब वे उसे प्राप्त करते है तो उसके भार से और विनम्र होकर झुक जाते है.", "जो व्यक्ति अपने घर के लोगो से बहोत आसक्ति रखता है वह भय और दुःख को पाता है. आसक्ति ही दुःख का मूल है. जिसे सुखी होना है उसे आसक्ति छोडनी पड़ेगी.", "जो भविष्य के लिए तैयार है और जो किसी भी परिस्थिति को चतुराई से निपटता है. ये दोनों व्यक्ति सुखी है. लेकिन जो आदमी सिर्फ नसीब के सहारे चलता है वह बर्बाद होता है.", "यदि राजा पुण्यात्मा है तो प्रजा भी वैसी ही होती है. यदि राजा पापी है तो प्रजा भी पापी. यदि वह सामान्य है तो प्रजा सामान्य. प्रजा के सामने राजा का उद्हारण होता है. और वो उसका अनुसरण करती है.", "मेरी नजरो में वह आदमी मृत है जो जीते जी धर्म का पालन नहीं करता. लेकिन जो धर्म पालन में अपने प्राण दे देता है वह मरने के बाद भी बेशक लम्बा जीता है.", "जिस व्यक्ति ने न ही कोई ज्ञान संपादन किया, ना ही पैसा कमाया, मुक्ति के लिए जो आवश्यक है उसकी पूर्ति भी नहीं किया. वह एक निहायत बेकार जिंदगी जीता है जैसे के बकरी की गर्दन से झूलने वाले स्तन.", "जो नीच लोग होते है वो दुसरे की कीर्ति को देखकर जलते है. वो दुसरे के बारे में अपशब्द कहते है क्यों की उनकी कुछ करने की औकात नहीं है.", "यदि विषय बहुत प्रिय है तो वो बंधन में डालते है. विषय सुख की अनासक्ति से मुक्ति की और गति होती है. इसीलिए मुक्ति या बंधन का मूल मन ही है.", "जो आत्म स्वरुप का बोध होने से खुद को शारीर नहीं मानता, वह हरदम समाधी में ही रहता है भले ही उसका शरीर कही भी चला जाए.", "किस को सब सुख प्राप्त हुए जिसकी कामना की. सब कुछ भगवान् के हाथ में है. इसलिए हमें संतोष में जीना होगा.", "जिस प्रकार एक गाय का बछड़ा, हजारो गायो में अपनी माँ के पीछे चलता है उसी तरह कर्म आदमी के पीछे चलते है.", "जिस के काम करने में कोई व्यवस्था नहीं, उसे कोई सुख नहीं मिल सकता. लोगो के बीच या वन में. लोगो के मिलने से उसका ह्रदय जलता है और वन में तो कोई सुविधा होती ही नहीं.", "यदि आदमी उपकरण का सहारा ले तो गर्भजल से पानी निकाल सकता है. उसी तरह यदि विद्यार्थी अपने गुरु की सेवा करे तो गुरु के पास जो ज्ञान निधि है उसे प्राप्त करता है.", "हमें अपने कर्म का फल मिलता है. हमारी बुद्धि पर इसके पहले हमने जो कर्म किये है उसका निशान है. इसीलिए जो बुद्धिमान लोग है वो सोच विचार कर कर्म करते है.", "जिस व्यक्ति ने आपको अध्यात्मिक महत्ता का एक अक्षर भी पढाया उसकी पूजा करनी चाहिए. जो ऐसे गुरु का सम्मान नहीं करता वह सौ बार कुत्ते का जन्म लेता है. और आखिर चंडाल बनता है. चांडाल वह है जो कुत्ता खाता है.", "जब युग का अंत हो जायेगा तो मेरु पर्वत डिग जाएगा. जब कल्प का अंत होगा तो सातों समुद्र का पानी विचलित हो जायगा. लेकिन साधू कभी भी अपने अध्यात्मिक मार्ग से नहीं डिगेगा.", "इस धरती पर अन्न, जल और मीठे वचन ये असली रत्न है. मूर्खो को लगता है पत्थर के टुकड़े रत्न है." };


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