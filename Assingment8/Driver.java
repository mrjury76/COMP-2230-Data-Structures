public class Driver {
    public static void main(String[] args) {
    assignment8 problem1 = new assignment8(17);
    assignment8 problem2 = new assignment8(17);
    assignment8 problem4 = new assignment8(16);
    assignment8 problem5 = new assignment8(16);
    HashIndexChecker hasher1 = new HashIndexChecker(17);
    HashIndexChecker hasher2 = new HashIndexChecker(16);

    problem1.insert(10);
    problem1.insert(20);
    problem1.insert(30);
    problem1.insert(40);
    problem1.insert(50);
    problem1.insert(60);
    problem1.insert(70);
    problem1.insert(80);
    problem1.insert(90);

    problem2.insert(11);
    problem2.insert(23);
    problem2.insert(31);
    problem2.insert(43);
    problem2.insert(53);
    problem2.insert(61);
    problem2.insert(79);
    problem2.insert(89);
    problem2.insert(97);

    problem4.insert(10);
    problem4.insert(20);
    problem4.insert(30);
    problem4.insert(40);
    problem4.insert(50);
    problem4.insert(60);
    problem4.insert(70);
    problem4.insert(80);
    problem4.insert(90);

    problem5.insert(11);
    problem5.insert(23);
    problem5.insert(31);
    problem5.insert(43);
    problem5.insert(53);
    problem5.insert(61);
    problem5.insert(79);
    problem5.insert(89);
    problem5.insert(97);
    
    System.out.println("Problem 1: " + problem1.toString());
    System.out.println("Number of collisions: " + problem1.getCollisionCounter());
    System.out.println();

    System.out.println("Problem 2: " + problem2.toString());
    System.out.println("Number of collisions: " + problem2.getCollisionCounter());
    System.out.println();

    System.out.println("Problem 4: " + problem4.toString());
    System.out.println("Number of collisions: " + problem4.getCollisionCounter());
    System.out.println();

    System.out.println("Problem 5: " + problem5.toString());
    System.out.println("Number of collisions: " + problem5.getCollisionCounter());
    System.out.println();

    //calling the HashIndexChecker findIndex method the find the index of elements 1 to 1000 and printing the results
    for(int i = 1; i <= 1000; i++) {
        hasher1.findIndex(i);
    }
    System.out.println(hasher1.toString());

    for(int i = 1; i <= 1000; i++) {
        hasher2.findIndex(i);
    }
    System.out.println(hasher2.toString());
    }    
}
