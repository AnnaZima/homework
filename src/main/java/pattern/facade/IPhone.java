package pattern.facade;

public class IPhone implements Phone {
    @Override
    public String call() {
        return "Iphone совершает вызов";
    }
}
