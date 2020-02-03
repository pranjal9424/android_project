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

public class Part4 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/19","2/19","3/19", "4/19","5/19","6/19","7/19","8/19","9/19","10/19","11/19","12/19","13/19","14/19","15/19","16/19","17/19","18/19","19/19"};
    String head="अध्याय :- ";
    String story[]={"निम्नलिखित बातें माता के गर्भ में ही निश्चित हो जाती है.... १. व्यक्ति कितने साल जियेगा २. वह किस प्रकार का काम करेगा ३. उसके पास कितनी संपत्ति होगी ४. उसकी मृत्यु कब होगी .", "पुत्र , मित्र, सगे सम्बन्धी साधुओं को देखकर दूर भागते है, लेकिन जो लोग साधुओं का अनुशरण करते है उनमे भक्ति जागृत होती है और उनके उस पुण्य से उनका सारा कुल धन्य हो जाता है .", "जैसे मछली दृष्टी से, कछुआ ध्यान देकर और पंछी स्पर्श करके अपने बच्चो को पालते है, वैसे ही संतजन पुरुषों की संगती मनुष्य का पालन पोषण करती है.", "जब आपका शरीर स्वस्थ है और आपके नियंत्रण में है उसी समय आत्मसाक्षात्कार का उपाय कर लेना चाहिए क्योंकि मृत्यु हो जाने के बाद कोई कुछ नहीं कर सकता है.", "विद्या अर्जन करना यह एक कामधेनु के समान है जो हर मौसम में अमृत प्रदान करती है. वह विदेश में  माता के समान रक्षक अवं हितकारी होती है. इसीलिए विद्या को एक गुप्त धन कहा जाता है.", "सैकड़ों गुणरहित पुत्रों से अच्छा एक गुणी पुत्र है क्योंकि एक चन्द्रमा ही रात्रि के अन्धकार को भगाता है, असंख्य तारे यह काम नहीं करते.", "एक ऐसा बालक जो जन्मते वक़्त मृत था, एक मुर्ख दीर्घायु बालक से बेहतर है. पहला बालक तो एक क्षण के लिए दुःख देता है, दूसरा बालक उसके माँ बाप को जिंदगी भर दुःख की अग्नि में जलाता है.", "निम्नलिखित बाते व्यक्ति को बिना आग के ही जलाती है... १. एक छोटे गाव में बसना जहा रहने की सुविधाए उपलब्ध नहीं. २. एक ऐसे व्यक्ति के यहाँ नौकरी करना जो नीच कुल में पैदा हुआ है. ३. अस्वास्थय्वर्धक भोजन का सेवन करना. ४. जिसकी पत्नी हरदम गुस्से में होती है. ५. जिसको मुर्ख पुत्र है. ६. जिसकी पुत्री विधवा हो गयी है.", "वह गाय किस काम की जो ना तो दूध देती है ना तो बच्चे को जन्म देती है. उसी प्रकार उस बच्चे का जन्म किस काम का जो ना ही विद्वान हुआ ना ही भगवान् का भक्त हुआ.", "जब व्यक्ति जीवन के दुःख से झुलसता है उसे निम्नलिखित ही सहारा देते है... १. पुत्र और पुत्री २. पत्नी ३. भगवान् के भक्त.", "यह बाते एक बार ही होनी चाहिए.. १. राजा का बोलना. २. बिद्वान व्यक्ति का बोलना. ३. लड़की का ब्याहना.", "जब आप तप करते है तो अकेले करे. अभ्यास करते है तो दुसरे के साथ करे. गायन करते है तो तीन लोग करे. कृषि चार लोग करे. युद्ध अनेक लोग मिलकर करे.", "वही अच्छी पत्नी है जो शुचिपूर्ण है, पारंगत है, शुद्ध है, पति को प्रसन्न करने वाली है और सत्यवादी है.", "जिस व्यक्ति के पुत्र नहीं है उसका घर उजाड़ है. जिसे कोई सम्बन्धी नहीं है उसकी सभी दिशाए उजाड़ है. मुर्ख व्यक्ति का ह्रदय उजाड़ है. निर्धन व्यक्ति का सब कुछ उजाड़ है.", "जिस अध्यात्मिक सीख का आचरण नहीं किया जाता वह जहर है. जिसका पेट ख़राब है उसके लिए भोजन जहर है. निर्धन व्यक्ति के लिए लोगो का किसी सामाजिक या व्यक्तिगत कार्यक्रम में एकत्र होना जहर है.", "जिस व्यक्ति के पास धर्म और दया नहीं है उसे दूर करो. जिस गुरु के पास अध्यात्मिक ज्ञान नहीं है उसे दूर करो. जिस पत्नी के चेहरे पर हरदम घृणा है उसे दूर करो. जिन रिश्तेदारों के पास प्रेम नहीं उन्हें दूर करो.", "सतत भ्रमण करना व्यक्ति को बूढ़ा बना देता है. यदि घोड़े को हरदम बांध कर रखते है तो वह बूढा हो जाता है. यदि स्त्री उसके पति के साथ प्रणय नहीं करती हो तो बुढी हो जाती है. धुप में रखने से कपडे पुराने हो जाते है.", "इन बातो को बार बार गौर करे... सही समय सही मित्र सही ठिकाना पैसे कमाने के सही साधन पैसे खर्चा करने के सही तरीके आपके उर्जा स्रोत.", "द्विज अग्नि में भगवान् देखते है. भक्तो के ह्रदय में परमात्मा का वास होता है. जो अल्प मति के लोग है वो मूर्ति में भगवान् देखते है. लेकिन जो व्यापक दृष्टी रखने वाले लोग है, वो यह जानते है की भगवान सर्व व्यापी है." };


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