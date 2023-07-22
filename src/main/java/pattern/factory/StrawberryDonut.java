package pattern.factory;

public class StrawberryDonut extends DoughnutImpl {
    String name = "StrawberryDonut";
    int cookingTime = 8;
    public StrawberryDonut () {
        super.cookingTime = this.cookingTime;
        if(isDone()) {
            System.out.println(name + " Done!");
        }
    }
}
