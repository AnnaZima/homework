package pattern.prototype;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human("Ivan", 27, Sex.MALE);
        System.out.println(human);
        System.out.println("***********");
        Human humanClone = human.copy();
        System.out.println(humanClone);
        System.out.println("***********");
        Laboratory laboratory = new Laboratory(human);
        Human copy = laboratory.cloneHuman();
        System.out.println(copy);


    }
}
