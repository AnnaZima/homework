package pattern.behavior.Strategy;

public class Gas implements AggregationState{
    @Override
    public void form() {
        System.out.println("газообразное состояние");
    }
}
