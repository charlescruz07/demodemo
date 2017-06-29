package com.cruz.sportify.LoginRegistration;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.cruz.sportify.R;

/**
 * Created by Acer on 28/06/2017.
 */

public class SelectSportAdapter extends RecyclerView.Adapter<SelectSportAdapter.ViewHolder> {


    private int[] sport_images = {
            R.drawable.cat_inactive_basketball,
            R.drawable.cat_inactive_badminton,
            R.drawable.cat_inactive_volleyball,
            R.drawable.cat_inactive_soccer,
            R.drawable.cat_inactive_table_tennis,
            R.drawable.cat_inactive_bowling,
            R.drawable.cat_inactive_lawn_tennis,
            R.drawable.cat_inactive_golf
    };

    @Override
    public SelectSportAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.sport_card_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SelectSportAdapter.ViewHolder holder, int position) {
        holder.sportImg.setImageResource(sport_images[position]);
    }

    @Override
    public int getItemCount() {
        return sport_images.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView sportImg;
        boolean isActive;

        public ViewHolder(View itemView){
            super(itemView);
            sportImg = itemView.findViewById(R.id.sportImg);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!isActive) {
                        isActive = true;
                        switch (getAdapterPosition()) {
                            case 0:
                                sportImg.setImageResource(R.drawable.cat_selected_basketball);
                                break;
                            case 1:
                                sportImg.setImageResource(R.drawable.cat_selected_badminton);
                                break;
                            case 2:
                                sportImg.setImageResource(R.drawable.cat_selected_volleyball);
                                break;
                            case 3:
                                sportImg.setImageResource(R.drawable.cat_selected_soccer);
                                break;
                            case 4:
                                sportImg.setImageResource(R.drawable.cat_selected_table_tennis);
                                break;
                            case 5:
                                sportImg.setImageResource(R.drawable.cat_selected_bowling);
                                break;
                            case 6:
                                sportImg.setImageResource(R.drawable.cat_selected_lawn_tennis);
                                break;
                            case 7:
                                sportImg.setImageResource(R.drawable.cat_selected_golf);
                                break;
                        }
                    }else{
                        isActive = false;
                        switch (getAdapterPosition()) {
                            case 0:
                                sportImg.setImageResource(R.drawable.cat_inactive_basketball);
                                break;
                            case 1:
                                sportImg.setImageResource(R.drawable.cat_inactive_badminton);
                                break;
                            case 2:
                                sportImg.setImageResource(R.drawable.cat_inactive_volleyball);
                                break;
                            case 3:
                                sportImg.setImageResource(R.drawable.cat_inactive_soccer);
                                break;
                            case 4:
                                sportImg.setImageResource(R.drawable.cat_inactive_table_tennis);
                                break;
                            case 5:
                                sportImg.setImageResource(R.drawable.cat_inactive_bowling);
                                break;
                            case 6:
                                sportImg.setImageResource(R.drawable.cat_inactive_lawn_tennis);
                                break;
                            case 7:
                                sportImg.setImageResource(R.drawable.cat_inactive_golf);
                                break;
                        }
                    }
                }
            });
        }
    }
}
