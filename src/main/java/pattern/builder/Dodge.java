package pattern.builder;

public class Dodge extends CarBuilder {
    @Override
    void BuildName() {
        car.setName("Spirit");
    }

    @Override
    void buildEngine() {
        car.setEngine("V8");
    }

    @Override
    void buildColor() {
        car.setColor(Color.RED);
    }

    @Override
    void buildPrice() {
        car.setPrice(60000);
    }
}
