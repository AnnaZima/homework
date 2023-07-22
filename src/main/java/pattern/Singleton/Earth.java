package pattern.Singleton;

public class Earth {
    private static Earth earth;

    private Earth() {
    }

    public static Earth getPlanet() {
        if (earth == null) {
            earth = new Earth();
        }
        return earth;
    }

}
