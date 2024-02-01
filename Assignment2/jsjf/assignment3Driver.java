package jsjf;

public class assignment3Driver {

    public static void main(String[] args) {

        // Create a linked stack
        LinkedDropOutStack<Integer> linkedStack = new LinkedDropOutStack<Integer>(10);

        //checking the is empty method
        System.out.println("Empty: " + linkedStack.isEmpty());

        //pushes the limit amount of elements onto the stack
        for(int i = 0; i < linkedStack.limit; i++) {
            linkedStack.push(i);
        }
        
        //pushes 2 more elements onto the stack to check the circular reference
        linkedStack.push(21);
        linkedStack.push(22);
        linkedStack.push(23);
        linkedStack.push(24);
        linkedStack.push(25);
        linkedStack.push(26);

        // Print size
        System.out.println("Size: " + linkedStack.size());

        // Print contents
        System.out.println("Contents: " + linkedStack);

        // Remove and print top element
//           int top = linkedStack.pop();
//           System.out.println("Removed " + top);

        // Check if empty
        System.out.println(linkedStack.isEmpty() ? "Empty" : "Not empty");
    
    }
}

