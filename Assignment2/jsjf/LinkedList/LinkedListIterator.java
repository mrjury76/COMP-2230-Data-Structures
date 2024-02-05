package jsjf.LinkedList;

// import java.util.ConcurrentModificationException;
import java.util.*;
import jsjf.LinearNode;

public class LinkedListIterator<T> extends LinkedList<T> implements Iterator<T>  {
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
