package pattern.behavior.state;

public class Solid implements AggregationState{
    @Override
    public void form() {
        System.out.println("Вода превращается в лед");
    }
}
