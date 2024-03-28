public class HashIndexChecker {
    private int[] array;

    public HashIndexChecker(int capacity) {
        this.array = new int[capacity];
    }

    //method that inserts element with the hashing function and returns the index of the hash function
    public int findIndex(int element) {
        int index = element % array.length;
        array[index] += 1;
        return index;
    }

    public String toString() {
        String output = "";
        for(int i = 0; i < array.length; i++) {
            output += array[i] + ", ";
        }
        return output;
    }
}
