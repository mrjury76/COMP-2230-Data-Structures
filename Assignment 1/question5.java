public class question5 {
    public static void main(String[] args) {
        int count = 0;
        int[] array = new int[1000000000]; //initialzing the array with an extremely large size to prove that the size doesnt matter in this case.

        for(int i = 0; i < 5; i++) { //looping through the array 5 times
            System.out.println(array[i]); 
            count++;
        }
        System.out.printf("%d\n", count);
    }
}
