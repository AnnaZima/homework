package pattern.behavior.state;

public class Liquid implements AggregationState{
    @Override
    public void form() {
        System.out.println("Жидкое состояние ");
    }
}
