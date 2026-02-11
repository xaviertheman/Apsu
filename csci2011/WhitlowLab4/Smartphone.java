package csci2011.WhitlowLab4;

public class Smartphone extends AbstractComDevice {
    private int batteryLevel;

    public Smartphone(String deviceName, int batteryLevel) {
        super(deviceName);
        this.batteryLevel = batteryLevel;
    }

    public void checkBatteryLevel(){
        System.out.println("Battery Level: "+batteryLevel+"%");
    }
   
}
