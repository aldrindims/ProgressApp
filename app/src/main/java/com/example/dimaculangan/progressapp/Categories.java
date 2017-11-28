package com.example.dimaculangan.progressapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }

    public void homeWork(View view){
        Intent intent = new Intent(this, Homework.class);
        startActivity(intent);
    }

    public void labExer(View view){
        Intent intent = new Intent(this, LabExer.class);
        startActivity(intent);
    }

    public void quizzes(View view){
        Intent intent = new Intent(this, Quizzes.class);
        startActivity(intent);
    }

    public void majorExams(View view){
        Intent intent = new Intent(this, MajorExams.class);
        startActivity(intent);
    }
}
