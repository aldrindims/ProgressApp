package com.example.dimaculangan.progressapp;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CustomDialog extends DialogFragment {

    LayoutInflater inflater;
    View view;
    EditText et_User, et_Password;
    int CATEGORY_SCORE, CATEGORY_TOTAL;
    DatabaseHelper myDatabaseHelper;
    SQLiteDatabase dbase;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        inflater = getActivity().getLayoutInflater();
        view = inflater.inflate(R.layout.activity_custom_dialog, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Score");
        builder.setView(view);
        builder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                et_User = ((EditText)view.findViewById(R.id.score));
                et_Password = ((EditText)view.findViewById(R.id.total_score));
                CATEGORY_SCORE = Integer.parseInt(et_User.getText().toString());
                CATEGORY_TOTAL = Integer.parseInt(et_Password.getText().toString());
                myDatabaseHelper.insertAdd(CATEGORY_SCORE, CATEGORY_TOTAL);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        Dialog dialog = builder.create();
        return dialog;
    }

}
