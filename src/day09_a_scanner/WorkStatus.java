package day09_a_scanner;

import java.util.Scanner;


public class WorkStatus {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("please enter your first name: ");
        String firstName = key.next();
        System.out.println("please enter your last name: ");
        String lastName = key.next();
        System.out.println("are you employeed (true or false): ");
        boolean isEmployed = key.nextBoolean();
        System.out.println("are you a student (true/false): ");
        boolean isStudent = key.nextBoolean();
        System.out.println(firstName+ " - "+lastName +" - " + isEmployed + " - "+isStudent);



    }
}
