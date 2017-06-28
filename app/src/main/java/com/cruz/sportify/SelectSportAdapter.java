package com.cruz.sportify;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Acer on 28/06/2017.
 */

public class SelectSportAdapter extends RecyclerView.Adapter<SelectSportAdapter.ViewHolder> {




    @Override
    public SelectSportAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sport_card_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SelectSportAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView sportImg;

        public ViewHolder(View itemView){
            super(itemView);
        }
    }
}
