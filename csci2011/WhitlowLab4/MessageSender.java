package csci2011.WhitlowLab4;

public interface MessageSender {
    public void sendMessage(String recipent, String message);
    public void recieveMessage(String sender, String message);
}
