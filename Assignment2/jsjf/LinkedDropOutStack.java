package jsjf;

public class LinkedDropOutStack<T> extends LinkedStack<T> {

    int limit = 0;
    LinearNode<T> bottom;  //node that points to the bottom of the stack


    public LinkedDropOutStack(int input) {
        super();
        this.limit = input;
    }

    @Override
    public void push(T element) {
        LinearNode<T> newNode = new LinearNode<T>(element);
        
        //if else block to check for the first push when the stack is empty, else push like normal
        if(isEmpty()) {
            top = bottom = newNode; // For the first element, top and bottom are the same
        } else {
            newNode.setNext(top); // Link new node to the previous top
            top = newNode; // Update top to the new node
        }
        
        // If the stack is full, remove the bottom element
        if(size() >= limit) {   //checks is the size has reached the limit
          removeBottom();
        } else {
          super.count++; // Increase super.count if not removing the bottom element
        }
    }


    public void removeBottom() {
      if (!isEmpty()) {
          System.out.println("\tENTERING the size >= limit if statement");
  
          LinearNode<T> temp = bottom.getNext(); // Gets the "next" node of bottom
          bottom = null; // Remove reference to the current bottom
          bottom = temp; // Reassign the next node as the new bottom
  
          super.count--; // Decrement the count of elements
      }
  }
  
}
