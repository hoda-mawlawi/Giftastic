package com.example.giftastic;

import android.content.Intent;
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
        Intent sp_occ = new Intent(getApplicationContext(), SpecificOccasion.class);
        //obj.putExtra("title", v.getText());
        startActivity(sp_occ);
    }

    public void goToCart (View view) {
        Intent cart = new Intent(getApplicationContext(), Cart.class);
        startActivity(cart);
    }
}
