package pattern.abstractFactory.philadelphiaSet;

import pattern.abstractFactory.Rolls;
import pattern.abstractFactory.Sauces;
import pattern.abstractFactory.SetFactory;
import pattern.abstractFactory.Sushi;

public class PhiladelphiaSetFactory implements SetFactory {
    @Override
    public Rolls getRolls() {
        return new RollPhiladelphiaClassic();
    }

    @Override
    public Sushi getSushi() {
        return new SushiSalmon();
    }

    @Override
    public Sauces getSauces() {
        return new SoySauce();
    }
}
