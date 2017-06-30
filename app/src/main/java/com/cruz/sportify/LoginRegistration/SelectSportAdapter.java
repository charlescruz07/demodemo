package com.cruz.sportify.LoginRegistration;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


import com.cruz.sportify.LoginRegistration.*;
import com.cruz.sportify.R;
import com.cruz.sportify.model.SportsPreference;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * Created by Acer on 28/06/2017.
 */

public class SelectSportAdapter extends RecyclerView.Adapter<SelectSportAdapter.ViewHolder> {

    private FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    String uid;
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
    private ArrayList<String> sportsPreference;

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

    public ArrayList<String> getSportsPreference() {
        return sportsPreference;
    }

    public void setSportsPreference(ArrayList<String> sportsPreference) {
        this.sportsPreference = sportsPreference;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView sportImg;
        boolean isActive;




        public ViewHolder(View itemView){
            super(itemView);
            sportsPreference = new ArrayList<>();
            sportImg = (ImageView) itemView.findViewById(R.id.sportImg);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!isActive) {
                        isActive = true;
                        switch (getAdapterPosition()) {
                            case 0:
                                sportImg.setImageResource(R.drawable.cat_selected_basketball);
                                sportsPreference.add(0,"Basketball");
                                break;
                            case 1:
                                sportImg.setImageResource(R.drawable.cat_selected_badminton);
                                sportsPreference.add(1,"Badminton");
                                break;
                            case 2:
                                sportImg.setImageResource(R.drawable.cat_selected_volleyball);
                                sportsPreference.add(2,"Volleyball");
                                break;
                            case 3:
                                sportImg.setImageResource(R.drawable.cat_selected_soccer);
                                sportsPreference.add(3,"Soccer");
                                break;
                            case 4:
                                sportImg.setImageResource(R.drawable.cat_selected_table_tennis);
                                sportsPreference.add(4,"Tennis");
                                break;
                            case 5:
                                sportImg.setImageResource(R.drawable.cat_selected_bowling);
                                sportsPreference.add(5,"Bowling");
                                break;
                            case 6:
                                sportImg.setImageResource(R.drawable.cat_selected_lawn_tennis);
                                sportsPreference.add(6,"Tennis");
                                break;
                            case 7:
                                sportImg.setImageResource(R.drawable.cat_selected_golf);
                                sportsPreference.add(7,"Golf");
                                break;
                        }
                    }else{
                        isActive = false;
                        switch (getAdapterPosition()) {
                            case 0:
                                sportImg.setImageResource(R.drawable.cat_inactive_basketball);
                                sportsPreference.remove(0);
                                break;
                            case 1:
                                sportImg.setImageResource(R.drawable.cat_inactive_badminton);
                                sportsPreference.remove(1);
                                break;
                            case 2:
                                sportImg.setImageResource(R.drawable.cat_inactive_volleyball);
                                sportsPreference.remove(2);
                                break;
                            case 3:
                                sportImg.setImageResource(R.drawable.cat_inactive_soccer);
                                sportsPreference.remove(3);
                                break;
                            case 4:
                                sportImg.setImageResource(R.drawable.cat_inactive_table_tennis);
                                sportsPreference.remove(4);
                                break;
                            case 5:
                                sportImg.setImageResource(R.drawable.cat_inactive_bowling);
                                sportsPreference.remove(5);
                                break;
                            case 6:
                                sportImg.setImageResource(R.drawable.cat_inactive_lawn_tennis);
                                sportsPreference.remove(6);
                                break;
                            case 7:
                                sportImg.setImageResource(R.drawable.cat_inactive_golf);
                                sportsPreference.remove(7);
                                break;
                        }
                    }
                    mFirebaseAuth = FirebaseAuth.getInstance();
                    FirebaseUser firebaseUser = mFirebaseAuth.getCurrentUser();
                    uid = firebaseUser.getUid();
                    setSportsPreference(sportsPreference);
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("Users").child(uid);
                    myRef.setValue(getSportsPreference());
                    Log.d("beatrice", String.valueOf(getSportsPreference().size()));
                }
            });
        }

    }
}
