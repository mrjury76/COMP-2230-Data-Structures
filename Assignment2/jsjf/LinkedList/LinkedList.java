package jsjf.LinkedList;

import jsjf.LinearNode;
import jsjf.exceptions.*;
import java.util.*;

/**
 * LinkedList represents a linked implementation of a list.
 *
 * @author Java Foundations
 * @version 4.0
 */
public abstract class LinkedList<T> implements ListADT<T>, Iterable<T> {
    
    protected int count;
    protected LinearNode<T> head, tail;
    protected int modCount;

    /**
     * Creates an empty list.
     */
    public LinkedList() {
        count = 0;
        head = tail = null;
        modCount = 0;
    }

    /**
     * Removes the first element in this list and returns a reference
     * to it. Throws an EmptyCollectionException if the list is empty.
     *
     * @return a reference to the first element of this list
     * @throws EmptyCollectionException if the list is empty
     */
    public T removeFirst() throws EmptyCollectionException {
        // To be completed as a Programming Project
        return null; // temp
    }

    /**
     * Removes the last element in this list and returns a reference
     * to it. Throws an EmptyCollectionException if the list is empty.
     *
     * @return the last element in this list
     * @throws EmptyCollectionException if the list is empty
     */
    public T removeLast() throws EmptyCollectionException {
        // To be completed as a Programming Project
        return null; // temp
    }

    /**
     * Removes the first instance of the specified element from this
     * list and returns a reference to it. Throws an EmptyCollectionException
     * if the list is empty. Throws a ElementNotFoundException if the
     * specified element is not found in the list.
     *
     * @param targetElement the element to be removed from the list
     * @return a reference to the removed element
     * @throws EmptyCollectionException if the list is empty
     * @throws ElementNotFoundException if the target element is not found
     */
    public T remove(T targetElement) throws EmptyCollectionException, ElementNotFoundException {
        if (isEmpty())
            throw new EmptyCollectionException("LinkedList");
    
        boolean found = false;
        LinearNode<T> previous = null;
        LinearNode<T> current = head;
    
        while (current != null && !found)
            if (targetElement.equals(current.getElement()))
                found = true;
            else {
                previous = current;
                current = current.getNext();
            }
    
        if (!found)
            throw new ElementNotFoundException("LinkedList");
    
        if (size() == 1) // only one element in the list
            head = tail = null;
        else if (current.equals(head)) // target is at the head
            head = current.getNext();
        else if (current.equals(tail)) { // target is at the tail
            tail = previous;
            tail.setNext(null);
        } else // target is in the middle
            previous.setNext(current.getNext());
    
        count--;
        modCount++;
    
        return current.getElement();
    }

    /**
     * Returns the first element in this list without removing it.
     *
     * @return the first element in this list
     * @throws EmptyCollectionException if the list is empty
     */
    public T first() throws EmptyCollectionException {
        // To be completed as a Programming Project
        return null; // temp
    }

    /**
     * Returns the last element in this list without removing it.
     *
     * @return the last element in this list
     * @throws EmptyCollectionException if the list is empty
     */
    public T last() throws EmptyCollectionException {
        // To be completed as a Programming Project
        return null; // temp
    }

    /**
     * Returns true if the specified element is found in this list and
     * false otherwise. Throws an EmptyCollectionException if the list
     * is empty.
     *
     * @param targetElement the element that is sought in the list
     * @return true if the element is found in this list
     * @throws EmptyCollectionException if the list is empty
     */
    public boolean contains(T targetElement) throws EmptyCollectionException {
        // To be completed as a Programming Project
        return true; // temp
    }

    /**
     * Returns true if this list is empty and false otherwise.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        // To be completed as a Programming Project
        return true; // temp
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in the list
     */
    public int size() {
        // To be completed as a Programming Project
        return 0; // temp
    }

    /**
     * Returns a string representation of this list.
     *
     * @return a string representation of the list
     */
    public String toString() {
        // To be completed as a Programming Project
        return ""; // temp
    }

    /**
     * Returns an iterator for the elements in this list.
     *
     * @return an iterator over the elements of the list
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

}
