package com.example.e_resources;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class btech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btech);
        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);

    }
    public void goto_fybtech(View view)
    {
        Intent intent=new Intent(this,fybtech.class);
        startActivity(intent); }
    public void goto_sybtech(View view)
    {
        Intent intent=new Intent(this,sybtech.class);
        startActivity(intent); }
    public void goto_tybtech(View view)
    {
        Intent intent=new Intent(this,tybtech.class);
        startActivity(intent); }
    public void goto_finalyearbtech(View view)
    {
        Intent intent=new Intent(this,finalyearbtech.class);
        startActivity(intent); }
}
