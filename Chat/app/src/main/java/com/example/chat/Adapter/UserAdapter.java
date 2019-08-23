package com.example.chat.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.chat.R;
import com.example.chat.model.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private Context mcontext;
    private List<User> mUser;

    public UserAdapter(Context mcontext, List<User> mUser) {
        this.mcontext = mcontext;
        this.mUser = mUser;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mcontext).inflate(R.layout.user_item,parent,false);

        return new UserAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
                  User user=mUser.get(position);
                  holder.username.setText(user.getUsername());
                  if(user.getImageURL().equals("default")){
                      holder.profile_Image.setImageResource(R.mipmap.ic_launcher);
                  }else {
                      Glide.with(mcontext).load(user.getImageURL()).into(holder.profile_Image);
                  }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView username;
        public ImageView profile_Image;

        public ViewHolder(View itemView){
            super(itemView);
            username=itemView.findViewById(R.id.username);
            profile_Image=itemView.findViewById(R.id.profile_image);
        }
    }
}
