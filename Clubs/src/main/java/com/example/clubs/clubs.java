package com.example.clubs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clubs extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCoc();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSra();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDla();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIeee();
            }
        });

        button5 = (Button)  findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAero();
            }
        });

        button6 = (Button)  findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRace();
            }
        });
    }
    public void openCoc()
    {
        Intent intent = new Intent(this, Coc.class);
        startActivity(intent);

    }

    public void openSra()
    {
        Intent intent = new Intent(this, Sra.class);
        startActivity(intent);

    }

    public void openDla()
    {
        Intent intent = new Intent(this, Dla.class);
        startActivity(intent);

    }

    public void openIeee()
    {
        Intent intent = new Intent(this, Ieee.class);
        startActivity(intent);

    }

    public void openAero()
    {
        Intent intent = new Intent(this, Aero.class);
        startActivity(intent);

    }

    public void openRace()
    {
        Intent intent = new Intent(this, Race.class);
        startActivity(intent);

    }
}
