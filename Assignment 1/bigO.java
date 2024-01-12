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
                    System.out.printf("Hello World, "); //printing hello world for each iteration
                    count += 1;
                }
            }
        }
        System.out.printf("%d, %d, %d", iCount, jCount, count); //These counters are to show how many times each loops runs
    }
}