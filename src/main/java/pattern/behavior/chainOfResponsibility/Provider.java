package pattern.behavior.chainOfResponsibility;

public class Provider {
    public static void main(String[] args) {
        LaboratorySafety one = new BiosecurityLevelOne(1);
        LaboratorySafety two = new BiosecurityLevelTwo(2);
        LaboratorySafety three = new BiosecurityLevelThree(3);
        LaboratorySafety four = new BiosecurityLevelFour(4);

        one.setNextLevel(two);
        two.setNextLevel(three);
        three.setNextLevel(four);

        one.security("Пекарские дрожжи", 1);
        one.security("Стафилококки", 2);
        one.security("Эбола", 4);
        one.security("Лихорадка Западного Нила", 3);
    }
}
