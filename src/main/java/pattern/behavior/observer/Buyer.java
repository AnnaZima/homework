package pattern.behavior.observer;

import java.util.List;

public class Buyer implements Observer{
    String name;

    public Buyer(String name) {
        this.name = name;
    }


    @Override
    public void handleEvent(List<String> sale) {
        System.out.println("Дорогой покупатель, " + name +", " + "у нас появились" +
                " новые скиндки на полезные товары " + sale);

    }
}
