package jsjf.LinkedList;

public class DriverAssignment4 {

    public static void main (String[] args) {

        OrderedLinkedList<Integer> linkedlist = new OrderedLinkedList<Integer>();

        for(int i = 0; i < 3; i++) {
            linkedlist.add(10);
            System.out.println(linkedlist.toString());

        }
        linkedlist.add(10);
        linkedlist.add(10);
        System.out.println(linkedlist.size());
        System.out.println();
        System.out.println(linkedlist.iterator());
        System.out.println(linkedlist.isEmpty());
    }
    
}
