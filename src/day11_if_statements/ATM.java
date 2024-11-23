package day11_if_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int expPin = 2222;
        double balance = 100_000.00;


        System.out.print("welconme to atm\n\tplease, inser your card.\n\tthen, please enter your pincode: ");
        int actualPin = key.nextInt();

        if(actualPin == expPin ){
            System.out.println("\n\tyou are logged in");
            System.out.println("\tselect one of the options below: ");
            System.out.println("\t\t1) - check balance: ");
            System.out.println("\t\t2) - deposit: ");
            System.out.println("\t\t3) - withdraw: ");
            System.out.println("\t\t4) - cancel: ");
            System.out.println("\t\t - your choice: (1-4) ");
           int userChoice =  key.nextInt(); // 1,2,3,4, or any other numbers
            if(userChoice ==1){
                System.out.println("your balance is $" + balance);
            } else if (userChoice == 2) {
                System.out.println("please insert the cash");
//                double depMon = key.nextDouble();
//                balance += depMon; //
                balance += key.nextDouble(); // goes back to balance
                System.out.println("after deposit your new balance is $" +balance);

            }else if (userChoice ==3){
                System.out.println("please enter the amount you want to withdraw");
                double withMon = key.nextDouble();


                //if withMon > balance
                if (withMon >balance){
                    System.out.println("not enough money . work more and come back");
                }else{
                    balance -= withMon;
                    System.out.println("after withdraw new balance: $" + balance);
                }

            }else if ( userChoice ==4){
                System.out.println();

            }else{
                System.out.println("\n\t\tinvalid option exiting system by logging you out");
            }
        }else{
            System.out.println("\n\tinvalid pincode go home and try to remember your pincode");
        }
    }
}
