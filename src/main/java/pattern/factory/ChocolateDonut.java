package pattern.factory;

public class ChocolateDonut extends DoughnutImpl {
    int cookingTime = 10;
    String name = "ChocolateDonut";

    public ChocolateDonut () {
        super.cookingTime = this.cookingTime;
        if(isDone()) {
            System.out.println(name + " Done!");
        }
    }

}
