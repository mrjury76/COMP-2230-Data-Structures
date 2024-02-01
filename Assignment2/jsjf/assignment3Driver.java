package jsjf;

public class assignment3Driver {

    public static void main(String[] args) {

        // Creating the linked lists
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        LinkedDropOutStack<Integer> dropOutStack = new LinkedDropOutStack<>(10);

        //checking the is empty method before adding any elements
        System.out.println("Linked Stack isEmpty: " + linkedStack.isEmpty());
        System.out.println("Drop Out Stack isEmpty: " + dropOutStack.isEmpty() + "\n");

        //testing linked stack methods and output
        linkedStack.push(42);
        System.out.println("Linked Stack Peek: " + linkedStack.peek() + " / Linked Stack isEmpty with pushed node: " + linkedStack.isEmpty());
        linkedStack.push(42 + 32);
        System.out.println("Linked Stack: " + linkedStack.toString() + " / Size: " + linkedStack.size() + " / Pop: " + linkedStack.pop() + " / Stack after: " + linkedStack.toString() + "\n");

        //pushes the input amount of elements onto the stack
        for(int i = 0; i < dropOutStack.limit; i++) {
            dropOutStack.push(i);
        }
        //pushing the double digit elements onto the stack to see the old elements drop out
        for(int i = 0; i < dropOutStack.limit; i++) {
            dropOutStack.push(i + 10);
        }

        // Remove and print top element
        dropOutStack.push(42);
        System.out.println("Drop out Stack Peek: " + dropOutStack.peek() + " / Drop out Stack isEmpty with pushed node: " + dropOutStack.isEmpty());
        System.out.println("Drop out Stack: " + dropOutStack.toString() + " / Size: " + dropOutStack.size() + " / Pop: " + dropOutStack.pop() + " / Stack after: " + dropOutStack.toString());
    }
}

