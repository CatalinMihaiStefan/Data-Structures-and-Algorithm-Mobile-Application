package Backend;

import java.util.ArrayList;
/**
 * Queues class represents the backend for the SecondActivity class.
 *The queue will be implemented with an arrayList
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */

public class Queues {
    /**
     *  Initializing the head of queue.
     */
    public int head;

    /**
     *  Initializing the tail of queue.
     */
    public int tail;

    /**
     *  Initializing the head of queue.
     */
    public int size;

    /**
     *  Initializing the ArrayList
     */
    ArrayList<String> queue = new ArrayList<>();

    /**
     * Constructor for Fibonacci class(no parameter required).
     */
    public Queues() {
    }
    /**
     * Getter for head of the list.
     */
    public int getHead() {
        return head;
    }

    /**
     * Getter for size of the list.
     */
    public int get_size() {
        return queue.size();
    }

    /**
     * Getter for tail of the list.
     */
    public int getTail() {
        return tail;
    }

    /**
     * Setter for head of the list.
     */
    public void setHead(int head) {
        this.head = head;
    }

    /**
     * Setter for tail of the list.
     */
    public void setTail(int tail) {
        this.tail = tail;
    }
    /**
     * Method that checks if the list is empty.
     */
    public boolean isEmpty() {
        if (tail == head)
            return true;
        return false;
    }

    /**
     * Method that checks if the list is full.
     */
    public boolean isFull() {
        return head == tail + 1;
    }


    /**
     * Method for adding a string to list if is not full,
     * counting tail.
     */
    public void add_string(String x) {
        if (tail < 12) {
            if (!isFull()) {
                queue.add(x);
                if (tail == size)
                    tail = 1;
                else
                    tail++;

            }
        }
    }

    /**
     * Method for removing a the first added string from list if is not empty,
     * counting head.
     */
    public int remove_string() {
        int x = head;
        if(head<12) {
            if (!isEmpty()) {
                queue.remove(0);
                if (head == size) {
                    head = 1;
                } else {
                    head++;
                }
            }
        }
        return x;
    }

    /**
     * Method for clearing all the added elements in the list .
     */
    public void clear_queue()
    {
        queue.clear();
    }

}
