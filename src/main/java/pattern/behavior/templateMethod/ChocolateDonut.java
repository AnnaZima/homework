package pattern.behavior.templateMethod;

public class ChocolateDonut extends DonutTemplate{
    @Override
    void filling() {
        System.out.println("добавляем шоколадную начинку");
    }
}
