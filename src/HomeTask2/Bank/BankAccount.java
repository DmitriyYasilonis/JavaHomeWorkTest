package HomeTask2.Bank;

public class BankAccount  {

    public double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdrawDebit(double amount){
        if(amount<=balance) {
            balance = balance - amount - (0.01*amount);
        }
        else {
            System.err.println("Transaction cancelled due to insufficient funds");
        }
    }

    public void withdrawCredit(double amount){
        if(amount<=balance) {
            balance = balance - amount - (0.01*amount);
        }
        else {
            balance = balance - amount - (0.05*amount);        }
    }

    public double getBalance(){
        return balance;
    }
}
