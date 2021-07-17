package ObserverDemo;

public interface StockPublisher {
    void addObserver(StockObserver obs);

    void removeObserver(StockObserver obs);

    void notifyObservers();
}
