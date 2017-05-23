package com.example.toxy.android;

import android.media.MediaRecorder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by lolnoxy@gmail.com on 5/21/2017.
 */

public class Dyktafon extends AppCompatActivity{

//    private MediaRecorder myAudioRecorder;
//    myAudioRecorder = new MediaRecorder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dyktafon);
    }

    private void Start_Stop_Button(){
        Button button=(Button) findViewById(R.id.start_stop);
        String NAGRYWANIE = "Nagrywanie";
        String STOP = "Stop";
        if (button.getText()==NAGRYWANIE){
            Start_Recording();
            button.setText(STOP);
        } else {
            Stop_Recording();
            button.setText(NAGRYWANIE);
        }
    }

    private void Start_Recording(){

    }

    private void Stop_Recording(){

    }

}
