package com.example.android.matmarker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scorePlayer1 = 0 ;
    int scorePlayer2 = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneToPlayer1 ( View view) {
        scorePlayer1++;
        displayForPlayer1(scorePlayer1);
    }

    public void addTwoToPlayer1 ( View view) {
        scorePlayer1 += 2;
        displayForPlayer1(scorePlayer1);
    }

    public void addFourToPlayer1 (View view) {
        scorePlayer1 += 4;
        displayForPlayer1(scorePlayer1);
    }

    public void addFiveToPlayer1 (View view) {
        scorePlayer1 += 5;
        displayForPlayer1(scorePlayer1);
    }

    public void addOneToPlayer2 ( View view) {
        scorePlayer2++;
        displayForPlayer2(scorePlayer2);
    }

    public void addTwoToPlayer2 ( View view) {
        scorePlayer2 += 2;
        displayForPlayer2(scorePlayer2);
    }

    public void addFourToPlayer2 (View view) {
        scorePlayer2 += 4;
        displayForPlayer2(scorePlayer2);
    }

    public void addFiveToPlayer2 (View view) {
        scorePlayer2 += 5;
        displayForPlayer2(scorePlayer2);
    }

    public void reset (View view) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        displayForPlayer2(scorePlayer2);
        displayForPlayer1(scorePlayer1);
    }

    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }
}
