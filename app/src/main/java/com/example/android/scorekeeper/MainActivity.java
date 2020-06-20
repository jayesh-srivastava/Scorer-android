package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addoneforA(View V)
    {
        scoreA+=1;
        displayA(scoreA);
    }
    public void addthreeforA(View V)
    {
        scoreA+=3;
        displayA(scoreA);
    }
    public void addfiveforA(View V)
    {
        scoreA+=5;
        displayA(scoreA);
    }
    public void suboneforA(View V)
    {
        scoreA-=1;
        displayA(scoreA);
    }
    public void subtwoforA(View V)
    {
        scoreA-=2;
        displayA(scoreA);
    }
    public void subthreeforA(View V)
    {
        scoreA-=3;
        displayA(scoreA);
    }
    public void addoneforB(View V)
    {
        scoreB+=1;
        displayB(scoreB);
    }
    public void addthreeforB(View V)
    {
        scoreB+=3;
        displayB(scoreB);
    }
    public void addfiveforB(View V)
    {
        scoreB+=5;
        displayB(scoreB);
    }
    public void suboneforB(View V)
    {
        scoreB-=1;
        displayB(scoreB);
    }
    public void subtwoforB(View V)
    {
        scoreB-=2;
        displayB(scoreB);
    }
    public void subthreeforB(View V)
    {
        scoreB-=3;
        displayB(scoreB);
    }
    public void reset(View V)
    {
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }
    public void displayA(int score)
    {
        TextView scoreA=(TextView) findViewById(R.id.teamA_score);
        scoreA.setText(String.valueOf(score));
    }
    public void displayB(int score)
    {
        TextView scoreB=(TextView) findViewById(R.id.teamB_score);
        scoreB.setText(String.valueOf(score));
    }
}
