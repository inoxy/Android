package com.example.toxy.android;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by lolnoxy@gmail.com on 5/21/2017.
 */

public class Odtwarzacz_Muzyki extends AppCompatActivity{

    static final private int ALERT_DIALOG_PLAIN = 1;
    static final private int ALERT_DIALOG_BUTTONS = 2;
    static final private int ALERT_DIALOG_LIST = 3;
    static final private int CUSTOM_ALERT_DIALOG = 4;
    private Button btnNewAlertDialog;
    private Button btnNewAlertDialogButton;
    private Button btnNewAlertDialogList;
    private Button btnNewCustomAlertDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odtwarzacz_muzyki);
        btnNewAlertDialog = (Button) findViewById(R.id.btnNewAlertDialog);
        btnNewAlertDialogButton = (Button) findViewById(R.id.btnNewAlertDialogButton);
        btnNewAlertDialogList = (Button) findViewById(R.id.btnNewAlertDialogList);
        btnNewCustomAlertDialog = (Button) findViewById(R.id.btnNewCustomAlertDialog);
        initButtonsClick();
    }

    private void initButtonsClick() {
        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnNewAlertDialog:
                        showDialog(ALERT_DIALOG_PLAIN);
                        break;
                    case R.id.btnNewAlertDialogButton:
                        showDialog(ALERT_DIALOG_BUTTONS);
                        break;
                    case R.id.btnNewAlertDialogList:
                        showDialog(ALERT_DIALOG_LIST);
                        break;
                    case R.id.btnNewCustomAlertDialog:
                        showDialog(CUSTOM_ALERT_DIALOG);
                        break;

                    default:
                        break;
                }
            }
        };
        btnNewAlertDialog.setOnClickListener(listener);
        btnNewAlertDialogButton.setOnClickListener(listener);
        btnNewAlertDialogList.setOnClickListener(listener);
        btnNewCustomAlertDialog.setOnClickListener(listener);
    }


}
