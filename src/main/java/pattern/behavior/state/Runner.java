package pattern.behavior.state;

public class Runner {
    public static void main(String[] args) {
        AggregationState agr  = new Solid();
        Water water = new Water();

        water.setAggregationState(agr);

        for (int i = 0; i <10; i++) {
            water.form();
            water.changeState();
        }


    }
}
