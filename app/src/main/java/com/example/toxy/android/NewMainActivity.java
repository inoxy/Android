package com.example.toxy.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class NewMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);
    }
    Button button1 = (Button) findViewById(R.id.button1);
    Button button2 = (Button) findViewById(R.id.button2);
    Button button3 = (Button) findViewById(R.id.button3);

}
