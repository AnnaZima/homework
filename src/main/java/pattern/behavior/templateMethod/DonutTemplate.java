package pattern.behavior.templateMethod;

public abstract class DonutTemplate {
    abstract void filling();
    public void cooking() {
        System.out.println("замешиваем тесто");
        System.out.println("обжариваем во фритюре");
        filling();
        System.out.println("подаем к столу");
    }
}
