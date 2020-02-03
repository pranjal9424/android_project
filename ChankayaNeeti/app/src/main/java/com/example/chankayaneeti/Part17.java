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

public class Part17 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/18","2/18","3/18", "4/18","5/18","6/18","7/18","8/18","9/18","10/18","11/18","12/18","13/18","14/18","15/18","16/18","17/18","18/18"};
    String head="अध्याय :- 17";
    String story[]={"वह विद्वान जिसने असंख्य किताबो का अध्ययन बिना सदगुरु के आशीर्वाद से कर लिया वह विद्वानों की सभा में एक सच्चे विद्वान के रूप में नहीं चमकता है. उसी प्रकार जिस प्रकार एक नाजायज औलाद को दुनिया में कोई प्रतिष्ठा हासिल नहीं होती.", "हमें दुसरो से जो मदद प्राप्त हुई है उसे हमें लौटना चाहिए. उसी प्रकार यदि किसीने हमसे यदि दुष्टता की है तो हमें भी उससे दुष्टता करनी चाहिए. ऐसा करने में कोई पाप नहीं है.", "वह चीज जो दूर दिखाई देती है, जो असंभव दिखाई देती है, जो हमारी पहुच से बहार दिखाई देती है, वह भी आसानी से हासिल हो सकती है यदि हम तप करते है. क्यों की तप से ऊपर कुछ नहीं.", "लोभ से बड़ा दुर्गुण क्या हो सकता है. पर निंदा से बड़ा पाप क्या है. जो सत्य में प्रस्थापित है उसे तप करने की क्या जरूरत है. जिसका ह्रदय शुद्ध है उसे तीर्थ यात्रा की क्या जरूरत है. यदि स्वभाव अच्छा है तो और किस गुण की जरूरत है. यदि कीर्ति है तो अलंकार की क्या जरुरत है. यदि व्यवहार ज्ञान है तो दौलत की क्या जरुरत है. और यदि अपमान हुआ है तो मृत्यु से भयंकर नहीं है क्या.", "समुद्र ही सभी रत्नों का भण्डार है. वह शंख का पिता है. देवी लक्ष्मी शंख की बहन है. लेकिन दर दर पर भीख मांगने वाले हाथ में शंख ले कर घूमते है. इससे यह बात सिद्ध होती है की उसी को मिलेगा जिसने पहले दिया है.", "जब आदमी में शक्ति नहीं रह जाती वह साधू हो जाता है. जिसके पास दौलत नहीं होती वह ब्रह्मचारी बन जाता है. रुग्ण भगवान् का भक्त हो जाता है. जब औरत बूढी होती है तो पति के प्रति समर्पित हो जाती है.", "साप के दंश में विष होता है. कीड़े के मुह में विष होता है. बिच्छू के डंख में विष होता है. लेकिन दुष्ट व्यक्ति तो पूर्ण रूप से विष से भरा होता है.", "जो स्त्री अपने पति की सम्मति के बिना व्रत रखती है और उपवास करती है, वह उसकी आयु घटाती है और खुद नरक में जाती है.", "स्त्री दान दे कर, उपवास रख कर और पवित्र जल का पान करके पावन नहीं हो सकती. वह पति के चरणों को धोने से और ऐसे जल का पान करने से शुद्ध होती है.", "एक हाथ की शोभा गहनों से नहीं दान देने से है. चन्दन का लेप लगाने से नहीं जल से नहाने से निर्मलता आती है. एक व्यक्ति भोजन खिलाने से नहीं सम्मान देने से संतुष्ट होता है. मुक्ति खुद को सजाने से नहीं होती, अध्यात्मिक ज्ञान को जगाने से होती है.", "टुंडी फल खाने से आदमी की समझ खो जाती है. वच मूल खिलाने से लौट आती है. औरत के कारण आदमी की शक्ति खो जाती है, दूध से वापस आती है.", "जिसमे सभी जीवो के प्रति परोपकार की भावना है वह सभी संकटों पर मात करता है और उसे हर कदम पर सभी प्रकार की सम्पन्नता प्राप्त होती है.", "वह इंद्र के राज्य में जाकर क्या सुख भोगेगा.... जिसकी पत्नी प्रेमभाव रखने वाली और सदाचारी है. जिसके पास में संपत्ति है. जिसका पुत्र सदाचारी और अच्छे गुण वाला है. जिसको अपने पुत्र द्वारा पौत्र हुए है.", "मनुष्यों में और निम्न स्तर के प्राणियों में खाना, सोना, घबराना और गमन करना समान है. मनुष्य अन्य प्राणियों से श्रेष्ठ है तो विवेक ज्ञान की बदौलत. इसलिए जिन मनुष्यों में ज्ञान नहीं है वे पशु है.", "यदि मद मस्त हाथी अपने माथे से टपकने वाले रस को पीने वाले भौरों को कान हिलाकर उड़ा देता है, तो भौरों का कुछ नहीं जाता, वे कमल से भरे हुए तालाब की ओर ख़ुशी से चले जाते है. हाथी के माथे का शृंगार कम हो जाता है.", "ये आठो कभी दुसरो का दुःख नहीं समझ सकते ... १. राजा २. वेश्या ३. यमराज ४. अग्नि ५. चोर ६. छोटा बच्चा ७. भिखारी और ८. कर वसूल करने वाला.", "हे महिला, तुम निचे झुककर क्या देख रही हो? क्या तुम्हारा कुछ जमीन पर गिर गया है? हे मुर्ख, मेरे तारुण्य का मोती न जाने कहा फिसल गया.", "हे केतकी पुष्प! तुममे तो कीड़े रहते है. तुमसे ऐसा कोई फल भी नहीं बनता जो खाया जाय. तुम्हारे पत्ते काटो से ढके है. तुम टेढ़े होकर बढ़ते हो. कीचड़ में खिलते हो. कोई तुम्हे आसानी से पा नहीं सकता. लेकिन तुम्हारी अतुलनीय खुशबु के कारण दुसरे पुष्पों की तरह सभी को प्रिय हो. इसीलिए एक ही अच्छाई अनेक बुराइयों पर भारी पड़ती है." };


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
        if(current < 17) {
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
