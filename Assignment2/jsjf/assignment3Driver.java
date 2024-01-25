package jsjf;

public class assignment3Driver {

    public static void main(String[] args) {

        // Create a linked stack
        LinkedDropOutStack<Integer> linkedStack = new LinkedDropOutStack<Integer>();

        // Add elements
        for(int i = 0; i < linkedStack.limit; i++) {  //pushes the limit amount of elements onto the stack
            linkedStack.push(i);
        }
        
        linkedStack.push(21);
        linkedStack.push(22);

        // Print size
        System.out.println("Size: " + linkedStack.size());

        // Print contents
        System.out.println("Contents: " + linkedStack);

        // Remove and print top element
        int top = linkedStack.pop();
        System.out.println("Removed " + top);

        // Check if empty
        if(linkedStack.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not empty");
        }

        }
    
    }

