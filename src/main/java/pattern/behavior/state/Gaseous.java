package pattern.behavior.state;

public class Gaseous implements AggregationState{
    @Override
    public void form() {
        System.out.println("Вода превращается в пар ");
    }
}
