package com.example.toxy.android;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class NewMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);
    }

    public void button1_action(View target){
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,panda.class);
        startActivity(intent);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Pandy są 7/7");
    }

    public void button2_action(View target){
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,wilki.class);
        startActivity(intent);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Kiedyś byłem poszukiwaczem przygód jak ty, ale później dostałem strzałą w kolano");
    }

    public void button4_action(View target){
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,Odtwarzacz_Muzyki.class);
        startActivity(intent);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Kiedyś byłem poszukiwaczem przygód jak ty, ale później dostałem strzałą w kolano");
    }

    public void button5_action(View target){
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,Dyktafon.class);
        startActivity(intent);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Wracam z dyktafonu lol");
    }

    public void button6_action(View target){
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,GPS.class);
        startActivity(intent);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Kiedyś byłem poszukiwaczem przygód jak ty, ale później dostałem strzałą w kolano");
    }

    public void button3_action(View target){
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Wciśnięto przycisk3");
    }

    public void submit_action(View target){
        TextView textView = (TextView) findViewById(R.id.name);
        EditText imie = (EditText) findViewById(R.id.imie);
        EditText nazwisko = (EditText) findViewById(R.id.nazwisko);
        textView.setText(imie.getText() + " " + nazwisko.getText());

    }


}
