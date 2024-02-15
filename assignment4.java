import java.util.*;

public class assignment4 {

    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        Integer[] array = new Integer[40]; // Using Integer instead of int to make it compatible with generics
        
        for (int i = 0; i < 40; i++) {
            array[i] = rand.nextInt(999 + 1); // rand.nextInt(1000) generates numbers from 0 to 999
        }
        
        Arrays.sort(array); // Sort the array before binary search
        
        System.out.println(Arrays.toString(array));
        
        // Example of binary search
        for (int i = 0; i < 3; i++) {
            System.out.println("please enter a searchable value");
            Integer target = scan.nextInt(); // Example target value

            int index = Arrays.binarySearch(array, target);
            String output = String.format("The target element %d has%s been found. %s", target, index >= 0 ? "": " NOT", index >= 0? "Yay!" : ":(");
            System.out.println(output);
        }
    }

}
