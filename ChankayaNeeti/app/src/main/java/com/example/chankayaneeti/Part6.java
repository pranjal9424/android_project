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

public class Part6 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/21","2/21","3/21", "4/21","5/21","6/21","7/21","8/21","9/21","10/21","11/21","12/21","13/21","14/21","15/21","16/21","17/21","18/21","19/21","20/21","21/21"};
    String head="अध्याय :- ";
    String story[]={"श्रवण करने से धर्मं का ज्ञान होता है, द्वेष दूर होता है, ज्ञान की प्राप्ति होती है और माया की आसक्ति से मुक्ति होती है.", "पक्षीयों में कौवा नीच है. पशुओ में कुत्ता नीच है. जो तपस्वी पाप करता है वो घिनौना है. लेकिन जो दूसरो की निंदा करता है वह सबसे बड़ा चांडाल है.", "राख से घिसने पर पीतल चमकता है . ताम्बा इमली से साफ़ होता है. औरते प्रदर से शुद्ध होती है. नदी बहती रहे तो साफ़ रहती है.", "राजा, ब्राह्मण और तपस्वी योगी जब दुसरे देश जाते है, तो आदर पाते है. लेकिन औरत यदि भटक जाती है तो बर्बाद हो जाती है.", "धनवान व्यक्ति के कई मित्र होते है. उसके कई सम्बन्धी भी होते है. धनवान को ही आदमी कहा जाता है और पैसेवालों को ही पंडित कह कर नवाजा जाता है.", "सर्व शक्तिमान के इच्छा से ही बुद्धि काम करती है, वही कर्मो को नियंत्रीत करता है. उसी की इच्छा से आस पास में मदद करने वाले आ जाते है.", "काल सभी जीवो को निपुणता प्रदान करता है. वही सभी जीवो का संहार भी करता है. वह जागता रहता है जब सब सो जाते है. काल को कोई जीत नहीं सकता.", "जो जन्म से अंध है वो देख नहीं सकते. उसी तरह जो वासना के अधीन है वो भी देख नहीं सकते. अहंकारी व्यक्ति को कभी ऐसा नहीं लगता की वह कुछ बुरा कर रहा है. और जो पैसे के पीछे पड़े है उनको उनके कर्मो में कोई पाप दिखाई नहीं देता.", "जीवात्मा अपने कर्म के मार्ग से जाता है. और जो भी भले बुरे परिणाम कर्मो के आते है उन्हें भोगता है. अपने ही कर्मो से वह संसार में बंधता है और अपने ही कर्मो से बन्धनों से छूटता है.", "राजा को उसके नागरिको के पाप लगते है. राजा के यहाँ काम करने वाले पुजारी को राजा के पाप लगते है. पति को पत्नी के पाप लगते है. गुरु को उसके शिष्यों के पाप लगते है.", "अपने ही घर में व्यक्ति के ये शत्रु हो सकते है... उसका बाप यदि वह हरदम कर्ज में डूबा रहता है. उसकी माँ यदि वह दुसरे पुरुष से संग करती है. सुन्दर पत्नी वह लड़का जिसने शिक्षा प्राप्त नहीं की.", "एक लालची आदमी को भेट वास्तु दे कर संतुष्ट करे. एक कठोर आदमी को हाथ जोड़कर संतुष्ट करे. एक मुर्ख को सम्मान देकर संतुष्ट करे. एक विद्वान् आदमी को सच बोलकर संतुष्ट करे.", "एक बेकार राज्य का राजा होने से यह बेहतर है की व्यक्ति किसी राज्य का राजा ना हो. एक पापी का मित्र होने से बेहतर है की बिना मित्र का हो. एक मुर्ख का गुरु होने से बेहतर है की बिना शिष्य वाला हो. एक बुरीं पत्नी होने से बेहतर है की बिना पत्नी वाला हो.", "एक बेकार राज्य में लोग सुखी कैसे हो? एक पापी से किसी शान्ति की प्राप्ति कैसे हो? एक बुरी पत्नी के साथ घर में कौनसा सुख प्राप्त हो सकता है. एक नालायक शिष्य को शिक्षा देकर कैसे कीर्ति प्राप्त हो?", "शेर से एक बात सीखे. बगुले से एक. मुर्गे से चार. कौवे से पाच. कुत्ते से छह. और गधे से तीन.", "शेर से यह बढ़िया बात सीखे की आप जो भी करना चाहते हो एकदिली से और जबरदस्त प्रयास से करे.", "बुद्धिमान व्यक्ति अपने इन्द्रियों को बगुले की तरह वश में करते हुए अपने लक्ष्य को जगह, समय और योग्यता का पूरा ध्यान रखते हुए पूर्ण करे.मुर्गे से हे चार बाते सीखे... १. सही समय पर उठे. २. नीडर बने और लढ़े. ३. संपत्ति का रिश्तेदारों से उचित बटवारा करे. ४. अपने कष्ट से अपना रोजगार प्राप्त करे.", "कौवे से ये पाच बाते सीखे... १. अपनी पत्नी के साथ एकांत में प्रणय करे. २. नीडरता ३. उपयोगी वस्तुओ का संचय करे. ४. सभी ओर दृष्टी घुमाये. ५. दुसरो पर आसानी से विश्वास ना करे.", "कुत्ते से ये बाते सीखे १. बहुत भूख हो पर खाने को कुछ ना मिले या कम मिले तो भी संतोष करे. २. गाढ़ी नींद में हो तो भी क्षण में उठ जाए. ३. अपने स्वामी के प्रति बेहिचक इमानदारी रखे ४. नीडरता.", "गधे से ये तीन बाते सीखे. १. अपना बोझा ढोना ना छोड़े. २. सर्दी गर्मी की चिंता ना करे. ३. सदा संतुष्ट रहे.", "जो व्यक्ति इन बीस गुणों पर अमल करेगा वह जो भी करेगा सफल होगा." };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part1);

        sto=(TextView)findViewById(R.id.summary);
        rt=(TextView)findViewById(R.id.ratio);
        hd=(TextView)findViewById(R.id.top);


        //toolbar
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
