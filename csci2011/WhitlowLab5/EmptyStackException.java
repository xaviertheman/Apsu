package csci2011.WhitlowLab5;

public class EmptyStackException extends Exception {

/**
 *CSCI 2011 Lab 5
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  5
 */

    public EmptyStackException() {
        System.out.println("stack is empty");
    }

    public EmptyStackException(String message) {
        super(message);
    }
 
}
