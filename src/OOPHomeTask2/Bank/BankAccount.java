package OOPHomeTask2.Bank;

public abstract class BankAccount {
    double negativeFee = 0.05;
    double positiveFee = 0.01;

    public BankAccount() {
    }

    public abstract double addMoney(double var1);

    public abstract double withdrawMoney(double var1);
}