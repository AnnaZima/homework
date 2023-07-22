package pattern.factory;

public class StrawberryDonutFactory implements DoughnutFactory{
    @Override
    public Doughnut cookDonut() {
        System.out.println("Strawberry donut is being prepared at the moment.");
        return new StrawberryDonut();
    }
}
