package pattern.behavior.templateMethod;

public class CherryDonut extends DonutTemplate{
    @Override
    void filling() {
        System.out.println("добавляем вишневую начинку");
    }
}
