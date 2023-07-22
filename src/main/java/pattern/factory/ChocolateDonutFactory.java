package pattern.factory;

public class ChocolateDonutFactory implements DoughnutFactory{
    @Override
    public Doughnut cookDonut() {
        System.out.println("Cherry donut is being prepared at the moment ");
        return new ChocolateDonut();
    }
}
