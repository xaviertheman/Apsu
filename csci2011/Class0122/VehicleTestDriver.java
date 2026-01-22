package csci2011.Class0122;

public class VehicleTestDriver {
    public static void main(String[] args) {
        Vehicle mycar= new Vehicle(Type.COUPE, "Ford", "mustang", 2017, "orange", 18000);
        System.out.println(mycar);
        System.out.println(mycar.getAge());
    }
}
