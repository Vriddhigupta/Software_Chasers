package com.example.vjti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.clubs.clubs;

import com.example.e_resources.resources;
import com.example.events.events;

import cgpakoto.com.cgpa.Activities.Home;

public class
dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void openevent(View v){
        Intent intent = new Intent(this, events.class);
        startActivity(intent);
    }
    public void openyear(View v){
        Intent intent = new Intent(this,year.class);
        startActivity(intent);
    }
    public void openclub(View v){
        Intent intent = new Intent(this, clubs.class);
        startActivity(intent);
    }

    public void opencalculator(View v){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openresource(View v){
        Intent intent = new Intent(this, resources.class);
        startActivity(intent);
    }

}
