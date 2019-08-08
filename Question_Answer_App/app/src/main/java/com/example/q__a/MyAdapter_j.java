package com.example.q__a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter_j extends RecyclerView.Adapter<MyAdapter_j.ViewHolder> {


    private List<Listitem_j> listItems;
    private Context context;

    public MyAdapter_j(List<Listitem_j> listItems, Context context) {
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
        Listitem_j listItem = listItems.get(position);
        holder.textview_question.setText(listItem.getQuestion());
        holder.textview_answer.setText(listItem.getAnswer());
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


        public ViewHolder(View itemView) {
            super(itemView);

            textview_question = (TextView)itemView.findViewById(R.id.textquest);
            textview_answer = (TextView)itemView.findViewById(R.id.texxtanswer);
        }
    }
}
