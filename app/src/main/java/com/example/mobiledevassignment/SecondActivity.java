package com.example.mobiledevassignment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import Backend.Queues;

/**
 * SecondActivity class represents the frontend for the Queues class.
 *
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */

public class SecondActivity extends AppCompatActivity {

    /**
     * Initialize field of type Queues.
     */
    private Queues queue_list;

    /**
     * Initialize 12 fields of type TextView.
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
    /**
     * Initialize field of type TextView for head.
     */
    private TextView head_view;

    /**
     * Initialize field of type TextView for tail.
     */
    private TextView tail_view;
    /**
     * Initialize fields of type EditText for input.
     */
    private EditText editText;

    /**
     * Override a method for the  xml layout.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        queue_list = new Queues();
        f1 = findViewById(R.id.element_q1);
        f2 = findViewById(R.id.element_q2);
        f3 = findViewById(R.id.element_q3);
        f4 = findViewById(R.id.element_q4);
        f5 = findViewById(R.id.element_q5);
        f6 = findViewById(R.id.element_q6);
        f7 = findViewById(R.id.element_q7);
        f8 = findViewById(R.id.element_q8);
        f9 = findViewById(R.id.element_q9);
        f10 = findViewById(R.id.element_q10);
        f11 = findViewById(R.id.element_q11);
        f12 = findViewById(R.id.element_q12);
        head_view = findViewById(R.id.head_set);
        tail_view = findViewById(R.id.tail_set);
        editText = findViewById(R.id.element_insert_typed_queue);

    }

    /**
     * Method to add a string on the interface.
     */
    public void enqueue_queue(View v) {
        String message = editText.getText().toString();
        if (editText.getText().toString().trim().length() > 0) {
            editText.setText("");
            if (queue_list.get_size() == 0) {
                f1.setText(message);
            } else if (queue_list.get_size() == 1) {
                f2.setText(message);
            } else if (queue_list.get_size() == 2) {
                f3.setText(message);
            } else if (queue_list.get_size() == 3) {
                f4.setText(message);
            } else if (queue_list.get_size() == 4) {
                f5.setText(message);
            } else if (queue_list.get_size() == 5) {
                f6.setText(message);
            } else if (queue_list.get_size() == 6) {
                f7.setText(message);
            } else if (queue_list.get_size() == 7) {
                f8.setText(message);
            } else if (queue_list.get_size() == 8) {
                f9.setText(message);
            } else if (queue_list.get_size() == 9) {
                f10.setText(message);
            } else if (queue_list.get_size() == 10) {
                f11.setText(message);
            } else if (queue_list.get_size() == 11) {
                f12.setText(message);
            }
            queue_list.add_string(message);
            tail_view.setText("" + queue_list.getTail());
        }
    }

    /**
     * Method to remove the first string added from the interface.
     */
    public void dequeue_queue(View view) {
        if(queue_list.get_size() > 0) {
            queue_list.remove_string();
            int i = queue_list.get_size()-queue_list.getTail();
            if (i == 0) {
                f1.setText("element12");
            } else {
                if (i == 1) {
                    f2.setText("element 11");
                } else {
                    if (i == 2) {
                        f3.setText("element 10");
                    } else {
                        if (i == 3) {
                            f4.setText("element 9");
                        } else {
                            if (i == 4) {
                                f5.setText("element 8");
                            } else {
                                if (i == 5) {
                                    f6.setText("element 7");
                                } else {
                                    if (i == 6) {
                                        f7.setText("element 6");
                                    } else {
                                        if (i == 7) {
                                            f8.setText("element 5");
                                        } else {
                                            if (i == 8) {
                                                f9.setText("element 4");
                                            } else {
                                                if (i == 9) {
                                                    f10.setText("element 3");
                                                } else {
                                                    if (i == 10) {
                                                        f11.setText("element 2");
                                                    } else {
                                                        if (i == 11) {
                                                            f12.setText("element 1");
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
            queue_list.remove_string();
            head_view.setText("" + queue_list.getHead());
        }
    }

    /**
     * Method to remove  all the string on the interface.
     */
    public void clear_queue(View view) {
        queue_list.clear_queue();
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
        editText.setText("");
        queue_list.setHead(0);
        queue_list.setTail(0);
    }
}
