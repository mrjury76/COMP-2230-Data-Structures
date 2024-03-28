
public class BinaryArrayTree {
    int[] tree;
    int size;

    public BinaryArrayTree() {
        this(16); // Default capacity
    }

    public BinaryArrayTree(int capacity) {
        this.tree = new int[capacity];
        this.size = 0;
    }

    public void insert(int item) {
        if (size >= tree.length) {
            expandTree();
        }
        if (size == 0) {
            tree[0] = item; // Insert the first element at the root
        } else {
            insertRecursive(item, 0); // Call the recursive insert method
        }
        size++;
    }

    private void insertRecursive(int item, int index) {
        if (item <= tree[index]) {
            // Insert in the left subtree
            int leftChildIndex = leftChild(index);
            if (leftChildIndex < tree.length && tree[leftChildIndex] == 0) {
                tree[leftChildIndex] = item; // Insert the item
            } else {
                insertRecursive(item, leftChildIndex); // Recursively insert in the left subtree
            }
        } else {
            // Insert in the right subtree
            int rightChildIndex = rightChild(index);
            if (rightChildIndex < tree.length && tree[rightChildIndex] == 0) {
                tree[rightChildIndex] = item; // Insert the item
            } else {
                insertRecursive(item, rightChildIndex); // Recursively insert in the right subtree
            }
        }
    }

    private void expandTree() {
        int[] newTree = new int[tree.length * 2];
        System.arraycopy(tree, 0, newTree, 0, tree.length);
        tree = newTree;
    }

    private int leftChild(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int rightChild(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(tree[i]).append(", ");
        }
        return result.toString();
    }
}
