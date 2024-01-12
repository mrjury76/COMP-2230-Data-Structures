public class question4 {
    private static final int SIZE = 4; //size of the array

    public static void main(String[] args) {
        int count = 0;

        int[] array = new int[SIZE];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                count++;
                someMethod(array[j]);
            }
        }
        System.out.printf("%d\n\n", count); // O(n^2)
    }

    public static void someMethod(int n) {
        System.out.printf("Hello World, ");
    }
}
