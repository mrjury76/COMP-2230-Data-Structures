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
public abstract class LinkedList<T> implements ListADT<T> {
    
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
        return remove(head.getElement());
    }

    /**
     * Removes the last element in this list and returns a reference
     * to it. Throws an EmptyCollectionException if the list is empty.
     *
     * @return the last element in this list
     * @throws EmptyCollectionException if the list is empty
     */
    public T removeLast() throws EmptyCollectionException {
        return remove(tail.getElement());
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
        return head.getElement();
    }

    /**
     * Returns the last element in this list without removing it.
     *
     * @return the last element in this list
     * @throws EmptyCollectionException if the list is empty
     */
    public T last() throws EmptyCollectionException {
        return tail.getElement();
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
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            T element = iterator.next();
            if (element.equals(targetElement)) {
                return true; // Element found
            }
        }
        return false; // Element not found
    }
    

    /**
     * Returns true if this list is empty and false otherwise.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
            return head == null ;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in the list
     */
    public int size() {
        return count;
    }

    /**
     * Returns a string representation of this list.
     *
     * @return a string representation of the list
     */
    public String toString() {
        StringBuilder output = new StringBuilder("[");
        LinearNode<T> current = head;

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

    /**
     * Returns an iterator for the elements in this list.
     *
     * @return an iterator over the elements of the list
     */
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }


    private class LinkedListIterator extends LinkedList<T> implements Iterator<T>  {
        private int iteratorModCount; // the number of elements in the collection
        private LinearNode<T> current; // the current position
    
        /**
         * Sets up this iterator using the specified items.
         *
         * @param collection the collection the iterator will move over
         * @param size       the integer size of the collection
         */
        public LinkedListIterator() {
            current = head;
            iteratorModCount = modCount;
        }
    
        /**
         * Returns true if this iterator has at least one more element to deliver in the iteration.
         *
         * @return true if this iterator has at least one more element to deliver in the iteration
         * @throws ConcurrentModificationException if the collection has changed while the iterator is in use
         */
        public boolean hasNext() throws ConcurrentModificationException {
            if (iteratorModCount != modCount)
                throw new ConcurrentModificationException();
    
            return (current != null);
        }
    
        /**
         * Returns the next element in the iteration. If there are no more elements in this iteration,
         * a NoSuchElementException is thrown.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iterator is empty
         */
        public T next() throws ConcurrentModificationException {
            if (!hasNext())
                throw new NoSuchElementException();
    
            T result = current.getElement();
            current = current.getNext();
            return result;
        }
    
        /**
         * The remove operation is not supported.
         *
         * @throws UnsupportedOperationException if the remove operation is called
         */
        public void remove() throws UnsupportedOperationException {
            throw new UnsupportedOperationException();
        }
    
        public int getCount() {
            return count;
        }
    
        public void setCount(int count) {
            this.count = count;
        }
    
        public LinearNode<T> getHead() {
            return head;
        }
    
        public void setHead(LinearNode<T> head) {
            this.head = head;
        }
    
        public LinearNode<T> getTail() {
            return tail;
        }
    
        public void setTail(LinearNode<T> tail) {
            this.tail = tail;
        }
    
        public int getModCount() {
            return modCount;
        }
    
        public void setModCount(int modCount) {
            this.modCount = modCount;
        }
    }
}
