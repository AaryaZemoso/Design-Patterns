package ObserverDemo;

public class StockBroker implements StockObserver {

    static int COUNT = 1;
    int id;

    StockBroker() {
        id = COUNT;
        COUNT++;
    }

    public void update(int value) {
        System.out.println("Notified ITC Observer : " + id);
        System.out.println("Current value changed to : " + value);
    }
}
