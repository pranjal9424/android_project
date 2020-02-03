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

public class Part10 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/17","2/17","3/17", "4/17","5/17","6/17","7/17","8/17","9/17","10/17","11/17","12/17","13/17","14/17","15/17","16/17","17/17"};
    String head="अध्याय :- 10";
    String story[]={"जिसके पास धन नहीं है वो गरीब नहीं है, वह तो असल में रहीस है, यदि उसके पास विद्या है. लेकिन जिसके पास विद्या नहीं है वह तो सब प्रकार से निर्धन है.", "हम अपना हर कदम फूक फूक कर रखे. हम छाना हुआ जल पिए. हम वही बात बोले जो शास्त्र सम्मत है. हम वही काम करे जिसके बारे हम सावधानीपुर्वक सोच चुके है.", "जिसे अपने इन्द्रियों की तुष्टि चाहिए, वह विद्या अर्जन करने के सभी विचार भूल जाए. और जिसे ज्ञान चाहिए वह अपने इन्द्रियों की तुष्टि भूल जाये. जो इन्द्रिय विषयों में लगा है उसे ज्ञान कैसा, और जिसे ज्ञान है वह व्यर्थ की इन्द्रिय तुष्टि में लगा रहे यह संभव नहीं.", "वह क्या है जो कवी कल्पना में नहीं आ सकता. वह कौनसी बात है जिसे करने में औरत सक्षम नहीं है. ऐसी कौनसी बकवास है जो दारू पिया हुआ आदमी नहीं करता. ऐसा क्या है जो कौवा नहीं खाता.", "नियति एक भिखारी को राजा और राजा को भिखारी बनाती है. वह एक अमीर आदमी को गरीब और गरीब को अमीर.", "भिखारी यह कंजूस आदमी का दुश्मन है. एक अच्छा सलाहकार एक मुर्ख आदमी का शत्रु है. वह पत्नी जो पर पुरुष में रूचि रखती है, उसके लिए उसका पति ही उसका शत्रु है. जो चोर रात को काम करने निकलता है, चन्द्रमा ही उसका शत्रु है.", "जिनके पास यह कुछ नहीं है... विद्या. तप. ज्ञान. अच्छा स्वभाव. गुण. दया भाव. ...वो धरती पर मनुष्य के रूप में घुमने वाले पशु है. धरती पर उनका भार है.", "जिनके भेजे खाली है, वो कोई उपदेश नहीं समझते. यदि बास को मलय पर्वत पर उगाया जाये तो भी उसमे चन्दन के गुण नहीं आते.", "जिसे अपनी कोई अकल नहीं उसकी शास्त्र क्या भलाई करेंगे. एक अँधा आदमी आयने का क्या करेगा.", "एक बुरा आदमी सुधर नहीं सकता. आप पृष्ठ भाग को चाहे जितना साफ़ करे वो श्रेष्ठ भागो की बराबरी नहीं कर सकता.", "अपने निकट संबंधियों का अपमान करने से जान जाती है. दुसरो का अपमान करने से दौलत जाती है. राजा का अपमान करने से सब कुछ जाता है. एक ब्राह्मण का अपमान करने से कुल का नाश हो जाता है.", "यह बेहतर है की आप जंगल में एक झाड के नीचे रहे, जहा बाघ और हाथी रहते है, उस जगह रहकर आप फल खाए और जलपान करे, आप घास पर सोये और पुराने पेड़ो की खाले पहने. लेकिन आप अपने सगे संबंधियों में ना रहे यदि आप निर्धन हो गए है.", "ब्राह्मण एक वृक्ष के समान है. उसकी प्रार्थना ही उसका मूल है. वह जो वेदों का गान करता है वही उसकी शाखाए है. वह जो पुण्य कर्म करता है वही उसके पत्ते है. इसीलिए उसने अपने मूल को बचाना चाहिए. यदि मूल नष्ट हो जाता है तो शाखाये भी ना रहेगी और पत्ते भी.", "लक्ष्मी मेरी माता है. विष्णु मेरे पिता है. वैष्णव जन मेरे सगे सम्बन्धी है. तीनो लोक मेरा देश है.", "रात्रि के समय कितने ही प्रकार के पंछी वृक्ष पर विश्राम करते है. भोर होते ही सब पंछी दसो दिशाओ में उड़ जाते है. हम क्यों भला दुःख करे यदि हमारे अपने हमें छोड़कर चले गए.", "जिसके पास में विद्या है वह शक्तिशाली है. निर्बुद्ध पुरुष के पास क्या शक्ति हो सकती है? एक छोटा खरगोश भी चतुराई से मदमस्त हाथी को तालाब में गिरा देता है.", "हे विश्वम्भर तू सबका पालन करता है. मै मेरे गुजारे की क्यों चिंता करू जब मेरा मन तेरी महिमा गाने में लगा हुआ है. आपके अनुग्रह के बिना एक माता की छाती से दूध नहीं बह सकता और शिशु का पालन नहीं हो सकता. मै हरदम यही सोचता हुआ, हे यदु वंशियो के प्रभु, हे लक्ष्मी पति, मेरा पूरा समय आपकी ही चरण सेवा में खर्च करता हू." };


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
        if(current < 16) {
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
