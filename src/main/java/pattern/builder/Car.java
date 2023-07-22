package pattern.builder;

public class Car {
    String name;
    String engine;
    Color color;
    int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
