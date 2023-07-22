package pattern.abstractFactory;

import pattern.abstractFactory.familySet.FamilySetFactory;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        FamilySetFactory familySet = new FamilySetFactory();
        Rolls rolls = familySet.getRolls();
        Sushi sushi = familySet.getSushi();
        Sauces sauce = familySet.getSauces();
        rolls.makeRolls();
        sushi.makeSushi();
        sauce.makeSauce();
    }
}
