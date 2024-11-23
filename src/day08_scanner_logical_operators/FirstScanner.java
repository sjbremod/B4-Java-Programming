package day08_scanner_logical_operators;
// #1 - we need to import to be able to use a class outside of the package

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {

        // Scanner input; input is the object reference name BC data type is non primitive (object) type


        // int a; a is the variable name bc data type is primitive datatype

        //#2 - declaring and instantiation scanner object ---> will help us to get the info from the user/console
        Scanner input = new Scanner(System.in);
        System.out.println("how old are you? ");
       // int userAge = 30; // hardcoded value given to userAge
       int userAge = input.nextInt();
        System.out.println("i am " + userAge + " years old. ");





    }
}
