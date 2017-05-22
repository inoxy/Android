package com.example.toxy.android;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.toxy.android.R.array.opisWilka;

public class wilki extends AppCompatActivity {

    private ListView lv;
    private String [] wilki;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wilki);
        lv = (ListView) findViewById(R.id.wilki);
        txt = (TextView) findViewById(R.id.opis);
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
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id){
                txt.setText(wilkoweCharakterystyki[pos]);
//                Toast.makeText(getApplicationContext(),wilkoweCharakterystyki[pos], Toast.LENGTH_SHORT).show();
            }
        });
    }


    String wilkoweCharakterystyki[]={"jeden z największych podgatunków wilka szarego, drapieżnego ssaka z rodziny psowatych (Canidae). Charakteryzuje się grubą, białą sierścią i to jest jego główna cecha wyróżniająca.","gatunek drapieżnego ssaka z rodziny psowatych (Canidae), zamieszkującego lasy, równiny, tereny bagienne oraz góry Eurazji i Ameryki Północnej. Gatunek o skłonnościach terytorialnych. Zwykle terytorium zajmowane przez watahę to 100–300 km²[10], ale wielkość ta zależy od dostępności pokarmu i terenu.","To jest tak na prawde kojot"};
}
