package jsjf;

import jsjf.exceptions.*;
import java.util.Arrays;

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

    public void push(T element) {
        if (size() == stack.length)
            expandCapactity();

        stack[top] = element;
        top++;
    }

    private void expandCapactity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
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


}
