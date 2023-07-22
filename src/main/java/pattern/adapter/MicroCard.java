package pattern.adapter;

public class MicroCard {
    public static void main(String[] args) {
        USB usb = new CardReader();
        usb.USBconnection();
    }


}
