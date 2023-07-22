package pattern.factory;

public class CherryDonut extends DoughnutImpl {
    String name = "CherryDonut";
    int cookingTime = 14;
    public CherryDonut() {
        super.cookingTime = this.cookingTime;
        if(isDone()) {
            System.out.println(name + " Done!");
        }
    }
}
