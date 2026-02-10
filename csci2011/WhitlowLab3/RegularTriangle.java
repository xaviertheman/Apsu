package csci2011.WhitlowLab3;

public class RegularTriangle extends RegularPolygon {
/**
 *CSCI 2011 Lab 3
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  3
 */
    private double height;

    public RegularTriangle(double sideLength) {
        super(3, sideLength);
    }

    @Override
    public void setSideLength(double sideLength) {
        super.setSideLength(sideLength);
        this.height = ((sideLength*Math.sqrt(3))/2);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
         if(height<= 0){
            throw new ArithmeticException("hieght must be greater than 0");
        }else{
            this.height = height;
            this.setSideLength((2*height)/Math.sqrt(3));;
        }
    }

    public double getArea(){
        return ((Math.sqrt(3)/4)*(getSideLength()*getSideLength()));
    }
    
    @Override
    public String toString() {
        return super.toString()+"\n the height is: "+ this.height+ "\n the area is: "+ getArea();
    }
}
