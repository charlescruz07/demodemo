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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.cruz.sportify.R;

public class SelectSportActivity extends AppCompatActivity implements View.OnClickListener{

    private Button nextBtn;
    private ImageView basketImg,badmintonImg,volleyballImg,soccerImg,pingpongImg,bowlingImg,tennisImg,golfImg;
    boolean isActive = false;
    private CardView basketCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sport2);

        basketImg = (ImageView) findViewById(R.id.basketImg);
        badmintonImg = (ImageView) findViewById(R.id.badmintonImg);
        volleyballImg= (ImageView) findViewById(R.id.volleyballImg);
        soccerImg = (ImageView) findViewById(R.id.soccerImg);
        pingpongImg = (ImageView) findViewById(R.id.pingpongImg);
        bowlingImg = (ImageView) findViewById(R.id.bowlingImg);
        tennisImg = (ImageView) findViewById(R.id.tennisImg);
        golfImg = (ImageView) findViewById(R.id.golfImg);

        nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectSportActivity.this,SelectFrequencyActivity.class));
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
                    }else {
                        basketImg.setImageResource(R.drawable.cat_inactive_basketball);
                    }
                break;
            case R.id.badmintonImg:
                    if(badmintonImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this, R.drawable.cat_inactive_badminton).getConstantState())){                        badmintonImg.setImageResource(R.drawable.cat_selected_badminton);
                    }else{
                        badmintonImg.setImageResource(R.drawable.cat_inactive_badminton);
                    }

                break;
            case R.id.volleyballImg:
                if(volleyballImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this,R.drawable.cat_inactive_volleyball).getConstantState())){
                    volleyballImg.setImageResource(R.drawable.cat_selected_volleyball);
                }else{
                    volleyballImg.setImageResource(R.drawable.cat_inactive_volleyball);
                }
                break;
            case R.id.soccerImg:
                if(soccerImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this,R.drawable.cat_inactive_soccer).getConstantState())){
                    soccerImg.setImageResource(R.drawable.cat_selected_soccer);
                }else{
                    soccerImg.setImageResource(R.drawable.cat_inactive_soccer);
                }
                break;
            case R.id.pingpongImg:
                if(pingpongImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this,R.drawable.cat_inactive_table_tennis).getConstantState())){
                    pingpongImg.setImageResource(R.drawable.cat_selected_table_tennis);
                }else{
                    pingpongImg.setImageResource(R.drawable.cat_inactive_table_tennis);
                }
                break;
            case R.id.bowlingImg:
                if(bowlingImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this,R.drawable.cat_inactive_bowling).getConstantState())){
                    bowlingImg.setImageResource(R.drawable.cat_selected_bowling);
                }else{
                    bowlingImg.setImageResource(R.drawable.cat_inactive_bowling);
                }
                break;
            case R.id.tennisImg:
                if(tennisImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this,R.drawable.cat_inactive_lawn_tennis).getConstantState())){
                    tennisImg.setImageResource(R.drawable.cat_selected_lawn_tennis);
                }else{
                    tennisImg.setImageResource(R.drawable.cat_inactive_lawn_tennis);
                }
                break;
            case R.id.golfImg:
                if(golfImg.getDrawable().getConstantState().equals(ContextCompat.getDrawable(this,R.drawable.cat_inactive_golf).getConstantState())){
                    golfImg.setImageResource(R.drawable.cat_selected_golf);
                }else{
                    golfImg.setImageResource(R.drawable.cat_inactive_golf);
                }
                break;
        }
    }
}
