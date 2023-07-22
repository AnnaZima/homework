package pattern.behavior.mediator;

public class Runner {
    public static void main(String[] args) {
        Psychologist psychologist = new Psychologist();
        Parent parent = new Parent("Много двоек", psychologist);
        Child child = new Child("не хочу учиться", psychologist);
        psychologist.setChild(child);
        psychologist.setParent(parent);

        psychologist.send(parent);
        psychologist.send(child);

        System.out.println(child.getUnderstand());
        System.out.println(parent.getUnderstand());


    }
}
