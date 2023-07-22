package pattern.facade;

public class Samsung implements Phone{
    @Override
    public String call() {
       return  "Samsung совершает вызов";
    }
}
