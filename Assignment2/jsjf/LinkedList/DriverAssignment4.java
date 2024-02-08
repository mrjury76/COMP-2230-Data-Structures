package jsjf.LinkedList;

public class DriverAssignment4 {

    public static void main (String[] args) {

        OrderedLinkedList<Integer> linkedlist = new OrderedLinkedList<Integer>();

        System.out.println("Is empty?: " + linkedlist.isEmpty());
        for(int i = 3; i >= 0; i--) 
            linkedlist.add(i);

        for (int i = 0; i < 3; i++)
            linkedlist.add(i+20);

        System.out.println(linkedlist.toString());
        System.out.println("Removing last node: " + linkedlist.removeLast());
        System.out.println("Removing first node: " + linkedlist.removeFirst());
        System.out.println();

        System.out.println("Does the linked list contain 20?: " + linkedlist.contains(20));
        System.out.println("Does the linked list contain 3?: " + linkedlist.contains(22));
        System.out.println(linkedlist.toString());
        System.out.println("Removing element: " + linkedlist.remove(20));
        System.out.println();

        System.out.println(linkedlist.toString());
        System.out.println("Is empty?: " + linkedlist.isEmpty());
        System.out.println("Size: " + linkedlist.size());
        System.out.println("first item in list: " + linkedlist.first() + ". last item in list: " + linkedlist.last());
        System.out.printf("Printing the count variable: %d \tAnd the modCount variable: %d", linkedlist.count, linkedlist.modCount);
        
    }
    
}
