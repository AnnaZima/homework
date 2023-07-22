package pattern.behavior.observer;

public class App {
    public static void main(String[] args) {
        MarketPlace marketPlace = new MarketPlace();
        marketPlace.addSale("пылесос самсунг 50%");
        marketPlace.addSale("подгузники ");

        Observer firstBuyer = new Buyer("Иван Иванов");
        Observer secondBuyer = new Buyer("Петр Петров");
        marketPlace.addObserver(firstBuyer);
        marketPlace.addObserver(secondBuyer);

        marketPlace.addSale("велосипеды ");
    }
}
