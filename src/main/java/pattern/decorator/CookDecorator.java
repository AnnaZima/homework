package pattern.decorator;

public class CookDecorator implements Cooker{
    Cooker cooker;

    public CookDecorator(Cooker cooker) {
        this.cooker = cooker;
    }
    @Override
    public String cook() {
        return cooker.cook();
    }
}
