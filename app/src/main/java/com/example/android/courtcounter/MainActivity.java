package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_teamA = 0, score_teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayText_teamA(score_teamA);
        displayText_teamB(score_teamB);

    }
    //Button teamA_pt2 = (Button)findViewById(R.id.points2);

    public void teamA_pt2(View view){

        score_teamA += 2;
        displayText_teamA(score_teamA);

    }

    public void teamA_pt3(View view){

        score_teamA += 3;
        displayText_teamA(score_teamA);
    }

    public void teamA_freethrow(View view){

        score_teamA ++;
        displayText_teamA(score_teamA);
    }

    private void displayText_teamA(int number){

        TextView score = (TextView)findViewById(R.id.score);
        score.setText("" + number);
    }

    public void teamB_pt2(View view){

        score_teamB += 2;
        displayText_teamB(score_teamB);
    }

    public void teamB_pt3(View view){

        score_teamB += 3;
        displayText_teamB(score_teamB);
    }

    public void teamB_freethrow(View view){

        score_teamB ++;
        displayText_teamB(score_teamB);
    }

    private void displayText_teamB(int number){

        TextView score2 = (TextView)findViewById(R.id.score2);
        score2.setText("" + number);
    }

    public void reset(View view){

        score_teamA = 0;
        score_teamB = 0;
        displayText_teamA(score_teamA);
        displayText_teamB(score_teamB);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
