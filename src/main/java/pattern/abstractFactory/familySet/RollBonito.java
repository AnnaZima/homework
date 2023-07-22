package pattern.abstractFactory.familySet;

import pattern.abstractFactory.Rolls;

public class RollBonito implements Rolls {
    @Override
    public void makeRolls() {
        System.out.println("Bonito is being prepared ");
    }
}
