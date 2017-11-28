package com.example.dimaculangan.progressapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_course);
    }
    public void firstSubject(View view){
        Intent intent = new Intent(this, Categories.class);
        startActivity(intent);
    }
}
