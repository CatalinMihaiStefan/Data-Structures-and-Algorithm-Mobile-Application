package com.example.mobiledevassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * MainActivity class represents the main interface .
 *where you access all 3 activities with the algorithms.
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */

/**
 * Method for the  xml layout.
 */
public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Method for  accessing the FirstActivity class.
     */
    public void firstActivityLink(View view) {
        Intent go = new Intent(this, FirstActivity.class);
        startActivity(go);
    }

    /**
     * Method for  accessing the SecondActivity class.
     */
    public void secondActivityLink(View view){
        Intent go = new Intent(this, SecondActivity.class);
        startActivity(go);
    }

    /**
     * Method for  accessing the ThirdActivity class.
     */
    public void thirdActivityLink(View view){
        Intent go = new Intent(this, ThirdActivity.class);
        startActivity(go);
    }




}
