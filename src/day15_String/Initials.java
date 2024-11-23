package day15_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(("Please enter your first name:"));
        String firstName = keyboard. next().toUpperCase();
        System.out.println(" Please enter your last name: ");
        String lastName = keyboard.next().toUpperCase();
        char firstCharOfFirstName= firstName.charAt(0);
        char firstCharOfLastName=  lastName.charAt(0);
        System.out.println(""+ firstCharOfFirstName+firstCharOfLastName);

    }
}
