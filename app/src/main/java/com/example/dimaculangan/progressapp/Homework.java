package com.example.dimaculangan.progressapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Homework extends AppCompatActivity {

    public static Button btn_Dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);
    }

    public void dialogevent(View view){

        btn_Dialog = (Button) findViewById(R.id.button);
        btn_Dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(Homework.this);
                View myView = getLayoutInflater().inflate(R.layout.activity_dialog_page, null);
                EditText myscore = myView.findViewById(R.id.score);
                EditText mytotalscore = myView.findViewById(R.id.total_score);
                Button btnLogin = myView.findViewById(R.id.btnLogin);

                btnLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });

                myBuilder.setView(myView);
                AlertDialog dialog = myBuilder.create();
                dialog.show();
            }
        });

    }
}
