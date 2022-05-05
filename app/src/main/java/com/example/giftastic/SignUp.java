package com.example.giftastic;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        //if email was sent from log in page, take it
    }

    public void signUp () {
        //if all the info is given, create a new user in the database with the info
        // [post user info]

        //possible errors
            //name, email and/or password not given
            //not valid email or password
            //email already exists
    }

    public void switchToLogIn () {
        //go to log in page, take email with you ?
    }
}
