package HomeTask2.Bank;

import HomeTask2.Bank.BankAccount;

public class BankTestApplication {
    public static void main(String[] args){
        BankAccount cust1 = new BankAccount();
        cust1.deposit(500);

        BankAccount cust2 = new BankAccount();
        cust2.deposit(1000);
        cust2.withdrawDebit(400);

        BankAccount cust3 = new BankAccount();
        cust3.deposit(100);
        cust3.withdrawCredit(400);

        System.out.print("cust1 has a balance of ");
        System.out.println(cust1.getBalance());


        System.out.print("Cust2 has a balance of ");
        System.out.println(cust2.getBalance());

        System.out.print("Cust3 has a balance of ");
        System.out.println(cust3.getBalance());
    }
}
