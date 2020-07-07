package com.example.vjti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.firstyear.firstyear;
import com.example.fourthyear.fourthyear;
import com.example.second.secondyear;
import com.example.thirdyear.thirdyear;

public class year extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);
    }
    public void openthree(View v){
        Intent intent = new Intent(this, thirdyear.class);
        startActivity(intent);}
    public void openfirst(View v){
        Intent intent = new Intent(this, firstyear.class);
        startActivity(intent);

        }
        public void openfour(View v ){
        Intent intent = new Intent(this, fourthyear.class);
        startActivity(intent);
        }
        public void opensecond(View v){
        Intent intent = new Intent(this, secondyear.class);
        startActivity(intent);
        }
}
