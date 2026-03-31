package csci2010.assignment4;

public class NoSuchPlayerException extends Exception{

    public NoSuchPlayerException() {
        System.out.println("No Such Player");
    }

    public NoSuchPlayerException(String message) {
        super(message);
    }
    
}
