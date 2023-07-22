package pattern.abstractFactory.philadelphiaSet;

import pattern.abstractFactory.Sushi;

public class SushiSalmon implements Sushi {

    @Override
    public void makeSushi() {
        System.out.println("Sushi with salmon is being prepared ");
    }
}
