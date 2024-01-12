import java.util.Arrays;

public class question7 {
    public static void main(String[] args) {
        logN();
        constant();
        nLogN();
        n2();
        n3();
        System.out.println(accumulator(10));
    }

    private static void logN() {
        int count = 0;
        for(int i = 100; i > 0; i/=2){
            // System.out.println("Hello World");
            System.out.println(i);
            count++;
        }
        System.out.println(count); 
    }

    private static void constant() {
        System.out.println("Hello World");
    }

    private static void nLogN() {
        int[] array = {9, 5, 2, 7, 3, 6, 1, 8, 4};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void n2() {
        int count = 0;
        int SIZE = 25;
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++){
                count++;
            }
        }
        System.out.printf("You have %d as the input and %d as the output\n", SIZE, count);
    }

    private static void n3() {
        int count = 0;
        int SIZE = 4;
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++)
                for(int k = 0; k < SIZE; k++){
                count++;
            }
        }
        System.out.printf("You have %d as the input and %d as the output\n", SIZE, count);
    }

    private static int accumulator(int input) {
        int output = 0;
        for(int i = 0; i < input; i ++) {
            output = input + accumulator(input-1);
        }
        return output;
    }
}
