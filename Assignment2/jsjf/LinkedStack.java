package jsjf;

import jsjf.exceptions.EmptyCollectionException;
import jsjf.ArrayStack.*;

public class LinkedStack<T> implements StackADT<T> {

    protected int count;
    protected LinearNode<T> top;

    public LinkedStack(){  //default constructor. sets count to 0 and top to null
        count = 0;
        top = null;
    }

    public void push(T element) {  //push method to add elements to the top of the stack
        LinearNode<T> newNode = new LinearNode<T>(element);  //creates a new node with the element

        newNode.setNext(top);  //sets the new node "next" to the current top
        top = newNode;  //the reference of the new node is stored in top
        count++;  //increment count
    }

    public T pop() {
        if(isEmpty()) {
            throw new EmptyCollectionException("stack");
        }

        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }

    public T peek() {
        if(isEmpty()) {
            throw new EmptyCollectionException("stack");
        }
        return top.getElement();
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
    
    public String toString() {
        StringBuilder output = new StringBuilder("[");
        LinearNode<T> current = top;

        while(current != null) {
            output.append(current.getElement());
            current = current.getNext();
            if(current != null) {
                output.append(", ");
            }
        }

        output.append("]");
        return output.toString();
    }
}
