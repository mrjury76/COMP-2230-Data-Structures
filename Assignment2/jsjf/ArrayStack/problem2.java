package jsjf.ArrayStack;

/**
 * This is the program to test problem 2 in assignment 2
 * @author Patrick Thrower
 * @version 1.0
 */

public class problem2 {
    public static void main(String[] args)  {

        DropOutArrayStack<Integer> dropArray = new DropOutArrayStack<Integer>(12);
        
        System.out.println("Is Empty: " + dropArray.isEmpty()); //testing the drop array.
        
        for(int i = 0; i < dropArray.getLength(); i++){ //pushing a .length amount on numbers onto the stack to test is it wraps around.
            dropArray.push(i+1);
        }

        dropArray.push(100);  //pushing the wrapped elements
        dropArray.push(101);
        dropArray.push(102);
        dropArray.push(103);
        System.out.println("Peek: " + dropArray.peek());  //testing the peek method
        System.out.println("Pop: " + dropArray.pop());  //testing the pop method
        dropArray.push(104);
        dropArray.pop();
        // dropArray.pop();
        // dropArray.pop();
        // dropArray.pop();
        System.out.println(dropArray.isEmpty());
        System.out.println(dropArray.toString());   //printing the full stack using toString method
        System.out.println("Size(top): " + dropArray.size());  //printing size using top variable
        System.out.println("Array Length: " + dropArray.getLength());  //printing actual array length
    }
}
