package jsjf;

public class LinkedDropOutStack<T> extends LinkedStack<T> {

    int limit = 0;
    LinearNode<T> bottom;  //node that points to the bottom of the stack


    public LinkedDropOutStack(int input) {
        super();
        this.limit = input;
    }

    //push method that checks if its empty an
    @Override
    public void push(T element) { 
        LinearNode<T> newNode = new LinearNode<T>(element);
        
        //if else block to check for the first push when the stack is empty, else push like normal
        if(isEmpty()) {
            top = bottom = newNode; // For the first element, top and bottom are the same
        } else {
            newNode.setNext(top); // Link new node to the previous top
            top = newNode; // make the new node the top
        }
        
        // If the stack is full, remove the bottom element
        if(size() >= limit) {
            LinearNode<T> temp = top;
            while(temp.getNext() != bottom) {  //while loop to work its way down to the 2nd most bottom element
                temp = temp.getNext();
            }
            bottom = temp;  //assigns the 2nd most bottom node to be the new bottom and sets this node's next to be null
            bottom.setNext(null);
        } else {
            super.count++;  //only increases the counter if the size is not at the limited size yet.
        }
    }
  
}
