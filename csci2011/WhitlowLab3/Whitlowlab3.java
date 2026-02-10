package csci2011.WhitlowLab3;

public class Whitlowlab3 {
/**
 *CSCI 2011 Lab 3
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  3
 */
    public static void main(String[] args) {
        Polygon myFirsytPolygon = new Polygon(4);
        System.out.println("Testing Polygon constructor");
        System.out.println(myFirsytPolygon);
        System.out.println();

        RegularPolygon myfirstRegularPolygon = new RegularPolygon(4, 4);
        System.out.println("Testing RegularPolygon constructor");
        System.out.println(myfirstRegularPolygon);
        System.out.println();
        System.out.println("Testing side length mutator");
        myfirstRegularPolygon.setSideLength(7);
        System.out.println(myfirstRegularPolygon);
        System.out.println();

        System.out.println("Testing RegularTriangle constructor");
        RegularTriangle myfirstRegularTriangle = new RegularTriangle(4);
        System.out.println(myfirstRegularTriangle);
        System.out.println();

        System.out.println("Testing height mutator");
        myfirstRegularTriangle.setHeight(3);
        System.out.println(myfirstRegularTriangle);
        System.out.println();

        System.out.println("Testing side length mutator");
        myfirstRegularTriangle.setSideLength(4);
        System.out.println(myfirstRegularTriangle);
    }
}
