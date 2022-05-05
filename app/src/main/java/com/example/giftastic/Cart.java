package com.example.giftastic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);
    }

    public void shipping (View view) {
        //go to delivery_address page
        Intent del = new Intent(getApplicationContext(), DeliveryAddress.class);
        startActivity(del);
    }

    public void checkout () {
        //[post, update product quantity in database]

        //toast, order added

        //go to Occasions
        Intent occ = new Intent(getApplicationContext(), Occasions.class);
        startActivity(occ);
    }
}
