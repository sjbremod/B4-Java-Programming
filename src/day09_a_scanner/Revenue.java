package day09_a_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the price: ");
        double price = input.nextDouble();

      // System.out.println("you entered: $" + price);
        System.out.print("please enter the quantity of the item: ");
        int quantity = input.nextInt();
double revenue = price* quantity;
        System.out.print("The revenue of the sale: $" +revenue);



    }
}
