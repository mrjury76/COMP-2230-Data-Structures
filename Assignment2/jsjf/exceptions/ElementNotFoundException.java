package jsjf.exceptions;

public class ElementNotFoundException extends RuntimeException{

    public ElementNotFoundException(String input) {
        super("The " + input + " element was not found.");
    }
}
