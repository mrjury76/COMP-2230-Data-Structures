package jsjf.ArrayStack;

public class problem1<T> extends ArrayStack<T>
{
    public static void main(String[] args)  {
        ArrayStack<String> arr = new ArrayStack<String>(20);

        //testing push, pop, and peek methods
        arr.push("Hello World");        
        System.out.printf("Peek: %s \nPop: %s\n" , arr.peek(), arr.pop());
//        System.out.println(arr.peek());  //this line will throw the EmptyCollectionException

        //testing isEmpty method
        if (arr.isEmpty())
            System.out.println("The array is empty");

        //adding iterable objects to test size and toString
        for(int i = 0; i < 5; i++)
            arr.push(String.format("%s", i));
        System.out.printf("Size: %s \ntoString: %s", arr.size(), arr.toString());
    
    } 
}
