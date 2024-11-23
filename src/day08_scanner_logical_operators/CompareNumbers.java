package day08_scanner_logical_operators;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        //scanner reference=   create scanner object
        //following line get the info from user/consold
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter 2 numbers: ");
        System.out.print("\tNumber 1: ");
        int num1 = keyboard.nextInt();

        //System.out.println(num1);
        System.out.print("\t Number 2: ");
        int num2 = keyboard.nextInt();
        boolean areNumsEqual = num1 == num2;
        System.out.println("\n\tis " +num1 + " equal to " + num2 + ": " + areNumsEqual);

    }
}
