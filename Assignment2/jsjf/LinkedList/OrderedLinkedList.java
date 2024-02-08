package jsjf.LinkedList;

import jsjf.LinearNode;

/**
 * This is my linked list child, ordered linked list.
 * this class serves to implement the OrderedListADT, which is to implement
 * the add function to the LinkedList class.
 * @author Patrick Thrower
 * @version 1.0
 * @param <T>
 */

public class OrderedLinkedList<T extends Comparable<T>> extends LinkedList<T> implements OrderedListADT<T>{

     /**
    * Adds the specified element to this list at the proper location
    *
    * @param element the element to be added to this list
    */
    @Override
    public void add(T element) {
            LinearNode<T> newNode = new LinearNode<>(element);

        //inserts element into the front of the list if the stack is empty and thats where the node 
        //should go or if the element is smaller than whats in the head already
        if (isEmpty() || element.compareTo(head.getElement()) <= 0) {
            newNode.setNext(head);
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }  
        //else we will compare the element to other node to see where it will be inserted into.
        } else {
            LinearNode<T> current = head;
            LinearNode<T> previous = null;

            while (current != null && element.compareTo(current.getElement()) > 0) {
                previous = current;
                current = current.getNext();
            }

            // Insert the new node at the appropriate position
            newNode.setNext(current);
            previous.setNext(newNode);

            // Update the tail pointer if necessary
            if (current == null) {
                tail = newNode;
            }
        }
        super.count++;
        super.modCount++;
    }
    
}
