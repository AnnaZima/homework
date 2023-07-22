package pattern.decorator;

public class Fryer extends CookDecorator{
    public Fryer(Cooker cooker) {
        super(cooker);
    }

    public String fry () {
        return " жарит ";
    }

    @Override
    public String cook() {
        return super.cook() + fry();
    }
}
