package pattern.facade;

public class FacadePhone {
    IPhone iPhone = new IPhone();
    Nokia nokia = new Nokia();
    Samsung samsung = new Samsung();

    void toUse() {
        System.out.println(iPhone.call());
        System.out.println(nokia.call());
        System.out.println(samsung.call());

    }


}
