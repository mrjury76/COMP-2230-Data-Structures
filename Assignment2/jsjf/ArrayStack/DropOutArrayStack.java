package jsjf.ArrayStack;

import jsjf.exceptions.EmptyCollectionException;

/**
 * The DropOutArrayStack class represents a stack data structure implemented using an array
 * with a fixed capacity. When the stack is full and a new element is pushed, the oldest
 * element in the stack is dropped (removed). It follows the Last-In-First-Out (LIFO)
 * principle, where elements are added and popped from the top of the stack.
 *
 * @param <T> the type of elements stored in the stack
 * @version 1.2
 * @author Patrick Thrower
 */

public class DropOutArrayStack<T> extends ArrayStack<T> {

    public DropOutArrayStack() {
        super(); // Calls the parent class's constructor
    }

    public DropOutArrayStack(int initialCapacity) {
        super(initialCapacity); // Calls the parent class's constructor with an initial capacity
    }

    //pushes element onto stack using a drop out mechanism
    public void push(T element) { 
        int wrappedIndex = (top % stack.length); //assigns the modulus of top and stack length to wrappedIndex
        stack[wrappedIndex] = element; //pushes elements onto the stack using the wrapped index
        top++;  //increments top
    }

    public T pop() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        top--;
        int wrappedIndex = (top % stack.length);
        T result = stack[wrappedIndex];
        stack[wrappedIndex] = null;

        return result;
    }

    public T peek() throws EmptyCollectionException {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        int wrappedIndex = (top % stack.length);
        return stack[wrappedIndex - 1];
    }

    //overrides parent's toString to print out full stack
    public String toString() {
        StringBuilder output = new StringBuilder("[");

        for(int i = 0; i < stack.length; i++) {
            if(i < top) {
                output.append(stack[i]);
            }
            if(i < stack.length-1) {
                output.append(", ");
            }
        }
        output.append("]");

        return output.toString();
    }

}
