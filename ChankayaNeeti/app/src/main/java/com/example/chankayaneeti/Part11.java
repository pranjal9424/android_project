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

public class Part11 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/16","2/16","3/16", "4/16","5/16","6/16","7/16","8/16","9/16","10/16","11/16","12/16","13/16","14/16","15/16","16/16"};
    String head="अध्याय :- 11";
    String story[]={"उदारता, वचनों में मधुरता, साहस, आचरण में विवेक ये बाते कोई पा नहीं सकता ये मूल में होनी चाहिए.", "जो अपने समाज को छोड़कर दुसरे समाज को जा मिलता है, वह उसी राजा की तरह नष्ट हो जाता है जो अधर्म के मार्ग पर चलता है.", "हाथी का शरीर कितना विशाल है लेकिन एक छोटे से अंकुश से नियंत्रित हो जाता है. एक दिया घने अन्धकार का नाश करता है, क्या अँधेरे से दिया बड़ा है. एक कड़कती हुई बिजली एक पहाड़ को तोड़ देती है, क्या बिजली पहाड़ जितनी विशाल है. जी नहीं. बिलकुल नहीं. वही बड़ा है जिसकी शक्ति छा जाती है. इससे कोई फरक नहीं पड़ता की आकार कितना है.", "जो घर गृहस्थी के काम में लगा रहता है वह कभी ज्ञान प्राप्त नहीं कर सकता. मॉस खाने वाले के ह्रदय में दया नहीं हो सकती. लोभी व्यक्ति कभी सत्य भाषण नहीं कर सकता. और एक शिकारी में कभी शुद्धता नहीं हो सकती.", "एक दुष्ट व्यक्ति में कभी पवित्रता उदीत नहीं हो सकती उसे चाहे जैसे समझा लो. नीम का वृक्ष कभी मीठा नहीं हो सकता आप चाहे उसकी शिखा से मूल तक घी और शक्कर छिड़क दे.", "आप चाहे सौ बार पवित्र जल में स्नान करे, आप अपने मन का मैल नहीं धो सकते. उसी प्रकार जिस प्रकार मदिरा का पात्र पवित्र नहीं हो सकता चाहे आप उसे गरम करके सारी मदिरा की भाप बना दे.", "इसमें कोई आश्चर्य नहीं की व्यक्ति उन बातो के प्रति अनुदगार कहता है जिसका उसे कोई ज्ञान नहीं. उसी प्रकार जैसे एक जंगली शिकारी की पत्नी हाथी के सर का मणि फेककर गूंजे की माला धारण करती है.", "जो व्यक्ति एक साल तक भोजन करते समय भगवान् का ध्यान करेगा और मुह से कुछ नहीं बोलेगा उसे एक हजार करोड़ वर्ष तक स्वर्ग लोक की प्राप्ति होगी.", "एक विद्यार्थी पूर्ण रूप से निम्न लिखित बातो का त्याग करे. १. काम २. क्रोध ३. लोभ ४. स्वादिष्ट भोजन की अपेक्षा. ५. शरीर का शृंगार ६. अत्याधिक जिज्ञासा ७. अधिक निद्रा ८. शरीर निर्वाह के लिए अत्याधिक प्रयास.", "वही सही में ब्राह्मण है जो केवल एक बार के भोजन से संतुष्ट रहे, जिस पर १६ संस्कार किये गए हो, जो अपनी पत्नी के साथ महीने में केवल एक दिन समागम करे. माहवारी समाप्त होने के दुसरे दिन.", "वह ब्राह्मण जो दुकानदारी में लगा है, असल में वैश्य ही है.", "निम्न स्तर के लोगो से जिस व्यवसाय में संपर्क आता है, वह व्यवसाय ब्राह्मण को शुद्र बना देता है.", "वह ब्राह्मण जो दुसरो के काम में अड़ंगे डालता है, जो दम्भी है, स्वार्थी है, धोखेबाज है, दुसरो से घृणा करता है और बोलते समय मुह में मिठास और ह्रदय में क्रूरता रखता है, वह एक बिल्ली के समान है.", "एक ब्राह्मण जो तालाब को, कुए को, टाके को, बगीचे को और मंदिर को नष्ट करता है, वह म्लेच्छ है.", "वह ब्राह्मण जो भगवान् के मूर्ति की सम्पदा चुराता है और वह अध्यात्मिक गुरु जो दुसरे की पत्नी के साथ समागम करता है और जो अपना गुजारा करने के लिए कुछ भी और सब कुछ खाता है वह चांडाल है.", "एक गुणवान व्यक्ति को वह सब कुछ दान में देना चाहिए जो उसकी आवश्यकता से अधिक है. केवल दान के कारण ही कर्ण, बाली और राजा विक्रमादित्य आज तक चल रहे है. देखिये उन मधु मख्खियों को जो अपने पैर दुखे से धारती पर पटक रही है. वो अपने आप से कहती है  आखिर में सब चला ही गया. हमने हमारे शहद को जो बचा कर रखा था, ना ही दान दिया और ना ही खुद खाया. अभी एक पल में ही कोई हमसे सब छीन कर चला गया." };


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
        if(current < 15) {
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