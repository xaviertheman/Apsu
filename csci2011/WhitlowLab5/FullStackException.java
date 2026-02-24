package csci2011.WhitlowLab5;

public class FullStackException extends Exception {

    
/**
 *CSCI 2011 Lab 5
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  5
 */

    public FullStackException() {
        System.out.println("Cant add to full stack");
    }

    public FullStackException(String message) {
        super(message);
    }
    
}
