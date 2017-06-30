package com.cruz.sportify.LoginRegistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.cruz.sportify.LoginRegistration.SelectSportAdapter;
import com.cruz.sportify.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class SelectSportActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnNext;
    RecyclerView.Adapter selectSportAdapter;
    private ArrayList<String> list = new ArrayList<>();
    RecyclerView recyclerView;
    public Button getmBtnNext() {
        return mBtnNext;
    }

    public void setmBtnNext(Button mBtnNext) {
        this.mBtnNext = mBtnNext;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sport);
        mBtnNext = (Button) findViewById(R.id.nextBtn);
        mBtnNext.setOnClickListener(this);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        selectSportAdapter = new SelectSportAdapter();
        recyclerView.setAdapter(selectSportAdapter);

    }

    @Override
    public void onClick(View v) {

    }
}
