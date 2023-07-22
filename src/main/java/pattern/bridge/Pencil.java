package pattern.bridge;

public class Pencil extends Stationery{
    protected Pencil(Color color) {
        super(color);
    }

    @Override
    void write() {
        System.out.print("Карандаш рисует");
        color.coloring();

    }
}
