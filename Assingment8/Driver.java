public class Driver {
    public static void main(String[] args) {
    assignment8 problem1 = new assignment8();
    assignment8 problem2 = new assignment8();

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
    
    System.out.println(problem1.toString());
    System.out.println("Number of collisions: " + problem1.getCollisionCounter());
    System.out.println();
    System.out.println(problem2.toString());
    System.out.println("Number of collisions: " + problem2.getCollisionCounter());

    }    
}
