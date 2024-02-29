import java.util.*;

public class assignment4 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        Integer[] array = new Integer[40];
        
        // Generate a random array of 40 integers
        for (int i = 0; i < 40; i++) {
            array[i] = rand.nextInt(999 + 1); // rand.nextInt(999) generates numbers from 1 to 999
        }
        System.out.println("Array before being sorted: " + Arrays.toString(array));

        // Sort the array
        Arrays.sort(array);
        
        System.out.println("\n\nArray after being sorted: " + Arrays.toString(array));
        
        // Example of binary search
        for (int i = 0; i < 3; i++) {
            System.out.println("please enter a searchable value");
            Integer target = scan.nextInt(); // Example target value

            int index = Arrays.binarySearch(array, target);
            String output = String.format("The target element %d has%s been found. %s", target, index >= 0 ? "": " NOT", index >= 0? "Yay!" : ":(");
            System.out.println(output);
        }
        scan.close();
    }

}
