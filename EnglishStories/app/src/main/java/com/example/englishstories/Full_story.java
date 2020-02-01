package com.example.englishstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Full_story extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_story);



        TextView kkv =(TextView)findViewById(R.id.textView4);
        String kkt= getIntent().getStringExtra("title");
        kkv.setText(kkt+" :-");



        final TextView kv =(TextView)findViewById(R.id.textView2);
        String kt= getIntent().getStringExtra("story");
        kv.setText(kt);

        ImageView btnshare=(ImageView) findViewById(R.id.btnshare);
        btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = kv.getText().toString();
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
                view.getContext().startActivity(Intent.createChooser(sharingIntent, "Share Story via"));
            }
        });

    }
}
