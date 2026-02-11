package csci2011.WhitlowLab4;

public class AbstractCommunicationDevice implements MessageSender {
    private String deviceName;

    public AbstractCommunicationDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public void sendMessage(String recipent, String message) {
        System.out.println(deviceName+" is sending a message to "+recipent+": "+message);
    }

    public void recieveMessage(String sender, String message) {
       System.out.println(deviceName+" received a message from "+ sender+": "+ message);
    }

    
}
