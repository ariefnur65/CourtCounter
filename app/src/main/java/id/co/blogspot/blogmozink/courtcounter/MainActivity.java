package id.co.blogspot.blogmozink.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TeamA3(View v){
        TextView ScoreA = (TextView) findViewById(R.id.TeamA);
        Integer Score = Integer.parseInt(ScoreA.getText().toString());
        Score+=3;
        ScoreA.setText(Score.toString());
    }

    public void TeamA2(View v){
        TextView ScoreA = (TextView) findViewById(R.id.TeamA);
        Integer Score = Integer.parseInt(ScoreA.getText().toString());
        Score+=2;
        ScoreA.setText(Score.toString());
    }

    public void TeamAF(View v){
        TextView ScoreA = (TextView) findViewById(R.id.TeamA);
        Integer Score = Integer.parseInt(ScoreA.getText().toString());
        Score+=1;
        ScoreA.setText(Score.toString());
    }

    public void TeamB3(View v){
        TextView ScoreB = (TextView) findViewById(R.id.TeamB);
        Integer Score = Integer.parseInt(ScoreB.getText().toString());
        Score+=3;
        ScoreB.setText(Score.toString());
    }


    public void TeamB2(View v){
        TextView ScoreB = (TextView) findViewById(R.id.TeamB);
        Integer Score = Integer.parseInt(ScoreB.getText().toString());
        Score+=2;
        ScoreB.setText(Score.toString());
    }


    public void TeamBF(View v){
        TextView ScoreB = (TextView) findViewById(R.id.TeamB);
        Integer Score = Integer.parseInt(ScoreB.getText().toString());
        Score+=1;
        ScoreB.setText(Score.toString());
    }

    public void Reset(View v){

        TextView ScoreA = (TextView) findViewById(R.id.TeamA);
        ScoreA.setText("0");
        TextView ScoreB = (TextView) findViewById(R.id.TeamB);
        ScoreB.setText("0");

    }


}
