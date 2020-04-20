package OOPHomeTask2.Bank;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        try {
            System.out.println("Debit Account Info");
            DebitAccount debitCard = new DebitAccount();
            debitCard.setBalance(1000.0);
            debitCard.publisher.subscribe(new LogObserver());
            debitCard.withdrawMoney(1010.0);
            debitCard.addMoney(10.0);
            System.out.println("Credit Account Info");
            CreditAccount creditCard = new CreditAccount();
            creditCard.setBalance(1000.0);
            creditCard.publisher.subscribe(new LogObserver());
            creditCard.withdrawMoney(1100.0);
            creditCard.addMoney(50.0);
        } catch (RuntimeException var3) {
            System.out.println(var3.getMessage());
        }

    }
}