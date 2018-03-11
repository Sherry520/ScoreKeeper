 package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addPointForTeamA(View view) {
        scoreA += 1;
        displayScoreA(scoreA);
        displayMessageA(getResources().getString(R.string.teama_win));
        displayMessageB("");
    }

    public void displayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_a_team);
        scoreView.setText(String.valueOf(score));
    }

    public void foulA(View view) {
        scoreB += 1;
        displayScoreB(scoreB);
        displayMessageA(getResources().getString(R.string.teama_foul) + "\n" + getResources().getString(R.string.teamb_win));
        displayMessageB("");
    }

    public void addPointForTeamB(View view) {
        scoreB += 1;
        displayScoreB(scoreB);
        displayMessageB(getResources().getString(R.string.teamb_win));
        displayMessageA("");
    }

    public void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_b_team);
        scoreView.setText(String.valueOf(score));
    }

    public void foulB(View view) {
        scoreA += 1;
        displayScoreA(scoreA);
        displayMessageB(getResources().getString(R.string.teamb_foul) + "\n" + getResources().getString(R.string.teama_win));
        displayMessageA("");
    }

    public void displayMessageA(String messageA) {
        TextView textViewA = (TextView) findViewById(R.id.message_a);
        textViewA.setText(messageA);
    }

    public void displayMessageB(String messageB) {
        TextView textViewB = (TextView) findViewById(R.id.message_b);
        textViewB.setText(messageB);
    }

    public void clearAllMessage(View view) {
        scoreA = 0;
        scoreB = 0;
        displayScoreA(0);
        displayScoreB(0);
        displayMessageA("");
        displayMessageB("");
    }
}
