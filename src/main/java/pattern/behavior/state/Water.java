package pattern.behavior.state;

public class Water {
    AggregationState aggregationState;

    public void setAggregationState(AggregationState aggregationState) {
        this.aggregationState = aggregationState;
    }

    public void changeState() {
        if(aggregationState instanceof Liquid) {
            setAggregationState(new Solid());
        } else if(aggregationState instanceof Solid) {
            setAggregationState(new Gaseous());
        } else if(aggregationState instanceof Gaseous) {
            setAggregationState(new Liquid());
        }
    }

    public void form() {
        aggregationState.form();
    }
}
