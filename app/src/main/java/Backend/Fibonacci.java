package Backend;

import java.util.ArrayList;
/**
 * Fibonacci class represents the backend for the ThirdActivity class.
 *
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */

public class Fibonacci {
    /**
     *  Initializing the ArrayList
     */
    ArrayList<Integer> fib_list = new ArrayList<>();
    /**
     * Field  no1 used to calculate the fibonacci number.
     */
    int no1 = 0;

    /**
     * Field  no2 used to calculate the fibonacci number.
     */
    int no2 = 1;

    /**
     * Constructor for Fibonacci class(no parameter required).
     */
    public Fibonacci() {
    }
    /**
     * This method (one required parameter) is created to calculate
     * the list of fibonacci numbers.
     */

    public String create_fibonacci(int n){
        fib_list.add(no1);
        fib_list.add(no2);
        String text= "";
        for(int i = 1; i<n; i++){
            fib_list.add(fib_list.get(i)+fib_list.get(i-1));
        }
        for(int i = 1; i<=n; i++){
            text = text + i+"." +fib_list.get(i)+ "\n";
        }
        return text;


    }
}
