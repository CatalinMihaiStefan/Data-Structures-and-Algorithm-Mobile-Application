package com.example.mobiledevassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import Backend.Stacks;

/**
 * FirstActivity class represents the frontend for the Stack class.
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */

public class FirstActivity extends AppCompatActivity {

    /**
     * Initialize field of type Stacks.
     */
    private Stacks stack_list;

    /**
     * Initialize 16 fields of type TextView for visualize the added strings .
     */
    private TextView f1;
    private TextView f2;
    private TextView f3;
    private TextView f4;
    private TextView f5;
    private TextView f6;
    private TextView f7;
    private TextView f8;
    private TextView f9;
    private TextView f10;
    private TextView f11;
    private TextView f12;
    private TextView f13;
    private TextView f14;
    private TextView f15;
    private TextView f16;

    /**
     * Initialize field of type EditText for input.
     */
    private EditText editText;

    /**
     * Override a method for the  xml layout.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        stack_list = new Stacks();
        f1 = findViewById(R.id.element_1);
        f2 = findViewById(R.id.element_2);
        f3 = findViewById(R.id.element_3);
        f4 = findViewById(R.id.element_4);
        f5 = findViewById(R.id.element_5);
        f6 = findViewById(R.id.element_6);
        f7 = findViewById(R.id.element_7);
        f8 = findViewById(R.id.element_8);
        f9 = findViewById(R.id.element_9);
        f10 = findViewById(R.id.element_10);
        f11 = findViewById(R.id.element_11);
        f12 = findViewById(R.id.element_12);
        f13 = findViewById(R.id.element_13);
        f14 = findViewById(R.id.element_14);
        f15 = findViewById(R.id.element_15);
        f16 = findViewById(R.id.element_16);

        editText = findViewById(R.id.element_insert_typed);

    }

    /**
     * Method to add a string on the interface.
     */
    public void push_stack(View v) {
        String message = editText.getText().toString();
        if (editText.getText().toString().trim().length() > 0){
            editText.setText("");
            if (stack_list.get_size() == 0) {
                f1.setText(message);
            }
            else if (stack_list.get_size() == 1) {
                f2.setText(message);
            }
            else if (stack_list.get_size() == 2) {
                f3.setText(message);
            }
            else if (stack_list.get_size() == 3) {
                f4.setText(message);
            }
            else if (stack_list.get_size() == 4) {
                f5.setText(message);
            }
            else if (stack_list.get_size() == 5) {
                f6.setText(message);
            }
            else if (stack_list.get_size() == 6) {
                f7.setText(message);
            }
            else if (stack_list.get_size() == 7) {
                f8.setText(message);
            }
            else if (stack_list.get_size() == 8) {
                f9.setText(message);
            }
            else if (stack_list.get_size() == 9) {
                f10.setText(message);
            }
            else if (stack_list.get_size() == 10) {
                f11.setText(message);
            }
            else if (stack_list.get_size() == 11) {
                f12.setText(message);
            }
            else if (stack_list.get_size() == 12) {
                f13.setText(message);
            }
            else if (stack_list.get_size() == 13) {
                f14.setText(message);
            }
            else if (stack_list.get_size() == 14) {
                f15.setText(message);
            }
            else if (stack_list.get_size() == 15) {
                f16.setText(message);
            }
            stack_list.push_string(message);
        }
    }

    /**
     * Method to remove the last string added from the interface.
     */
    public void pop_stack(View view) {

        if(stack_list.get_size() > 0) {
            stack_list.pop_string();
            int i = stack_list.get_size();
            if(i == 0){
                f1.setText("element1");
            } else {
                if (i == 1) {
                    f2.setText("element 2");
                } else {
                    if(i==2){
                        f3.setText("element 3");
                    } else {
                        if (i == 3) {
                            f4.setText("element 4");
                        } else {
                            if (i == 4) {
                                f5.setText("element 5");
                            } else {
                                if (i == 5) {
                                    f6.setText("element 6");
                                } else {
                                    if (i == 6) {
                                        f7.setText("element 7");
                                    } else {
                                        if (i == 7) {
                                            f8.setText("element 8");
                                        } else {
                                            if (i == 8) {
                                                f9.setText("element 9");
                                            } else {
                                                if (i == 9) {
                                                    f10.setText("element 10");
                                                } else {
                                                    if (i == 10) {
                                                        f11.setText("element 11");
                                                    } else {
                                                        if (i == 11) {
                                                            f12.setText("element 12");
                                                        } else {
                                                            if (i == 12) {
                                                                f13.setText("element 13");
                                                            } else {
                                                                if (i == 13) {
                                                                    f14.setText("element 14");
                                                                } else {
                                                                    if (i == 14) {
                                                                        f15.setText("element 15");
                                                                    } else {
                                                                        if (i == 15) {
                                                                            f16.setText("element 16");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }

        }
    }

    /**
     * Method to remove  all the string on the interface.
     */
   public void clear_stack(View view){
        stack_list.clear_stack();
        f1.setText("element 1");
        f2.setText("element 2");
        f3.setText("element 3");
        f4.setText("element 4");
        f5.setText("element 5");
        f6.setText("element 6");
        f7.setText("element 7");
        f8.setText("element 8");
        f9.setText("element 9");
        f10.setText("element 10");
        f11.setText("element 11");
        f12.setText("element 12");
        f13.setText("element 13");
        f14.setText("element 14");
        f15.setText("element 15");
        f16.setText("element 16");
        editText.setText("");

   }
}
