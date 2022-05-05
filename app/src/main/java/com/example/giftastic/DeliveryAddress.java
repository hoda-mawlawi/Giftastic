package com.example.giftastic;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DeliveryAddress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delivery_address);

    }

    public void enterAddress () {
        //[post address to addresses and add the address's id to user info]

        //toast address stored

        //go to cart
        Intent cart = new Intent(getApplicationContext(), Cart.class);
        startActivity(cart);
    }
}
