package pattern.abstractFactory.familySet;

import pattern.abstractFactory.Rolls;
import pattern.abstractFactory.Sauces;
import pattern.abstractFactory.SetFactory;
import pattern.abstractFactory.Sushi;

public class FamilySetFactory implements SetFactory {
    @Override
    public Rolls getRolls() {
        return new RollBonito();
    }

    @Override
    public Sushi getSushi() {
        return new SushiFireTuna();
    }

    @Override
    public Sauces getSauces() {
        return new SpicySauce();
    }
}
