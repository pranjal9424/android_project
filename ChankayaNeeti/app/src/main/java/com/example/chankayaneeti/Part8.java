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

public class Part8 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/20","2/20","3/20", "4/17","5/20","6/20","7/20","8/20","9/20","10/20","11/20","12/20","13/20","14/20","15/20","16/20","17/20","18/20","19/20","20/20"};
    String head="अध्याय :- 8";
    String story[]={"नीच वर्ग के लोग दौलत चाहते है, मध्यम वर्ग के दौलत और इज्जत, लेकिन उच्च वर्ग के लोग सम्मान चाहते है क्यों की सम्मान ही उच्च लोगो की असली दौलत है.", "दीपक अँधेरे का भक्षण करता है इसीलिए काला धुआ बनाता है. इसी प्रकार हम जिस प्रकार का अन्न खाते है. माने सात्विक, राजसिक, तामसिक उसी प्रकार के विचार उत्पन्न करते है.", "हे विद्वान् पुरुष ! अपनी संपत्ति केवल पात्र को ही दे और दूसरो को कभी ना दे. जो जल बादल को समुद्र देता है वह बड़ा मीठा होता है. बादल वर्षा करके वह जल पृथ्वी के सभी चल अचल जीवो को देता है और फिर उसे समुद्र को लौटा देता है.", "विद्वान् लोग जो तत्त्व को जानने वाले है उन्होंने कहा है की मास खाने वाले चांडालो से हजार गुना नीच है. इसलिए ऐसे आदमी से नीच कोई नहीं.", "शरीर पर मालिश करने के बाद, स्मशान में चिता का धुआ शरीर पर आने के बाद, सम्भोग करने के बाद, दाढ़ी बनाने के बाद जब तक आदमी नहा ना ले वह चांडाल रहता है.", "जल अपच की दवा है. जल चैतन्य निर्माण करता है, यदि उसे भोजन पच जाने के बाद पीते है. पानी को भोजन के बाद तुरंत पीना विष पिने के समान है.", "यदि ज्ञान को उपयोग में ना लाया जाए तो वह खो जाता है. आदमी यदि अज्ञानी है तो खो जाता है. सेनापति के बिना सेना खो जाती है. पति के बिना पत्नी खो जाती है.", "वह आदमी अभागा है जो अपने बुढ़ापे में पत्नी की मृत्यु देखता है. वह भी अभागा है जो अपनी सम्पदा संबंधियों को सौप देता है. वह भी अभागा है जो खाने के लिए दुसरो पर निर्भर है.", "यह बाते बेकार है. वेद मंत्रो का उच्चारण करना लेकिन निहित यज्ञ कर्मो को ना करना. यज्ञ करना लेकिन बाद में लोगो को दान दे कर तृप्त ना करना. पूर्णता तो भक्ति से ही आती है. भक्ति ही सभी सफलताओ का मूल है.", "एक संयमित मन के समान कोई तप नहीं. संतोष के समान कोई सुख नहीं. लोभ के समान कोई रोग नहीं. दया के समान कोई गुण नहीं.", "क्रोध साक्षात् यम है. तृष्णा नरक की और ले जाने वाली वैतरणी है. ज्ञान कामधेनु है. संतोष ही तो नंदनवन है.", "नीति की उत्तमता ही व्यक्ति के सौंदर्य का गहना है. उत्तम आचरण से व्यक्ति उत्तरोत्तर ऊँचे लोक में जाता है. सफलता ही विद्या का आभूषण है. उचित विनियोग ही संपत्ति का गहना है.", "निति भ्रष्ट होने से सुन्दरता का नाश होता है. हीन आचरण से अच्छे कुल का नाश होता है. पूर्णता न आने से विद्या का नाश होता है. उचित विनियोग के बिना धन का नाश होता है.", "जो जल धरती में समां गया वो शुद्ध है. परिवार को समर्पित पत्नी शुद्ध है. लोगो का कल्याण करने वाला राजा शुद्ध है. वह ब्राह्मण शुद्ध है जो संतुष्ट है.", "असंतुष्ट ब्राह्मण, संतुष्ट राजा, लज्जा रखने वाली वेश्या, कठोर आचरण करने वाली गृहिणी ये सभी लोग विनाश को प्राप्त होते है.", "क्या करना उचे कुल का यदि बुद्धिमत्ता ना हो. एक नीच कुल में उत्पन्न होने वाले विद्वान् व्यक्ति का सम्मान देवता भी करते है.", "विद्वान् व्यक्ति लोगो से सम्मान पाता है. विद्वान् उसकी विद्वत्ता के लिए हर जगह सम्मान पाता है. यह बिलकुल सच है की विद्या हर जगह सम्मानित है.", "जो लोग दिखने में सुन्दर है, जवान है, ऊँचे कुल में पैदा हुए है, वो बेकार है यदि उनके पास विद्या नहीं है. वो तो पलाश के फूल के समान है जो दिखते तो अच्छे है पर महकते नहीं.", "यह धरती उन लोगो के भार से दबी जा रही है, जो मास खाते है, दारू पीते है, बेवकूफ है, वे सब तो आदमी होते हुए पशु ही है.", "उस यज्ञ के समान कोई शत्रु नहीं जिसके उपरांत लोगो को बड़े पैमाने पर भोजन ना कराया जाए. ऐसा यज्ञ राज्यों को ख़तम कर देता है. यदि पुरोहित यज्ञ में ठीक से उच्चारण ना करे तो यज्ञ उसे ख़तम कर देता है. और यदि यजमान लोगो को दान एवं भेटवस्तू ना दे तो वह भी यज्ञ द्वारा ख़तम हो जाता है." };


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
