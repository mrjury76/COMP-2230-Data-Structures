package jsjf;

public class LinearNode<T> {

    private LinearNode<T> next; //declaring next node reference
    private T element; //declaring element reference

    public LinearNode() {  //default constructor
        next = null;
        element = null;
    }

    public LinearNode(T elem) {  //constructor with element parameter
        next = null;
        element = elem;
    }

    public LinearNode<T> getNext() {  //method to get next node
        return next;
    }

    public void setNext(LinearNode<T> node) { //method to set next node
        next = node;
    }

    public T getElement() { //method to get element
        return element;
    }

    public void setElement(T elem) {  //method to set element
        element = elem;
    }

    public String toString() {
        return element.toString();
    }
}
