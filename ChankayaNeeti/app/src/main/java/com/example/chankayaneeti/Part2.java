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

public class Part2 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/20","2/20","3/20", "4/17","5/20","6/20","7/20","8/20","9/20","10/20","11/20","12/20","13/20","14/20","15/20","16/20","17/20","18/20","19/20","20/20"};
    String head="अध्याय :- 2";
    String story[]={"1. झूठ बोलना, कठोरता, छल करना, बेवकूफी करना, लालच, अपवित्रता  और निर्दयता ये औरतो के कुछ नैसर्गिक दुर्गुण है।  ", "2.भोजन के योग्य पदार्थ और भोजन करने की क्षमता, सुन्दर स्त्री और उसे भोगने के लिए काम शक्ति, पर्याप्त धनराशी तथा दान देने की भावना - ऐसे संयोगों का होना सामान्य तप का फल नहीं है।", "३. उस व्यक्ति ने धरती पर ही स्वर्ग को पा लिया : १. जिसका पुत्र आज्ञांकारी है, २. जिसकी पत्नी उसकी इच्छा के अनुरूप व्यव्हार करती है, ३. जिसे अपने धन पर संतोष  है।", "४. पुत्र वही है जो पिता का कहना मानता हो, पिता वही है जो पुत्रों का पालन-पोषण करे, मित्र वही है जिस पर आप विश्वास कर सकते हों और पत्नी वही है जिससे सुख प्राप्त हो। ", "५. ऐसे लोगों से बचे जो आपके मुह पर तो मीठी बातें करते हैं, लेकिन आपके पीठ पीछे आपको बर्बाद करने की योजना बनाते है, ऐसा करने वाले तो उस विष के घड़े के समान है जिसकी उपरी सतह दूध से भरी है। ", "६. एक बुरे मित्र पर तो कभी विश्वास ना करे। एक अच्छे मित्र पर भी विश्वास ना करें। क्यूंकि यदि ऐसे लोग आपसे रुष्ट होते है तो आप के सभी राज से पर्दा खोल देंगे। ", "७. मन में सोंचे हुए कार्य को किसी के सामने प्रकट न करें बल्कि मनन पूर्वक उसकी सुरक्षा करते हुए उसे कार्य में परिणत कर दें। ", "८. मुर्खता दुखदायी है, जवानी भी दुखदायी है,लेकिन इन सबसे कहीं ज्यादा दुखदायी किसी दुसरे के घर जाकर उसका अहसान लेना है। ", "९. हर पर्वत पर माणिक्य नहीं होते,  हर हाथी के सर पर मणी नहीं होता, सज्जन पुरुष भी हर जगह नहीं होते और हर वन मे चन्दन के वृक्ष भी नहीं होते हैं। ", "१०. बुद्धिमान पिता को अपने पुत्रों को शुभ गुणों की सीख देनी चाहिए क्योंकि नीतिज्ञ और ज्ञानी व्यक्तियों की ही कुल में पूजा होती है। ", "११. जो माता व् पिता अपने बच्चों को शिक्षा नहीं देते है वो तो बच्चों के शत्रु के सामान हैं। क्योंकि वे विद्याहीन बालक विद्वानों की सभा में वैसे ही तिरस्कृत किये जाते हैं जैसे हंसो की सभा मे बगुले। ", "१२. लाड-प्यार से बच्चों मे गलत आदते ढलती है, उन्हें कड़ी शिक्षा देने से वे अच्छी आदते सीखते है, इसलिए बच्चों को जरुरत पड़ने पर दण्डित करें, ज्यादा लाड ना करें। ", "१३. ऐसा एक भी दिन नहीं जाना चाहिए जब आपने एक श्लोक, आधा श्लोक, चौथाई श्लोक, या श्लोक का केवल एक अक्षर नहीं सीखा, या आपने दान, अभ्यास या कोई पवित्र कार्य नहीं किया। ", "१४. पत्नी का वियोग होना, आपने ही लोगो से बे-इजजत होना, बचा हुआ ऋण, दुष्ट राजा की सेवा करना, गरीबी एवं दरिद्रों की सभा - ये छह बातें शरीर को बिना अग्नि के ही जला देती हैं। ", "१५.  नदी के किनारे वाले वृक्ष, दुसरे व्यक्ति के घर मे जाने अथवा रहने वाली स्त्री एवं बिना मंत्रियों का राजा - ये सब निश्चय ही शीघ्र नस्ट हो जाते हैं। ", "१६. एक ब्राह्मण का बल तेज और विद्या है, एक राजा का बल उसकी सेना मे है, एक वैशय का बल उसकी दौलत मे है तथा एक शुद्र का बल उसकी सेवा परायणता मे है। ", "१७. वेश्या को निर्धन व्यक्ति को  त्याग देना चाहिए, प्रजा को पराजित राजा को त्याग देना चाहिए, पक्षियों को फलरहित वृक्ष त्याग देना चाहिए एवं अतिथियों को भोजन करने के पश्चात् मेजबान के घर से निकल देना चाहिए। ", "१८. ब्राह्मण दक्षिणा मिलने के पश्चात् आपने यजमानो को छोड़ देते है, विद्वान विद्या प्राप्ति के बाद गुरु को छोड़ जाते हैं और पशु जले हुए वन को त्याग देते हैं। ", "१९. जो व्यक्ति दुराचारी, कुदृष्टि वाले, एवं बुरे स्थान पर रहने वाले मनुष्य के साथ मित्रता करता है, वह शीघ्र नष्ट हो जाता है। ", "२०. प्रेम और मित्रता बराबर वालों में अच्छी लगती है, राजा के यहाँ नौकरी करने वाले को ही सम्मान मिलता है, व्यवसायों में वाणिज्य सबसे अच्छा है, अवं उत्तम गुणों वाली स्त्री अपने घर में सुरक्षित रहती है।"};


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
        if(current < 19) {
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