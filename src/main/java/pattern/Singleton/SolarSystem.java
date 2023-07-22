package pattern.Singleton;

public class SolarSystem {
    public static void main(String[] args) {
        Earth earth = Earth.getPlanet();
        Earth earth1 = Earth.getPlanet();

        System.out.println(earth1.equals(earth));
    }
}
