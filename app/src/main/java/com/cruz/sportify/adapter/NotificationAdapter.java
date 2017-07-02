package com.cruz.sportify.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cruz.sportify.R;
import com.cruz.sportify.model.NotificationModel;

import java.util.ArrayList;

/**
 * Created by Basilan on 7/1/2017.
 */

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.MyViewHolder> {

    Context context;
    ArrayList<NotificationModel> notificationModels;
    LayoutInflater inflater;

    public NotificationAdapter(Context context, ArrayList<NotificationModel> notificationModels) {
        this.context = context;
        this.notificationModels = notificationModels;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.notification_card,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvText.setText(notificationModels.get(position).getText());
        holder.tvHours.setText(notificationModels.get(position).getHours());
        holder.imgPic.setImageResource(notificationModels.get(position).getImgSrc());
    }

    @Override
    public int getItemCount() {
        return notificationModels.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPic;
        TextView tvText;
        TextView tvHours;


        public MyViewHolder(View itemView) {
            super(itemView);
            imgPic = (ImageView) itemView.findViewById(R.id.imgPic);
            tvText = (TextView) itemView.findViewById(R.id.tvText);
            tvHours = (TextView) itemView.findViewById(R.id.tvHours);
        }
    }
}
