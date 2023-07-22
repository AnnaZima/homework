package pattern.builder;

public abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void BuildName();
    abstract void buildEngine();
    abstract void buildColor();
    abstract void buildPrice();

    Car getCar() {
        return car;
    }

}
