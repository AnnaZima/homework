package pattern.decorator;

public class Task {
    public static void main(String[] args) {
        Cooker cooker = new Fryer(new Multicooker());
        System.out.println(cooker.cook());
    }
}
