package jsjf;

import jsjf.exceptions.*;
import java.util.Arrays;

/**
 * ArrayStack class, which implements the StackADT interface. ArrayStack is a generic stack  
 * @author Patrick Thrower
 * @version 1.1
 */

public class ArrayStack<T> implements StackADT<T> {

    private final static int DEFAULT_CAPACITY = 100;

    protected int top;  //declaring the variables top and stack
    protected T[] stack;

    //Creates an empty stack using the default capacity of 100
    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    //Creates an customizable capacity stack with user input
    public ArrayStack(int initialCapacity){
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }
    
    //method to double capacity when full
    private void expandCapactity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    //push method to simply push an element onto the stack
    public void push(T element) {
        if (size() == stack.length)
            expandCapactity();

        stack[top] = element;
        top++;
    }

    //pop method with exception handling
    public T pop() throws EmptyCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException("stack");

        top--;
        T result = stack[top];
        stack[top] = null;

        return result;
    }

    //peek method that returns the topmost element
    public T peek() throws EmptyCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException("stack");

        return stack[top-1];
    }

    //checks to see if the stack is empty
    public boolean isEmpty() {
        if(top == 0) 
            return true;

        else
            return false;
    }

    //returns top which is the same as size
    public int size() {
       return top;
    }

    //toString that appends every item into a string and returns it
    public String toString() {
        
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < top; i++) 
            output.append(stack[i]).append(" ");
        return output.toString();
    }

    //getters and setters for top and stack variables
    public int getTop(){
        return top;
    }

    public void setTop(int input){
        top = input;
    }

    public T[] getStack() {
        return stack;
    }

    public void setStack(T[] input){
        stack = input;
    }

    public int getLength(){
        return stack.length;
    }
}
