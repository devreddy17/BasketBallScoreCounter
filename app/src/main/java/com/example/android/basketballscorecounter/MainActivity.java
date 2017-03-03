package com.example.android.basketballscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreA =0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void reset(View view){
        scoreA=0;
        scoreB=0;
        TextView iScore= (TextView) findViewById(R.id.TeamA_Score_Text_view);
        iScore.setText(scoreA +"");
        TextView iScore1= (TextView) findViewById(R.id.TeamB_Score_Text_view);
        iScore1.setText(scoreB +"");
    }
    public void aincrementThree(View view){
        scoreA +=3;
        TextView iScore= (TextView) findViewById(R.id.TeamA_Score_Text_view);
        iScore.setText(scoreA +"");
    }
    public void aincrementTwo(View  view){
        scoreA +=2;
        TextView iScore= (TextView) findViewById(R.id.TeamA_Score_Text_view);
        iScore.setText(scoreA +"");
    }
    public void aincrementOne(View view){
        scoreA +=1;
        TextView iScore= (TextView) findViewById(R.id.TeamA_Score_Text_view);
        iScore.setText(scoreA +"");
    }

    public void bincrementThree(View view){
        scoreB +=3;
        TextView iScore= (TextView) findViewById(R.id.TeamB_Score_Text_view);
        iScore.setText(scoreB +"");
    }
    public void bincrementTwo(View  view){
        scoreB +=2;
        TextView iScore= (TextView) findViewById(R.id.TeamB_Score_Text_view);
        iScore.setText(scoreB +"");
    }
    public void bincrementOne(View view){
        scoreB +=1;
        TextView iScore= (TextView) findViewById(R.id.TeamB_Score_Text_view);
        iScore.setText(scoreB +"");
    }

}
