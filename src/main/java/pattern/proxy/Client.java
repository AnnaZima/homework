package pattern.proxy;


public class Client {
    public static void main(String[] args) {
        User user = new ProxyUser(2);
        user.action();
    }
}
