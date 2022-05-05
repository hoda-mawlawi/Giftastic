package com.example.giftastic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //possible animation?
        TextView app_name = findViewById(R.id.appName);
        //app_name.animate().alpha(0).setDuration(2000);
        //app_name.animate().alpha(1).setDuration(2000);
        //app_name.animate().alpha(0).setDuration(2000);
        //app_name.animate().alpha(1).setDuration(2000);
        app_name.setX(-1000);
        app_name.animate().translationXBy(1000).rotation(3600).setDuration(2000);

        //intent go to log in page
        Intent log = new Intent(getApplicationContext(), LogIn.class);
        startActivity(log);
    }
}