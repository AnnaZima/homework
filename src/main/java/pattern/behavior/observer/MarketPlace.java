package pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class MarketPlace implements Observed{
    List<String> sale = new ArrayList<>();
    List<Observer> buyers = new ArrayList<>();

    public void addSale(String sale) {
        this.sale.add(sale);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.buyers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.buyers.remove(observer);

    }

    @Override
    public void notifyObservers() {
       for(Observer observer: buyers) {
           observer.handleEvent(this.sale);
       }
    }
}
