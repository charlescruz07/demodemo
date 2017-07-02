package com.cruz.sportify.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cruz.sportify.adapter.NotificationAdapter;
import com.cruz.sportify.R;
import com.cruz.sportify.model.NotificationModel;
import com.cruz.sportify.staticdata.NotificationData;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {

    RecyclerView.ViewHolder viewHolder;
    RecyclerView.Adapter adapter;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<NotificationModel> notificationModels;
    NotificationData notificationData;

    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this
        View view = inflater.inflate(R.layout.fragment_notification,container,false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        notificationData = new NotificationData();
        notificationModels = notificationData.getNotificationModels();


        adapter = new NotificationAdapter(getContext(),notificationModels);
        recyclerView.setAdapter(adapter);
        return view;


    }

}
