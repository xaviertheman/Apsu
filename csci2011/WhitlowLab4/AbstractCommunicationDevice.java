package csci2011.WhitlowLab4;

public abstract class AbstractCommunicationDevice implements MessageSender {
/**
 *CSCI 2011 Lab 4
 * @ xavier whitlow
 * Course: CSCI 2011 – Lab  4
 */
    private String deviceName;

    public AbstractCommunicationDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * sends message
     */
    public void sendMessage(String recipent, String message) {
        System.out.println(deviceName+" is sending a message to "+recipent+": "+message);
    }

    /**
     * recieves a message
     */
    public void recieveMessage(String sender, String message) {
       System.out.println(deviceName+" received a message from "+ sender+": "+ message);
    }

    
}
