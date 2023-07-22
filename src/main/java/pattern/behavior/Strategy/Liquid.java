package pattern.behavior.Strategy;

public class Liquid implements AggregationState{
    @Override
    public void form() {
        System.out.println("жидкое состояние");
    }
}
