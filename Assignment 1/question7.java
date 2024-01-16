public class question7 {
    public static void main(String[] args) {
        logN();
        constant();
        nLogN();
        n2();
    }

    private static void logN() {
        int count = 0;

        for(int i = 100; i > 0; i/=2){
            System.out.println("Hello World");
            // System.out.println(i);
            count++;
        }

        System.out.println(count); 
    }

    private static void constant() {
        System.out.println("Hello World");
    }

    private static void nLogN() {
        //idk
    }

    private static void n2() {
        int[] arr = {10,43,23,67,54,3,21,54,67};
        // Initialize the array if necessary
    
        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {  //
            for (int j = 0; j < arr.length - 1 - i; j++) {  
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    
        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
