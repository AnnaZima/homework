package pattern.decorator;

public class Multicooker implements Cooker{
    @Override
    public String cook() {
        return "Мультиварка варит";
    }
}
