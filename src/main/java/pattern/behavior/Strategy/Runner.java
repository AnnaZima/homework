package pattern.behavior.Strategy;

public class Runner {
    public static void main(String[] args) {
        Water water = new Water();
        water.setAggregationState(new Solid());
        water.changeState();

        water.setAggregationState(new Liquid());
        water.changeState();


    }
}
