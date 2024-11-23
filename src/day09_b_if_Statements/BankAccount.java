package day09_b_if_Statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double balance;
        double withdraw;

        System.out.println("what is your balance: $");
        balance = key.nextDouble();
        System.out.println("\tyour balance is: $" + balance);

        System.out.println("How much do you want to withdraw? $");
        withdraw = key.nextDouble();
        System.out.println("you are requesting to withdraw $" + withdraw);
        balance -= withdraw;

        System.out.println("your balance is: $" + balance);

        // i still want to withdraw again ---- 200
        /* if withdraw amount < balance
        - not enough money
            else ( equal or more)
                -update balance


*/
        System.out.println("How much do you want to withdraw? $");
        withdraw = key.nextDouble();

        if (withdraw > balance) {
            System.out.println("not enough money");
        } else {
            balance -= withdraw;
            System.out.println("your new balance is $ " + balance);
        }
    }
}
