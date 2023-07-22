package pattern.abstractFactory.familySet;

import pattern.abstractFactory.Sauces;

public class SpicySauce  implements Sauces {
    @Override
    public void makeSauce() {
        System.out.println("SpicySauce is being prepared ");
    }
}
