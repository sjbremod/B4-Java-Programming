package day10_if_statements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("please enter 3 numbers: ");
        int num1 = key.nextInt();
        int num2 = key.nextInt();
        int num3 = key.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is biggest.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is biggest.");
        } else if (num3 > num1 & num3 > num2) {
            System.out.println(num3 + " is biggest");
        } else {
            System.out.println("All same");
        }





    }
}
