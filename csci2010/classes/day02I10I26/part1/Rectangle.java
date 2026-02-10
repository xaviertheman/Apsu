package csci2010.classes.day02I10I26.part1;

public class Rectangle implements mearsurable{
    private double width;
    private double length;

    public Rectangle(double widet, double length) {
        this.width = widet;
        this.length = length;
    }

    public double getPerimiter() {
        return width*2 + length *2;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    

    
}
