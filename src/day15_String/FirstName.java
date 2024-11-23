package day15_String;

import java.util.Scanner;

public class FirstName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = key.nextLine().trim();
        System.out.println("Please enter your last name");
        String lastName= key.nextLine().trim();

        System.out.println("------------------");
        System.out.println("your full name before corrected: "+ firstName +" "+ lastName);

        // first char to first name ---> upper
        //"" +firstName.charAt(0).toUpperCase();// we need the concat to make it a string
        String correctFirstName =  firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        String correctlastName =  lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println("your name corrected: "+correctFirstName + " " + correctlastName);

        /*
        ask a user to give a full name
        then ask a user
        "which of the following options would you like to do
            1. make all uppercase
            2. make all lowercase
            3. make each word capitalized
            your option: 1,2,3
            then print out what user gave you as full name and in the way they selected to print it out


         */
    }
}
