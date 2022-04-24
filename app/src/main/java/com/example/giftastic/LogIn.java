package com.example.giftastic;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if came here from sign up page and email was sent, take it
    }

    public void logIn (View v) {
        //take email and password
        //[get email and password of user]
        //if email exists and password is correct, go to occasions page

        //otherwise give any of these errors
            //no email and/or password given
            //email or password are not correct
    }

    public void switchToSignUp (View v) {
        //intent to sign up page, take email if given?
    }
}
