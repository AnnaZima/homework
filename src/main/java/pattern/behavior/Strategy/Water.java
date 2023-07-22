package pattern.behavior.Strategy;

public class Water {
    AggregationState aggregationState;

    public void setAggregationState(AggregationState aggregationState) {
        this.aggregationState = aggregationState;
    }

    public void changeState() {
        aggregationState.form();
    }
}
