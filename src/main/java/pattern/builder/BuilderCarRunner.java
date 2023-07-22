package pattern.builder;

public class BuilderCarRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new Dodge());

        Car car = director.buildCar();

        System.out.println(car);
    }

}
