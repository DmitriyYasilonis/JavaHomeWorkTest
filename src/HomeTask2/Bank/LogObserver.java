package HomeTask2.Bank;

public class LogObserver implements Observer {
    public LogObserver() {
    }

    public void update(String message) {
        System.out.println("[INFO] => " + message);
    }
}