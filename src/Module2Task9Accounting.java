import java.util.Scanner;

public class Module2Task9Accounting {
    static double basePay = 1.5;
    static int hoursWorked = 10;

    public static void pay() {
        double totalSalary = 0;
        if (hoursWorked > 1) {
            totalSalary = basePay * hoursWorked;
        } else {
            System.out.println("Error!");
        }
        System.out.println("Your total salary is " + totalSalary);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Base Pay:");
        basePay = in.nextDouble();
        System.out.println("Enter Hours Worked:");
        hoursWorked = in.nextInt();
        pay();
    }
}
