package csci2011.WhitlowLab5;

public class NumberStack {


/**
 *CSCI 2011 Lab 5
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  5
 */

    private double[] stack;
    private int numItems;

    public NumberStack(int Capacity) {
        this.stack = new double[Capacity];
        this.numItems = 0;
    }

    public String toString() {
        if (numItems == 0) {
            return "empty sack";
        }
        String message = "the Numberstack is: ";
        for (double d : stack) {
            message += d+"  ";
        }return message;

    }
  
    public boolean isEmpty(){
        if (numItems ==0) {
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if (numItems==stack.length){
            return true;
        }
        return false;
    }

    public void push(double number)throws FullStackException{
        if (isFull()){
            throw new FullStackException();
        }
        stack[numItems]= number;
        numItems++;
    }

    public double pop()throws EmptyStackException{
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        numItems--;
        return stack[numItems+1];
    }
    
}
