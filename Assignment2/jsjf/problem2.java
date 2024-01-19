package jsjf;

/**
 * This is the program to test problem 2 in assignment 2
 * @author Patrick Thrower
 * @version 1.0
 */

public class problem2 {
    public static void main(String[] args)  {
        DropOutArrayStack<Integer> array = new DropOutArrayStack<Integer>(10);


        System.out.println(array.size());
        array.push(12);
        System.out.println();
        System.out.println(array.peek());
        array.printStackElements();
        array.toString();
    }
}
