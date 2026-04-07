package csci2011.WhitlowLab10;

public class Employee {
    private int id;
    private String name;
    private  String postion;
    private double salary;

    public Employee(int id, String name, String postion, double salary) {
        this.id = id;
        this.name = name;
        this.postion = postion;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPostion() {
        return postion;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name+ " ID: "+id+" positiion: "+postion+" Salary: "+salary;
    }
}
