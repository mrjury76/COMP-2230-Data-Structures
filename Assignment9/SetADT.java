package Assignment9;

import java.util.Arrays;

public class SetADT {
    private int[] elements;
    private int size;

    //constructors that take in a capacity and initialize the elements array, with a default of 10
    public SetADT(int capacity) {
        elements = new int[capacity];
        size = 0;
    }

    public SetADT() {
        this(10);
    }

    //set add method, if the element does not exist in the set, add it
    public void add(int element) {
        if(!contains(element)) {
            elements[size] = element;
            size++;
        }
    }

    //remove method searches through the array and removes the target element
    public void remove(int element) {
        for(int i = 0; i < size; i++) {
            if(elements[i] == element) {
                for(int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                size--;
            }
        }
    }

    //contains method searches through the array and returns true if the element is found
    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String result = "{";
        for (int i = 0; i < size; i++) {
            result += elements[i];
            if (i < size - 1) {
                result += ", ";
            }
        }
        result += "}";
        return result;
    }

}
