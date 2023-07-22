package pattern.adapter;

public class CardReader extends Computer implements USB{

    @Override
    public void USBconnection() {
        USBconnector();
    }




}
