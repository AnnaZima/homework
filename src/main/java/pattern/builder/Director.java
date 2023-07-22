package pattern.builder;

public class Director {
    CarBuilder builder;

    public void setBuilder (CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar () {
        builder.createCar();
        builder.BuildName();
        builder.buildEngine();
        builder.buildColor();
        builder.buildPrice();


        Car car = builder.getCar();

        return car;
    }
}
