package com.example.chanakya;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MsgActivity extends AppCompatActivity {

    ImageView button_next;
    ImageView button_prev;
    FloatingActionButton button_send;

    TextView editText;
    TextView txt_msgNumber;


    int listLength=0;

    String str_Stories[] = new String[8];
    String str_Topic;
    Typeface heading, headingTypeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.msg_activity);

        //toolbar
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        str_Stories = intent.getStringArrayExtra("keyArray");


        editText = (TextView) findViewById(R.id.editText1);
        button_prev = (ImageView) findViewById(R.id.bPrevious);
        button_next = (ImageView) findViewById(R.id.bNext);
        button_send = (FloatingActionButton) findViewById(R.id.bMenu);

        txt_msgNumber = (TextView) findViewById(R.id.txt_msgnumber);

        editText.setText(str_Stories[listLength]);

        txt_msgNumber.setTypeface(heading);

        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub0
                editText.setText("");
                try {
                    listLength++;
                    if (listLength > str_Stories.length - 1) {
                        display(listLength--);
                    }
                    display(listLength);
                } catch (Exception e) {

                }
            }
        });

        button_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                try {
                    listLength--;
                    if (listLength < 0) {
                        display(listLength++);
                    }
                    display(listLength);
                } catch (Exception e) {

                }
            }
        });
        button_send.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                try {
                    Intent waIntent = new Intent(Intent.ACTION_SEND);
                    waIntent.setType("text/plain");
                    String smsSend = editText.getText().toString();
                    waIntent.putExtra(Intent.EXTRA_TEXT, smsSend);
                    startActivity(Intent.createChooser(waIntent, smsSend));
                } catch (Exception ex) {
                }

            }
        });
    }

    public void display(int value) {
        String smsNumber = String.valueOf(value + 1);
        txt_msgNumber.setText(smsNumber+"/"+"101" );

        try {
            if (value <= str_Stories.length) {
                editText.setText(str_Stories[value]);

            } else {

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public void onBackPressed() {
        this.finish();
        super.onBackPressed();
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
                clipboard.setText(editText.getText());
                Toast.makeText(getApplicationContext(), "Message copied",
                        Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
