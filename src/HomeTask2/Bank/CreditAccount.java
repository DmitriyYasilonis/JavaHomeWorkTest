package HomeTask2.Bank;

public class CreditAccount extends BankAccount {
    double balance;
    public Publisher publisher = new Publisher();

    public CreditAccount() {
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double addMoney(double amount) throws RuntimeException {
        this.balance += amount;
        if (amount < 0.0) {
            throw new RuntimeException("Not valid amount");
        } else {
            this.publisher.notifySubscriber("You added money on Credit account! Amount: $" + amount + " Current Balance: $" + this.balance);
            return this.balance;
        }
    }

    public double withdrawMoney(double amount) {
        if (this.balance >= amount) {
            this.balance = this.balance - amount - amount * this.positiveFee;
            this.publisher.notifySubscriber(" Withdraw amount: $" + amount + " Current Balance: $" + this.balance);
        } else {
            this.balance = this.balance - amount - amount * this.negativeFee;
            this.publisher.notifySubscriber(" Withdraw amount: $" + amount + " Current Balance: $" + this.balance);
        }

        return this.balance;
    }
}