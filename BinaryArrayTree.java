import java.util.Arrays;

public class BinaryArrayTree {
    int limit = (int) Math.pow(2, 6) - 1;
    
    public BinaryArrayTree() {
        final int DEFAULT_CAPACITY = limit ; //makes the array size 2^6 - 1 = 63 which equals a full array of 6 levels
        int size = 0;
        Arrays[] binaryArrayTree = new Arrays [DEFAULT_CAPACITY];
    }

    public int findLeftChild(int n) {
        return (2 * n + 1);
    }

    public int findRightChild(int n) {
        return (2 * n + 2);
    }

    public void insert(int item) {
        if (size >= DEFAULT_CAPACITY) {
            System.out.println("Array is full, please make more room");
        }
        else {
            this.binaryArrayTree[size + 1] = item;    
            size++;
        }

    }

    public String toString() {
        String output;
        for(int i = 0; i <= binaryArrayTree.length(); i++) {
            output = binaryArrayTree.getElement(i);
        }
        return output;
    }

    public int getElement(int output) {
        return output;
    }
} 