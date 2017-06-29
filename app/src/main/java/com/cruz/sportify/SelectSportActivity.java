package com.cruz.sportify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class SelectSportActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sport);
        mBtnNext = (Button) findViewById(R.id.nextBtn);
        mBtnNext.setOnClickListener(this);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.Adapter selectSportAdapter = new SelectSportAdapter();
        recyclerView.setAdapter(selectSportAdapter);
    }

    @Override
    public void onClick(View v) {

    }
}
