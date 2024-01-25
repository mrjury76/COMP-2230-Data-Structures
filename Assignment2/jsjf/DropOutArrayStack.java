package jsjf;

public class DropOutArrayStack<T> extends ArrayStack<T> {

    public DropOutArrayStack() {
        super(); // Calls the parent class's constructor
    }

    public DropOutArrayStack(int initialCapacity) {
        super(initialCapacity); // Calls the parent class's constructor with an initial capacity
    }

    @Override
    public void push(T element) {
        if (size() == stack.length) 
            top = top % stack.length; 

        stack[top] = element;
        top++;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        // Include additional debugging information
        output.append("Stack size = ").append(size()).append(": ");

        // Traverse the stack to print elements
        for (int i = 0; i < size(); i++) {
            if (i > 0) {
                output.append(", ");
            }
            output.append(stack[(top - size() + i + stack.length) % stack.length]);
        }

        return output.toString();
    }

}
