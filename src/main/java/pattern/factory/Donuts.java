package pattern.factory;

public class Donuts {

    public static Doughnut pickFillingStrawberry() {
            return new StrawberryDonutFactory().cookDonut();
        }
    public static Doughnut pickFillingCherry() {
        return new CherryDonutFactory().cookDonut();
    }
    public static Doughnut pickFillingChocolate() {
        return new ChocolateDonutFactory().cookDonut();
    }

}
