package com.example.giftastic;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SpecificOccasion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //using name of occasion from intent,
            // take the products fom database and fill recyclerView
            //[get products for specific product type]
    }

    public void addToCart (View v)  {
        //add product to cart of user
        //[post product id linked with user id]
    }
}
