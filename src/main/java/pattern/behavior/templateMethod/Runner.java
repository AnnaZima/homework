package pattern.behavior.templateMethod;

public class Runner {
    public static void main(String[] args) {
        DonutTemplate donut = new CherryDonut();
        DonutTemplate donutChok = new ChocolateDonut();

        donut.cooking();
        donutChok.cooking();
    }
}
