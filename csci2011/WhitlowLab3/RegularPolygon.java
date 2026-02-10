package csci2011.WhitlowLab3;

public class RegularPolygon extends Polygon{
/**
 *CSCI 2011 Lab 3
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  3
 */
    private double sideLength;

    public RegularPolygon(int numSides, double sideLength){
        super(numSides); 
        setSideLength(sideLength);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
         if(sideLength<= 0){
            throw new ArithmeticException("side length must be greater than 0");
        }else{
            this.sideLength = sideLength;
        }
    }

    public double getPerimeter(){
        return this.sideLength*getNumSides();
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide length is: "+ getSideLength()+"\nPerimeter is: "+ getPerimeter();
    }

}
