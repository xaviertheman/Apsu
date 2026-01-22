package csci2011.Class0122;

import java.time.Year;

public class Vehicle {
    private Type type;
    private String make;
    private String model;
    private int year;
    private String color;
    private double Purchase_Price;

    public Vehicle(Type type, String make, String model, int year, String color) {
        this(type, make, model, year, color, 0);
    }

    public Vehicle(Type type, String make, String model, int year, String color, double purchase_Price) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.Purchase_Price = purchase_Price;
    }

    @Override
    public String toString() {
        return "Vehicle [type=" + type + ", make=" + make + ", model=" + model + ", year=" + year + ", color=" + color
                + ", Purchase_Price=" + Purchase_Price + "]";
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public int getAge(){
       return Year.now().getValue() - getYear();
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPurchase_Price() {
        return Purchase_Price;
    }

    public void setPurchase_Price(double purchase_Price) {
        Purchase_Price = purchase_Price;
    }

    
    
}
