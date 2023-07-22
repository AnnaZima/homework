package pattern.builder;

public class BMW extends CarBuilder{
    @Override
    void BuildName() {
        car.setName("BMW E31");
    }

    @Override
    void buildEngine() {
        car.setEngine("V12");

    }

    @Override
    void buildColor() {
        car.setColor(Color.BLACK);

    }

    @Override
    void buildPrice() {
        car.setPrice(70000);

    }
}
