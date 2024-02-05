package jsjf.ArrayStack;

/**
 * The StackADT interface represents the abstract behavior of a stack data structure.
 *
 * @param <T> the type of elements stored in the stack
 */
public interface StackADT<T> {

    /**
     * Adds the specified element to the top of the stack.
     *
     * @param element the element to be pushed onto the stack
     */
    public void push(T element);

    /**
     * Removes and returns the element at the top of the stack.
     *
     * @return the element removed from the top of the stack
     */
    public T pop();

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return the element at the top of the stack
     */
    public T peek();

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in the stack.
     *
     * @return the number of elements in the stack
     */
    public int size();

    /**
     * Returns a string representation of the stack.
     *
     * @return a string representation of the stack
     */
    public String toString();

}
