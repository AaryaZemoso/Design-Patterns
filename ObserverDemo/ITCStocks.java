package ObserverDemo;

import java.util.ArrayList;
import java.util.List;

public class ITCStocks implements StockPublisher {
    List<StockObserver> subscribers;
    int currentValue;

    ITCStocks() {
        currentValue = 40;
        subscribers = new ArrayList<>();
    }

    public void addObserver(StockObserver obs) {
        subscribers.add(obs);
    }

    public void removeObserver(StockObserver obs) {
        subscribers.remove(obs);
    }

    public void stockUpdate(int value) {
        this.currentValue = value;
        notifyObservers();
    }

    public void notifyObservers() {
        for (StockObserver obs : subscribers)
            obs.update(currentValue);
    }
}
