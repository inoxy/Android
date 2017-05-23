package com.example.toxy.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class panda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panda);
    }

//    int [] zdjecia={R.drawable.panda, R.drawable.panda2, R.drawable.panda3, R.drawable.panda4, R.drawable.panda5};
    int licznik=0;


    public void powrot(View v){
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,NewMainActivity.class);
        startActivity(intent);
    }

    public void prev(View v){
//        --licznik;
//        if (licznik==-1)
//            licznik=4;
//        ImageView image = (ImageView) findViewById(R.id.imageView);
//        image.setImageResource(zdjecia[licznik]);
    }
    public void next (View view){
//        ++licznik;
//        if (licznik==5)
//            licznik=0;
//        ImageView image = (ImageView) findViewById(R.id.imageView);
//        image.setImageResource(zdjecia[licznik]);
    }
}
