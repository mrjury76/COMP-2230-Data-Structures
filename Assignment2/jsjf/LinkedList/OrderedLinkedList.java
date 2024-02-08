package jsjf.LinkedList;

import jsjf.LinearNode;

/**
 * This is my linked list child, ordered linked list.
 * this class serves to implement the OrderedListADT, which is to implement
 * the add function to the LinkedList class.
 * @author Patrick Thrower
 * @version 1.5
 * @param <T>
 */

public class OrderedLinkedList<T extends Comparable<T>> extends LinkedList<T> implements OrderedListADT<T>{

     /**
    * Adds the specified element to the front of the list if the stack is empty or when the input element is smaller or equal to 
    * whats in the head already. Else, the add function will iterate through the list checking if the next node is greater than it, 
    * and inserts it into the list, reassigning the pointers to include it in the list. 
    * The tail pointer will be reassigned when the stack is empty and the first node is added, 
    * or the element is added at the very end, then the tail pointer will be reassigned to point to the new tail. 
    *
    * @param element the element to be added to this list
    */
    @Override
    public void add(T element) {
        LinearNode<T> newNode = new LinearNode<>(element);

        if (isEmpty() || element.compareTo(head.getElement()) <= 0) {
            newNode.setNext(head);
            head = newNode;
            if (tail == null)
                tail = newNode;
        } else {
            LinearNode<T> current = head;
            LinearNode<T> previous = null;

            while (current != null && element.compareTo(current.getElement()) > 0) {
                previous = current;
                current = current.getNext();
            }
            newNode.setNext(current);
            previous.setNext(newNode);

            if (current == null)
                tail = newNode;
        }
        super.count++;
        super.modCount++;
    }
}
