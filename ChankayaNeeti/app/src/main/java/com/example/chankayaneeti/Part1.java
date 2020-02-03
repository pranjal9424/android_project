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
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Part1 extends AppCompatActivity {
    TextView rt,sto,hd;
    int current=0;
    String page[] = {"1/17","2/17","3/17", "4/17","5/17","6/17","7/17","8/17","9/17","10/17","11/17","12/17","13/17","14/17","15/17","16/17","17/17"};
    String head="अध्याय :- 1";
    String story[] = {"१.  तीनो लोको के स्वामी सर्वशक्तिमान भगवान विष्णु  को नमन करते हुए मै एक राज्य के लिए  नीति  शास्त्र  के सिद्धांतों  को कहता हूँ.  मै यह सूत्र अनेक शास्त्रों का आधार ले कर कह रहा हूँ।  ", "2. जो व्यक्ति शास्त्रों के सूत्रों का अभ्यास करके ज्ञान ग्रहण करेगा उसे अत्यंत वैभवशाली कर्तव्य के सिद्धांत ज्ञात होगे। उसे इस बात का पता चलेगा कि किन बातों का अनुशरण करना चाहिए और किनका नहीं। उसे अच्छाई और बुराई का भी ज्ञात होगा और अंततः उसे सर्वोत्तम का भी ज्ञान होगा।  ", "३. इसलिए लोगो का भला करने के लिए मै उन बातों को कहूंगा जिनसे लोग सभी चीजों को सही परिपेक्ष्य मे देखेगे।  ", "४. एक पंडित भी घोर कष्ट में आ जाता है यदि वह किसी मुर्ख को उपदेश देता है, यदि वह एक दुष्ट पत्नी का पालन-पोषण करता है या किसी दुखी व्यक्ति के साथ अतयंत घनिष्ठ सम्बन्ध बना लेता है.", "५. दुष्ट पत्नी, झूठा मित्र, बदमाश नौकर और सर्प के साथ निवास साक्षात् मृत्यु के समान है।  ", "६ . व्यक्ति को आने वाली मुसीबतो से निबटने के लिए धन संचय करना चाहिए। उसे धन-सम्पदा त्यागकर भी पत्नी की सुरक्षा करनी चाहिए। लेकिन यदि आत्मा की सुरक्षा की बात आती है तो उसे धन और पत्नी दोनो को तुक्ष्य समझना चाहिए। ", "७ .भविष्य में आने वाली मुसीबतो के लिए धन एकत्रित करें। ऐसा ना सोचें की धनवान व्यक्ति को मुसीबत कैसी? जब धन साथ छोड़ता है तो संगठित धन भी तेजी से घटने लगता है।  ", "८.  उस देश मे निवास न करें जहाँ आपकी कोई ईज्जत नहीं हो, जहा आप रोजगार नहीं कमा सकते, जहा आपका कोई मित्र नहीं और जहा आप कोई ज्ञान आर्जित नहीं कर सकते।  ", "९ . ऐसे जगह एक दिन भी निवास न करें जहाँ निम्नलिखित पांच ना हो: एक धनवान व्यक्ति , एक ब्राह्मण जो वैदिक शास्त्रों में निपुण हो, एक राजा, एक नदी , और एक चिकित्सक।  ", "१० .  बुद्धिमान व्यक्ति को ऐसे देश में कभी नहीं जाना चाहिए जहाँ : रोजगार कमाने का कोई माध्यम ना हो, जहा लोगों को किसी बात का भय न हो, जहा लोगो को किसी बात की लज्जा न हो, जहा लोग बुद्धिमान न हो, और जहाँ लोगो की वृत्ति दान धरम करने की ना हो।  ", "११ . नौकर की परीक्षा तब करें जब वह कर्त्तव्य का पालन  न कर रहा हो, रिश्तेदार की परीक्षा तब करें जब आप मुसीबत मे घिरें हों, मित्र की परीक्षा विपरीत परिस्थितियों मे करें, और जब आपका वक्त अच्छा न चल रहा हो तब पत्नी की परीक्षा करे।  ", "१२ . अच्छा मित्र वही है जो हमे निम्नलिखित परिस्थितियों में  नहीं त्यागे: आवश्यकता पड़ने पर, किसी दुर्घटना पड़ने पर, जब अकाल पड़ा हो, जब युद्ध चल रहा हो, जब हमे राजा के दरबार मे जाना पड़े, और जब हमे समशान घाट जाना पड़े।  ", "१३ . जो व्यक्ति कसी नाशवंत चीज के लिए कभी नाश नहीं होने वाली चीज को छोड़ देता है, तो उसके हाथ से अविनाशी वस्तु तो चली ही जाती है और इसमे कोई संदेह नहीं की नाशवान को भी वह खो देता है।  ", "१४ . एक बुद्धिमान व्यक्ति को किसी इज्जतदार घर की अविवाहित कन्या से किस वयंग होने के बावजूद भी विवाह करना चाहिए। उसे किसी हीन घर की अत्यंत सुन्दर स्त्री से भी विवाह नहीं करनी चाहिए। शादी-विवाह हमेशा बराबरी के घरो मे ही उिचत होता है।  ", "१५ . इन ५ पर कभी विश्वास ना करें : १. नदियां, २. जिन व्यक्तियों के पास अश्त्र-शस्त्र हों, ३. नाख़ून और सींग वाले पशु, ४. औरतें (यहाँ संकेत भोली सूरत की तरफ है, बहने बुरा न माने ) ५. राज घरानो के लोगो पर।  ", "१६ . अगर हो सके तो विष मे से भी अमृत निकाल लें, यदि सोना गन्दगी में भी पड़ा हो तो उसे उठाये, धोएं और अपनाये, निचले कुल मे जन्म लेने वाले से भी सर्वोत्तम ज्ञान ग्रहण करें, उसी तरह यदि कोई बदनाम घर की कन्या भी महान गुणो से संपनन है और आपको कोई सीख देती है तो गहण करे.", "१७ .  महिलाओं में पुरुषों कि अपेक्षा: भूख दो गुना, लज्जा चार गुना, साहस छः गुना, और काम आठ गुना होती है।" };
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

