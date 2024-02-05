package jsjf.LinkedList;

import java.util.Iterator;

/**
 * The ListADT interface represents the abstract behavior of a list data structure.
 * It defines the operations that can be performed on a list.
 *
 * @param <T> the type of elements stored in the list
 */
public interface ListADT<T> extends Iterable<T>{

    /**
     * Removes and returns the first element from the list.
     *
     * @return the first element in the list
     */
    public T removeFirst();

    /**
     * Removes and returns the last element from the list.
     *
     * @return the last element in the list
     */
    public T removeLast();

    /**
     * Removes the specified element from the list.
     *
     * @param element the element to be removed from the list
     * @return the removed element
     */
    public T remove(T element);

    /**
     * Returns a reference to the first element in the list without removing it.
     *
     * @return a reference to the first element in the list
     */
    public T first();

    /**
     * Returns a reference to the last element in the list without removing it.
     *
     * @return a reference to the last element in the list
     */
    public T last();
    
    /**
     * Returns true if this list contains the specified targer element.
     *
     * @param target the target to search for in the list
     * @return true if the list contains the target element, false otherwise
     */
    public boolean contains(T target);

    /**
     * Checks if the list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in the list.
     *
     * @return the integer representation of number of elements in the list
     */
    public int size();

    /**
     * Returns an iterator for the elements in the list.
     *
     * @return an iterator over the elements in the list
     */
    public Iterator<T> iterator();

    /**
     * Returns a string representation of the list.
     *
     * @return a string representation of the list
     */
    public String toString();
}
