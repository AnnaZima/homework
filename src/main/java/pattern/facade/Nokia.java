package pattern.facade;

public class Nokia implements Phone{
    @Override
    public String call() {
        return "Nokia совершает вызов";
    }
}
