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

public class Part9 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/13","2/13","3/13", "4/13","5/13","6/13","7/13","8/13","9/13","10/13","11/13","12/13","13/13"};
    String head="अध्याय :- 9";
    String story[]={"तात, यदि तुम जन्म मरण के चक्र से मुक्त होना चाहते हो तो जिन विषयो के पीछे तुम इन्द्रियों की संतुष्टि के लिए भागते फिरते हो उन्हें ऐसे त्याग दो जैसे तुम विष को त्याग देते हो. इन सब को छोड़कर हे तात तितिक्षा, ईमानदारी का आचरण, दया, शुचिता और सत्य इसका अमृत पियो.", "वो कमीने लोग जो दूसरो की गुप्त खामियों को उजागर करते हुए फिरते है, उसी तरह नष्ट हो जाते है जिस तरह कोई साप चीटियों के टीलों में जा कर मर जाता है.", "शायद किसीने ब्रह्माजी, जो इस सृष्टि के निर्माता है, को यह सलाह नहीं दी की वह ... सुवर्ण को सुगंध प्रदान करे. गन्ने के झाड को फल प्रदान करे. चन्दन के वृक्ष को फूल प्रदान करे. विद्वान् को धन प्रदान करे. राजा को लम्बी आयु प्रदान करे.", "अमृत सबसे बढ़िया औषधि है. इन्द्रिय सुख में अच्छा भोजन सर्वश्रेष्ठ सुख है. नेत्र सभी इन्द्रियों में श्रेष्ठ है. मस्तक शरीर के सभी भागो मे श्रेष्ठ है.", "कोई संदेशवाहक आकाश में जा नहीं सकता और आकाश से कोई खबर आ नहीं सकती. वहा रहने वाले लोगो की आवाज सुनाई नहीं देती. और उनके साथ कोई संपर्क नहीं हो सकता. इसीलिए वह ब्राह्मण जो सूर्य और चन्द्र ग्रहण की भविष्य वाणी करता है, उसे विद्वान मानना चाहिए.", "इन सातो को जगा दे यदि ये सो जाए... १. विद्यार्थी २. सेवक ३. पथिक ४. भूखा आदमी ५. डरा हुआ आदमी ६. खजाने का रक्षक ७. खजांची", "इन सातो को नींद से नहीं जगाना चाहिए... १. साप २. राजा ३. बाघ ४. डंख करने वाला कीड़ा ५. छोटा बच्चा ६. दुसरो का कुत्ता ७. मुर्ख", "जिन्होंने वेदों का अध्ययन पैसा कमाने के लिए किया और जो नीच काम करने वाले लोगो का दिया हुआ अन्न खाते है उनके पास कौनसी शक्ति हो सकती है. वो ऐसे भुजंगो के समान है जो दंश नहीं कर सकते.", "जिसके डाटने से सामने वाले के मन में डर नहीं पैदा होता और प्रसन्न होने के बाद जो सामने वाले को कुछ देता नहीं है. वो ना किसी की रक्षा कर सकता है ना किसी को नियंत्रित कर सकता है. ऐसा आदमी भला क्या कर सकता है.", "यदि नाग अपना फना खड़ा करे तो भले ही वह जहरीला ना हो तो भी उसका यह करना सामने वाले के मन में डर पैदा करने को पर्याप्त है. यहाँ यह बात कोई माइना नहीं रखती की वह जहरीला है की नहीं.", "सुबह उठकर दिन भर जो दाव आप लगाने वाले है उसके बारे में सोचे. दोपहर को अपनी माँ को याद करे. रात को चोरो को ना भूले.", "आपको इन्द्र के समान वैभव प्राप्त होगा यदि आप.. अपने भगवान् के गले की माला अपने हाथो से बनाये. अपने भगवान् के लिए चन्दन अपने हाथो से घिसे. अपने हाथो से पवित्र ग्रंथो को लिखे.", "गरीबी पर धैर्य से मात करे. पुराने वस्त्रो को स्वच्छ रखे. बासी अन्न को गरम करे. अपनी कुरूपता पर अपने अच्छे व्यवहार से मात करे." };


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
        if(current < 12) {
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
