package com.example.toxy.android;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by lolnoxy@gmail.com on 5/21/2017.
 */

public class GPS extends AppCompatActivity{


    TextView txt = (TextView) findViewById(R.id.wspolrzedne);
    TextView dlugosc = (TextView) findViewById(R.id.dlugosc);
    TextView szerokosc = (TextView) findViewById(R.id.szerokosc);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);
    }

    private void Locate(){
        String mojDostawca;
        Location loc;
        Criteria cr=new Criteria();
        LocationManager mylm = (LocationManager) getSystemService(LOCATION_SERVICE);
        mojDostawca = mylm.getBestProvider(cr, true);
        loc = mylm.getLastKnownLocation(mojDostawca);
        dlugosc.setText("dlugosc geograficzna: "+loc.getLongitude());
        szerokosc.setText("szerokosc geograficzna: "+loc.getLatitude());



        txt.setText("ok");
    }

}
