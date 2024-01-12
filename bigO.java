public class bigO {
    private static final int SIZE = 2; //size of the array

    public static void main (String[] args){
        int[] array = new int[SIZE];  //initialzing an array of variable size
        int count = 0, iCount = 0, jCount = 0; //counters for each loop

        for(int i = 0; i<array.length; i++){ //looping through the array
            iCount += 1;

            for(int j = 0; j<array.length; j++){ //looping through the array
                jCount += 1;

                for(int k = 0; k<array.length; k++){ //looping through the array
                    System.out.println("Hello World"); //printing hello world for each iteration
                    count += 1;
                }
            }
        }
        System.out.println(iCount); //These counters are to show how many times each loops runs
        System.out.println(jCount); //these numbers coincide with the order of array.length^n
        System.out.printf("%d\n\n", count); // O(n^3)
    }
}