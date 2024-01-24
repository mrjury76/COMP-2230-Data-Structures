package jsjf;

public class DropOutArrayStack<T> extends ArrayStack<T> {

    private final static int DEFAULT_CAPACITY = 100;
    private int top = 0;
    private T[] stack;

    public DropOutArrayStack() {
        this(DEFAULT_CAPACITY);
    }
    
    public DropOutArrayStack(int initialCapacity) {
        top = 0;
        stack = (T[]) (new Object[initialCapacity]);
    }

    //overridding the push method
    public void push(T element) {
        /**
        * what does push do? take the input element and puts it into the "top" of the stack.
        * now with a drop out stack we need to introduce a modulus operator to take top when its
        * reached to actual top of the stack and assign it to top % stack.length. so if i have
        * a length of 20 and top is at 20, 20 % 20 = 0 right? so the element will be assigned to index 0.
        * Which is good. then what. what about reading through the array now that weve overridden the first index.
        * index i thorugh stack.length will get the overflow first. we need a counter?
        */

        stack[top] = element;
        top++;

    }

    public void printStackElements() {
        int current = (top - 1 + stack.length) % stack.length;
        for (int i = 0; i < size(); i++) {
            System.out.println(stack[current]);
            current = (current - 1 + stack.length) % stack.length;
        }
    }
    
    
}