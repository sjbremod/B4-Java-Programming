package day18_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String userItem = "";
        String shoppingList = "your shopping list items: ";
        String userAnswer= "";

        do {
            System.out.print("Please enter the name of the item: ");
            //String item = key.nextLine(); // Banana
            shoppingList =shoppingList + "\n\t" + key.nextLine(); //Banana

            System.out.print("do you want to add more item (yes/no): ");
            userAnswer = key.nextLine();
        }while (userAnswer.equalsIgnoreCase("yes"));
        System.out.println(shoppingList);
    }
}
