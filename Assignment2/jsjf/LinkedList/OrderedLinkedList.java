package jsjf.LinkedList;

import java.util.Comparator;
import jsjf.LinearNode;

public class OrderedLinkedList<T> extends LinkedList<T> implements OrderedListADT<T> {
    public OrderedLinkedList(){
        super();
    }

	@Override
	public void add(T element) {
        //add element in the proper location
        if(isEmpty()) {
            head = tail = new LinearNode<T>(element);
        }

        else {
            LinearNode<T> newNode = new LinearNode<T>(element);  //creates a new node with the element

            newNode.setNext(head);  //sets the new node "next" to the current top
            head = newNode;  //the reference of the new node is stored in top
            super.count++;  //increment count
        }
    }
}
