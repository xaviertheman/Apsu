package csci2011.WhitlowLab3;

public class Polygon {
/**
 *CSCI 2011 Lab 3
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  3
 */
    private int numSides;

    public Polygon(int numSides){
        if(numSides< 3){
            throw new ArithmeticException("num of sides must be > 3");
        }else{
            this.numSides = numSides;
        }
    }

    @Override
    public String toString() {
        return "number of sides is "+numSides;
    }

    public int getNumSides() {
        return numSides;
    }
    
}
