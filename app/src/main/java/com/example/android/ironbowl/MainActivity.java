package com.example.android.ironbowl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreAuburn = 0;
    int scoreTeamAlabama = 0;

    /**
     * Displays the given score for Auburn.
     */
    public void displayForTeamAuburn (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_Auburn_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the CONVERSION/SAFETY button is clicked
     */
    public void plus2POINTS (View view) {
        scoreAuburn = scoreAuburn + 2 ;
        displayForTeamAuburn(scoreAuburn);
    }

    /**
     * This method is called when the FIELD GOAL button is clicked
     */
    public void FIELDGOAL (View view){
        scoreAuburn = scoreAuburn + 3 ;
        displayForTeamAuburn(scoreAuburn);
    }

    /**
     * This method is called when the Extra Point button is clicked
     */
    public void plus1POINT(View view) {
        scoreAuburn = scoreAuburn + 1 ;
        displayForTeamAuburn(scoreAuburn);
    }

    /**
     * This method is called when the TOUCHDOWN button is clicked
     */
    public void TOUCHDOWN (View view) {
        scoreAuburn = scoreAuburn + 6 ;
        displayForTeamAuburn(scoreAuburn);
    }
    /**
     * Displays the given score for Team Alabama.
     */
    public void displayForTeamAlabama(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_Alabama_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method is called when the SAFETY/CONVERSION button is clicked
     */
    public void add2POINTS (View view) {
        scoreTeamAlabama = scoreTeamAlabama + 2 ;
        displayForTeamAlabama(scoreTeamAlabama);
    }

    /**
     * This method is called when the EXTRA POINT button is clicked
     */
    public void add1POINT(View view) {
        scoreTeamAlabama = scoreTeamAlabama + 1 ;
        displayForTeamAlabama(scoreTeamAlabama);
    }

    /**
     * This method is called when the FIELD GOAL button ic clicked
     */
    public void add3POINTS (View view){
        scoreTeamAlabama = scoreTeamAlabama + 3 ;
        displayForTeamAlabama(scoreTeamAlabama);
    }

    /**
     * This method is called when the TOUCHDOWN button is clicked
     */
    public void add6POINTS (View view) {
        scoreTeamAlabama = scoreTeamAlabama + 6 ;
        displayForTeamAlabama(scoreTeamAlabama);}

    /**
     * This method is called when the reset button is clicked
     */
    public void reset (View view) {
        scoreAuburn = 0;
        scoreTeamAlabama = 0;

        displayForTeamAuburn(0);
        displayForTeamAlabama(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
