package com.example.giftastic;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);


    }

    public void shipping () {
        //go to delivery_address page
    }

    public void checkout () {
        //[post, update product quantity in database]
    }
}
