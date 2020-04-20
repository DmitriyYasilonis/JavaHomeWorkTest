package OOPHomeTask2.Bank;

public class DebitAccount extends BankAccount {
    double balance;
    public Publisher publisher = new Publisher();

    public DebitAccount() {
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double addMoney(double amount) throws RuntimeException {
        this.balance += amount;
        if (amount < 0.0) {
            throw new RuntimeException("Not valid amount");
        } else {
            this.publisher.notifySubscriber("You added money on Debit account! Amount: $" + amount + " Current Balance: $" + this.balance);
            return this.balance;
        }
    }

    public double withdrawMoney(double amount) {
        if (this.balance >= amount) {
            this.balance = this.balance - amount - amount * this.positiveFee;
            this.publisher.notifySubscriber(" Withdraw amount: $" + amount + " Current Balance: $" + this.balance);
        } else {
            this.publisher.notifySubscriber("Unable to withdraw $" + amount + " due to insufficient funds");
        }

        return this.balance;
    }
}