package jsjf.LinkedList;

import jsjf.LinearNode;
import java.util.*;

/**
 * This is my linked list child, ordered linked list.
 * this class serves to implement the orderedListADT, whick is to implemet
 * the add function to the linkedList class.
 * @author Patrick Thrower
 * @version 1.0
 * @param <T>
 */

public class OrderedLinkedList<T> extends LinkedList<T> implements OrderedListADT<T>, Comparable<OrderedLinkedList<T>>{

     /**
    * Adds the specified element to this list at the proper location
    *
    * @param element the element to be added to this list
    */
    @Override
    public void add(T element) {
            LinearNode<T> newNode = new LinearNode<>(element);

        if (isEmpty() || element.compareTo(head.getElement()) <= 0) {
            // Insert at the beginning of the list
            newNode.setNext(head);
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        } else {
            // Traverse the list to find the appropriate position
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
    }

    @Override
    public int compareTo(OrderedLinkedList<T> o) {
        return 0;
    }   
    
}
