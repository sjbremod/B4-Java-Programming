package day09_b_if_Statements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int num = input.nextInt();
        //System.out.println("\n" + num);
        boolean isEven = num % 2 == 0;
        // boolean isOdd = num % 2 != 0;

        //System.out.println(num + "is even: " +isEven);
        //System.out.println(num + "is odd?: " +isOdd);

        if (isEven) {
            System.out.println(num + " is even");
        }
        if(!isEven){
            System.out.println(num + " is odd");
        }
    }
}
