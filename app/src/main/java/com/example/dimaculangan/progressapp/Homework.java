package com.example.dimaculangan.progressapp;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Homework extends AppCompatActivity {

    public static Button btn_Dialog;
    EditText myscore, mytotalscore;
    String total, score;
    LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);
    }

    public void dialogevent(View view){
        CustomDialog dialog = new CustomDialog();
        dialog.show(getFragmentManager(),"Hello");
    }
}
