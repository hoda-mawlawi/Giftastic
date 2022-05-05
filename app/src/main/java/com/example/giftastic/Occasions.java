package com.example.giftastic;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Occasions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.occasions);

        //take occasions from database and fill the recyclerView
        //[get list of product types]
    }

    public void chooseOccasion (View v) {
        //go to specificOccasion and take name of occasion
    }
}
