public class Driver {
    public static void main(String[] args) {
        BinaryArrayTree tree = new BinaryArrayTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        System.out.println("contents: \n" + tree.toString());
    }
}
