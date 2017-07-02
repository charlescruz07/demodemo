package com.cruz.sportify.LoginRegistration;

import android.content.Intent;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.cruz.sportify.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class SelectSportActivity extends AppCompatActivity implements View.OnClickListener{

    private Button nextBtn;
    private ImageView basketImg,badmintonImg,volleyballImg,soccerImg,pingpongImg,bowlingImg,tennisImg,golfImg;
    boolean isActive = false;
    private ArrayList<String> sportsPreference;
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mDatabaseReference;
    boolean basket,volley,bad,soccer,tennis,ttennis,bowling,golf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sport2);
        sportsPreference = new ArrayList<>();
        basketImg = (ImageView) findViewById(R.id.basketImg);
        badmintonImg = (ImageView) findViewById(R.id.badmintonImg);
        volleyballImg= (ImageView) findViewById(R.id.volleyballImg);
        soccerImg = (ImageView) findViewById(R.id.soccerImg);
        pingpongImg = (ImageView) findViewById(R.id.pingpongImg);
        bowlingImg = (ImageView) findViewById(R.id.bowlingImg);
        tennisImg = (ImageView) findViewById(R.id.tennisImg);
        golfImg = (ImageView) findViewById(R.id.golfImg);

        mFirebaseDatabase = FirebaseDatabase.getInstance();

        nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(basket){
                    sportsPreference.add("Basketball");
                }
                if(volley){
                    sportsPreference.add("Volley");
                }
                if(golf){
                    sportsPreference.add("Golf");
                }
                if(tennis){
                    sportsPreference.add("Tennis");
                }
                if(ttennis){
                    sportsPreference.add("Table Tennis");
                }
                if(soccer){
                    sportsPreference.add("Soccer");
                }
                if(bowling){
                    sportsPreference.add("Bowling");
                }
                if(bad){
                    sportsPreference.add("Badminton");
                }
                String uid = getIntent().getStringExtra("uID");
                mDatabaseReference = mFirebaseDatabase.getReference("Users").child(uid);
                mDatabaseReference.setValue(sportsPreference);
                startActivity(new Intent(SelectSportActivity.this,SampleActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.basketImg:
                    if(basketImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this, R.drawable.cat_inactive_basketball).getConstantState())){
                        basketImg.setImageResource(R.drawable.cat_selected_basketball);
                        basket = true;
                    }else {
                        basketImg.setImageResource(R.drawable.cat_inactive_basketball);
                        basket = false;
                    }
                break;
            case R.id.badmintonImg:
                    if(badmintonImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this, R.drawable.cat_inactive_badminton).getConstantState())){                        badmintonImg.setImageResource(R.drawable.cat_selected_badminton);
                        badmintonImg.setImageResource(R.drawable.cat_selected_badminton);
                        bad = true;
                    }else{
                        badmintonImg.setImageResource(R.drawable.cat_inactive_badminton);
                        bad = false;
                    }

                break;
            case R.id.volleyballImg:
                if(volleyballImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this,R.drawable.cat_inactive_volleyball).getConstantState())){
                    volleyballImg.setImageResource(R.drawable.cat_selected_volleyball);
                    volley = true;
                }else{
                    volleyballImg.setImageResource(R.drawable.cat_inactive_volleyball);
                    volley = false;
                }
                break;
            case R.id.soccerImg:
                if(soccerImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this,R.drawable.cat_inactive_soccer).getConstantState())){
                    soccerImg.setImageResource(R.drawable.cat_selected_soccer);
                    soccer = true;
                }else{
                    soccerImg.setImageResource(R.drawable.cat_inactive_soccer);
                    soccer = false;
                }
                break;
            case R.id.pingpongImg:
                if(pingpongImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this,R.drawable.cat_inactive_table_tennis).getConstantState())){
                    pingpongImg.setImageResource(R.drawable.cat_selected_table_tennis);
                    tennis = true;
                }else{
                    pingpongImg.setImageResource(R.drawable.cat_inactive_table_tennis);
                    tennis = false;
                }
                break;
            case R.id.bowlingImg:
                if(bowlingImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this,R.drawable.cat_inactive_bowling).getConstantState())){
                    bowlingImg.setImageResource(R.drawable.cat_selected_bowling);
                    bowling = true;
                }else{
                    bowlingImg.setImageResource(R.drawable.cat_inactive_bowling);
                    bowling = false;
                }
                break;
            case R.id.tennisImg:
                if(tennisImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this,R.drawable.cat_inactive_lawn_tennis).getConstantState())){
                    tennisImg.setImageResource(R.drawable.cat_selected_lawn_tennis);
                    ttennis = true;
                }else{
                    tennisImg.setImageResource(R.drawable.cat_inactive_lawn_tennis);
                    ttennis = false;
                }
                break;
            case R.id.golfImg:
                if(golfImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this,R.drawable.cat_inactive_golf).getConstantState())){
                    golfImg.setImageResource(R.drawable.cat_selected_golf);
                    golf = true;
                }else{
                    golfImg.setImageResource(R.drawable.cat_inactive_golf);
                    golf = false;
                }
                break;
        }
    }
}
