package pattern.bridge;

public class Markers extends Stationery{

    protected Markers(Color color) {
        super(color);
    }

    @Override
    void write() {
        System.out.print("Фломастер рисует");
        color.coloring();
    }
}
