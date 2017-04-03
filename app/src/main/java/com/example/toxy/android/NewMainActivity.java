package com.example.toxy.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class NewMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);
    }

    public void button1_action(View target){
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Wciśnięto przycisk1");
    }

    public void button2_action(View target){
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Wciśnięto przycisk2");
    }

    public void button3_action(View target){
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Wciśnięto przycisk3");
    }

    public void submit_action(View target){

    }
}
