package jsjf;

import jsjf.ArrayStack.StackADT;

public class LinkedDropOutStack<T> extends LinkedStack<T> {

    int limit = 0;


    public LinkedDropOutStack(int input) {
        super();
        int limit = input;
    }

    public void push(T element) {
        if(count >= limit) {
          // remove bottom element if stack is full
          LinearNode<T> bottom = top;
          while(bottom.getNext() != null) {
            bottom = bottom.getNext();
          }
          bottom.setNext(null);
          count--;
        }
        
        // add new element to top
        LinearNode<T> newNode = new LinearNode<>(element);
        newNode.setNext(top);
        top = newNode;
        count++;
      }


}
