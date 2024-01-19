package jsjf;

import jsjf.exceptions.*;
import java.util.Arrays;

/**
 * ArrayStack class, which implements the StackADT interface. ArrayStack is a generic stack  
 * @author Patrick Thrower
 * @version 1.0
 */

public class ArrayStack<T> implements StackADT<T> {

    private final static int DEFAULT_CAPACITY = 100;

    private int top;
    private T[] stack;

    //Creates an empty stack using the default capacity
    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    //Creates an customizable stack with user input
    public ArrayStack(int initialCapacity){
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }
    
    private void expandCapactity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public void push(T element) {
        if (size() == stack.length)
            expandCapactity();

        stack[top] = element;
        top++;
    }

    public T pop() throws EmptyCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException("stack");

        top--;
        T result = stack[top];
        stack[top] = null;

        return result;
    }

    public T peek() throws EmptyCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException("stack");

        return stack[top-1];
    }

    public boolean isEmpty() {
        if(top == 0) 
            return true;

        else
            return false;
    }

    public int size() {
       return top;
    }

    //chat gpt generated toString
    public String toString() {

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < top; i++) 
            output.append(stack[i]).append(" ");

        return output.toString();
    }
    

    // public String toString() {
    //     String output = "";
    //     for(int i = 0; i < stack.length; i++)
    //         output += String.format("%s, ", stack[i]);
    //     return output;
    // }


}
