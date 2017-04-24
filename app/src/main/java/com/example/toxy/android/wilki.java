package com.example.toxy.android;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class wilki extends AppCompatActivity {

    private ListView lv;
    private String [] wilki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wilki);
        lv = (ListView) findViewById(R.id.wilki);
        initResources();
        initWilkiListView();
    }

    public void powrot(View v){
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,NewMainActivity.class);
        startActivity(intent);
    }

    private void initResources(){
        Resources res = getResources();
        wilki = res.getStringArray(R.array.wilki);
    }

    private void initWilkiListView(){
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1,wilki));
    }

}
