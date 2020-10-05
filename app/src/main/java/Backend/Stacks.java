package Backend;
/**
 * Stacks class represents the backend for the FirstActivity class.
 *The stack will be implemented with an arrayList
 *
 * @version 1.0
 * @author Catalin Stefan
 *
 */
import java.util.Stack;

public class Stacks {
    /**
     *  Initializing the ArrayList
     */
    Stack<String> smallStack = new Stack<>();
    /**
     *  Constructor for Stack class(no parameters req)
     */
    public Stacks(){
    }
    /**
     * Method that returns the size of the stack.
     */
    public int get_size() {
        return smallStack.size();
    }

    /**
     * Method that adds a string if the list is not full.
     */
    public void push_string(String a){
        if(smallStack.size()< 15)// condition to stop push function if the stack reached full size.
        {smallStack.push(a);}
    }
    /**
     * Method that removes the last string added if the list is not empty.
     */
    public void pop_string() {
        if(smallStack.size()>0) // condition to stop pop function in case the stack is empty.
        { smallStack.pop();}
    }
    /**
     * Method that empty the stack .
     */
    public void clear_stack(){
            smallStack.clear();
    }



}

