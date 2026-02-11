package day02I10I26.part1;

public class Circle implements mearsurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

  
    public double getPerimiter() {
        return 2 *Math.PI *radius;
    }

    public double getArea() {
        return Math.sqrt( 2 *Math.PI *radius);
    }

    
}
