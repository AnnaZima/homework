package pattern.behavior.visitor;

public class Demo {
    public static void main(String[] args) {
        Visitor v = new WorkerOne();
        Element doc = new Document("документ");


    }
}
