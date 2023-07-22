package pattern.factory;

public class CherryDonutFactory implements DoughnutFactory{
    @Override
    public Doughnut cookDonut() {
        System.out.println("Cherry donut is being prepared at this moment");
        return new CherryDonut();
    }
}
