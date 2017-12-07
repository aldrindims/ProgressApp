package com.example.dimaculangan.progressapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Aldrin on 29/11/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(Context context) {
        super(context, "grades.sqlite", null, 1);
        SQLiteDatabase database = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE HOMEWORK (ID INTEGER PRIMARY KEY AUTOINCREMENT, CATEGORY_SCORE INTEGER, CATEGORY_TOTAL INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP IF TABLE EXISTS HOMEWORK");
        onCreate(sqLiteDatabase);
    }

    public boolean insertAdd(int CATEGORY_SCORE, int CATEGORY_TOTAL){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("CATEGORY_SCORE", CATEGORY_SCORE);
        contentValues.put("CATEGORY_TOTAL", CATEGORY_TOTAL);

        long result = db.insert("HOMEWORK", null, contentValues);

        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
}
