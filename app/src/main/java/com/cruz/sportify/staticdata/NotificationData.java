package com.cruz.sportify.staticdata;

import com.cruz.sportify.R;
import com.cruz.sportify.model.NotificationModel;

import java.util.ArrayList;

/**
 * Created by Basilan on 7/1/2017.
 */

public class NotificationData {
    private ArrayList<NotificationModel> notificationModels;

    public NotificationData(){
        notificationModels = new ArrayList<>();
        int[] profilePic = {R.drawable.cat_active_badminton,R.drawable.cat_active_basketball,R.drawable.cat_active_golf};
        String[] text = {"Charles Cruz mentioned you in a comment.","Anton Wycoco is playing nearby.","Beatrice Ylaya likes your photo"};
        String[] hrs = {"6 hrs ago","7 hrs ago","8hrs ago"};

        for(int i =0; i < profilePic.length;i++){
            notificationModels.add(new NotificationModel(text[i],hrs[i],profilePic[i]));
        }
    }
    public ArrayList<NotificationModel> getNotificationModels(){
        return notificationModels;
    }
}
