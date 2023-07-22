package pattern.abstractFactory.familySet;

import pattern.abstractFactory.Sushi;

public class SushiFireTuna implements Sushi {
    @Override
    public void makeSushi() {
        System.out.println("SushiFireTuna is being prepared ");
    }
}
