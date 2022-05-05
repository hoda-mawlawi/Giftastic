package com.example.giftastic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SpecificOccasion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.specific_occasion);

        //using name of occasion from intent,
            // take the products fom database and fill recyclerView
            //[get products for specific product type]
    }

    public void addToCart (View v)  {
        //add product to cart of user
        //[post product id linked with user id]
    }

    public void back (View v) {
        Intent occ = new Intent(getApplicationContext(), Occasions.class);
        startActivity(occ);
    }

    public void goToCart (View view) {
        Intent cart = new Intent(getApplicationContext(), Cart.class);
        startActivity(cart);
    }
}
