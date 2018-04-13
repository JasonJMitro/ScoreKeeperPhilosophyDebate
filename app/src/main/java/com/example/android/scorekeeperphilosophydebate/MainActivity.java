package com.example.android.scorekeeperphilosophydebate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String Plato = "scorePlato";
    static final String Aristotle = "scoreAristotle";
    int scorePlato = 0;
    int scoreAristotle = 0;
    TextView scoreViewPlato;
    TextView scoreViewAristotle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        scoreViewPlato = findViewById(R.id.plato_score);
        scoreViewAristotle = findViewById(R.id.aristotle_score);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(Plato, scorePlato);
        outState.putInt(Aristotle, scoreAristotle);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scorePlato = savedInstanceState.getInt(Plato);
        scoreAristotle = savedInstanceState.getInt(Aristotle);
        displayForPlato(scorePlato);
        displayForAristotle(scoreAristotle);
    }


    /**
     * Increase the score for Plato by 1 point.
     */
    public void addOneForPlato(View v) {
        scorePlato = scorePlato + 1;
        displayForPlato(scorePlato);
    }

    /**
     * Increase the score for Plato by 2 points.
     */
    public void addTwoForPlato(View v) {
        scorePlato = scorePlato + 2;
        displayForPlato(scorePlato);
    }

    /**
     * Increase the score for Plato by 3 points.
     */
    public void addThreeForPlato(View v) {
        scorePlato = scorePlato + 3;
        displayForPlato(scorePlato);
    }

    /**
     * Increase the score for Aristotle by 1 point.
     */
    public void addOneForAristotle(View v) {
        scoreAristotle = scoreAristotle + 1;
        displayForAristotle(scoreAristotle);
    }

    /**
     * Increase the score for Aristotle by 2 points.
     */
    public void addTwoForAristotle(View v) {
        scoreAristotle = scoreAristotle + 2;
        displayForAristotle(scoreAristotle);
    }

    /**
     * Increase the score for Aristotle by 3 points.
     */
    public void addThreeForAristotle(View v) {
        scoreAristotle = scoreAristotle + 3;
        displayForAristotle(scoreAristotle);
    }

    /**
     * Reset the score for both philosophers to 0 points.
     */

    public void reset(View v) {
        scorePlato = 0;
        scoreAristotle = 0;
        displayForPlato(scorePlato);
        displayForAristotle(scoreAristotle);
    }

    /**
     * Displays the given score for Plato.
     */
    public void displayForPlato(int score) {

        scoreViewPlato.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Aristotle.
     */
    public void displayForAristotle(int score) {
        scoreViewAristotle.setText(String.valueOf(score));
    }


}

