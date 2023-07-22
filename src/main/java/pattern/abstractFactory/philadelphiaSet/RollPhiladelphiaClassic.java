package pattern.abstractFactory.philadelphiaSet;

import pattern.abstractFactory.Rolls;

public class RollPhiladelphiaClassic implements Rolls {
    @Override
    public void makeRolls() {
        System.out.println("PhiladelphiaClassic is being prepared ");
    }
}
