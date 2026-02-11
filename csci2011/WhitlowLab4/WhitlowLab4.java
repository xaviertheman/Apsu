package csci2011.WhitlowLab4;

public class WhitlowLab4 {
    public static void main(String[] args) {
        AndriodPhone phone = new AndriodPhone("Samsung Galaxy", 69);
        phone.sendMessage("Alice", "Lunch today at 12");
        phone.recieveMessage("Bob", "What time is the meeting today");
        phone.sendMessage("Bob", "Meeting at 2:30");
        phone.checkBatteryLevel();
    }
}
