package csci2011.WhitlowLab4;

public abstract class Smartphone extends AbstractCommunicationDevice {
    private int batteryLevel;

    public Smartphone(String deviceName, int batteryLevel) {
        super(deviceName);
        this.batteryLevel = batteryLevel;
    }

    public void checkBatteryLevel(){
        System.out.println("Battery Level: "+batteryLevel+"%");
    }
   
}
