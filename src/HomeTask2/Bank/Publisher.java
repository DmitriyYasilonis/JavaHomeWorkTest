package HomeTask2.Bank;

import java.util.ArrayList;



public class Publisher {
    ArrayList<Observer> subscribers = new ArrayList();

    public Publisher() {
    }

    public void subscribe(Observer subscriber) {
        this.subscribers.add(subscriber);
    }

    public void notifySubscriber(String message) {
        this.subscribers.forEach((i) -> {
            i.update(message);
        });
    }
}