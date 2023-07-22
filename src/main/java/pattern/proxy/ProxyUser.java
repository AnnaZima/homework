package pattern.proxy;

public class ProxyUser implements User {
    private int id;
    private RealUser realUser;

    public ProxyUser(int id) {
        this.id = id;
    }

    @Override
    public void action() {
        if (realUser == null) {
            realUser = new RealUser(id);
        }
        realUser.action();
    }

}
