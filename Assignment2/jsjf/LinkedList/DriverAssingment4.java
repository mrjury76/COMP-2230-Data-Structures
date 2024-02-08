package jsjf.LinkedList;

public class DriverAssingment4 {
    public static void main(String[] args) {
        OrderedLinkedList<Integer> linkedlist = new OrderedLinkedList<>();

        linkedlist.add(1);
        linkedlist.add(1);
        linkedlist.add(1);
        System.out.println(linkedlist.size());
        System.out.println(linkedlist.isEmpty());
        System.out.println(linkedlist.toString());
    }
}
