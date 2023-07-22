package pattern.abstractFactory.philadelphiaSet;

import pattern.abstractFactory.Sauces;

public class SoySauce implements Sauces {
    @Override
    public void makeSauce() {
        System.out.println("soy sauce is being prepared ");
    }
}
