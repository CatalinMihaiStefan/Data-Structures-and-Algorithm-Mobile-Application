package com.example.mobiledevassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import Backend.Fibonacci;

/**
 * ThirdActivity class represents the backend for the Fibonacci class.
 *
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */

public class ThirdActivity extends AppCompatActivity {

    /**
     * Initialized field  of type Fibonacci class.
     */
    private Fibonacci new_fibonacci;

    /**
     * Initialize field of type EditText for input.
     */
    private EditText input_number;
    /**
     * Initialize fields of type TextView to visualize .
     */
    private TextView fib_no_view;

    /**
     * Override a method for the  xml layout.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        new_fibonacci= new Fibonacci();
        input_number = findViewById(R.id.input_number);
        fib_no_view = findViewById(R.id.fib_no_view);
    }
    /**
     * Method to add number that will be length of fibonacci table.
     */
    public void setButton_calculate(View view){
        if(input_number.getText().toString().trim().length() > 0)
        fib_no_view.setText(new_fibonacci.create_fibonacci(Integer.parseInt(input_number.getText().toString())));
    }

}
