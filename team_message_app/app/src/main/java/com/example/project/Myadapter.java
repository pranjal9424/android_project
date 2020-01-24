package com.example.project;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

import static android.content.Context.CLIPBOARD_SERVICE;

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {


    private List<Listitem> listItems;
    private Context context;

    public Myadapter(List<Listitem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem1,parent,false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Listitem listItem = listItems.get(position);
        holder.textview_question.setText(listItem.getQuestion());
        holder.textview_answer.setText(listItem.getAnswer());
        holder.textview_texttime.setText(listItem.getTexttime());
        holder.textview_likes.setText(listItem.getTextlikes());



       /* Typeface typeface = Typeface.createFromAsset(holder.itemView.getContext().getAssets(), "comic.ttf");
        holder.textview_question.setTypeface(typeface);*/


    }

    @Override
    public int getItemCount() {

        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textview_question;
        public TextView textview_answer;
        public TextView textview_texttime;
        public TextView textview_likes;
        public LinearLayout btnshare,btncopy;
        ImageView unfill, fill;
        String check = "unfill";


        public ViewHolder(final View itemView) {
            super(itemView);

            textview_question = (TextView)itemView.findViewById(R.id.textquest);
            textview_answer = (TextView)itemView.findViewById(R.id.texxtanswer);
            textview_texttime = (TextView)itemView.findViewById(R.id.texttime);
            textview_likes=(TextView)itemView.findViewById(R.id.likes);


            //btn copy
            btncopy=(LinearLayout)itemView.findViewById(R.id.btncopy);
            btncopy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    ClipboardManager clipboard = (ClipboardManager) view.getContext().getSystemService(CLIPBOARD_SERVICE);
                    clipboard.setText(textview_answer.getText());
                    Toast.makeText(view.getContext().getApplicationContext(), "Message copied",
                            Toast.LENGTH_LONG).show();
                }
            });

            //btn share
            btnshare=(LinearLayout)itemView.findViewById(R.id.btnshare);
            btnshare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s = textview_answer.getText().toString();
                    String q = textview_question.getText().toString();
                    Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                    sharingIntent.setType("text/plain");
                    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s);
                    view.getContext().startActivity(Intent.createChooser(sharingIntent, "Share message via"));
                }
            });





            unfill = (ImageView) itemView.findViewById(R.id.unfilled);
            fill = (ImageView) itemView.findViewById(R.id.filled);
            fill.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    filled(fill);
                }
            });

            unfill.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    unfilled(unfill);
                }
            });
        }

        public void unfilled(View view) {
            if (check.equals("unfill")) {
                animateHeart(fill);
                fill.setVisibility(View.VISIBLE);
                unfill.setVisibility(View.GONE);

            }
            Snackbar.make(view, "Like it", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            check = "fill";
        }

        private void animateHeart(ImageView fill) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            prepareAnimation(scaleAnimation);


            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            prepareAnimation(alphaAnimation);

            AnimationSet animation = new AnimationSet(true);
            animation.addAnimation(alphaAnimation);
            animation.addAnimation(scaleAnimation);
            animation.setDuration(500);

            fill.startAnimation(animation);
        }

        public void filled(View view) {
            if (check.equals("fill")) {
                dilikeheart(unfill);
                fill.setVisibility(View.GONE);
                unfill.setVisibility(View.VISIBLE);
            }
            Snackbar.make(view, "Dislike it", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            check = "unfill";
        }

        private void dilikeheart(ImageView unfill) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                    Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            prepareAnimation(scaleAnimation);


            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            prepareAnimation(alphaAnimation);

            AnimationSet animation = new AnimationSet(true);
            animation.addAnimation(alphaAnimation);
            animation.addAnimation(scaleAnimation);
            animation.setDuration(700);
            unfill.startAnimation(animation);
        }

        private  Animation prepareAnimation(Animation animation) {
            animation.setRepeatCount(2);
            animation.setRepeatMode(Animation.REVERSE);
            return  animation;
        }





}


}