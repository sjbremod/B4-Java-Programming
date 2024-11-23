package day08_scanner_logical_operators;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("enter three numbers: ");
        int num1 = key.nextInt() ;
        int num2 = key.nextInt();
        int num3 = key.nextInt();

        int total = num1+num2+num3;
        System.out.println("total: " + total);
        int afterDivBy2 = total / 2;
        System.out.println("after div by 2: "+ afterDivBy2);
        System.out.println("after added 2: "+ (afterDivBy2 + 2));



        System.out.println("after added 2: "+ afterDivBy2 % 2);


    }
}
