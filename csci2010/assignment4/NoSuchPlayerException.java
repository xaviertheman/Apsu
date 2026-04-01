package csci2010.assignment4;

public class NoSuchPlayerException extends Exception{
 /**
 *CSCI 2010 assignment 4
 * @ xavier whitlow
 * Course: CSCI 1010 – Assignment  4
 */
    public NoSuchPlayerException() {
        System.out.println("No Such Player");
    }

    public NoSuchPlayerException(String message) {
        super(message);
    }
    
}
