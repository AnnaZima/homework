package pattern.proxy;

public class RealUser implements User {
    private int id;

    public RealUser(int id) {
        this.id = id;
    }

    @Override
    public void action() {
        System.out.println(id + "совершает действие");
    }
}
