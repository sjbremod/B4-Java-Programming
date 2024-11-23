package day10_if_statements;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please enter the product name: ");
        String product = key.nextLine();
        System.out.print("Please enter the price: $");
        double price = key.nextDouble();
        System.out.print("please enter the quantity: ");
        int num = key.nextInt();
        key.nextLine();
        System.out.print("please, enter your full name: ");
        String fullName = key.nextLine();
        String orderDetail = fullName+ "your order for " + num +" " + product + " has been placed. your total is $" + (price * num);
        System.out.println(orderDetail);






    }
}
