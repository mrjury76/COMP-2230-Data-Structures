public class question7 {
    public static void main(String[] args) {
        logN();
        constant();
        nLogN();
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
}
