package day15_String;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Title {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter your name with tiles: ");
        String name = key.nextLine().toLowerCase(); // Mr. Tom Jerry

        if (name.startsWith("mr. ") || name.startsWith("mister. ")) {
            System.out.println("Hello sir");

        } else if (name.startsWith("ms. ") || name.startsWith("miss") || name.startsWith("madam")) {
            System.out.println("hello ma'am");
        } else if (name.startsWith("dr.")) {
            System.out.println("hello doctor");
        } else if (name.endsWith(" sr")) {
            System.out.println("nice to meet you senior");

        }

        if (name.endsWith(" sr")) {
            System.out.println("nice to meet you ");

        } else if (name.endsWith(" jr")) {
            System.out.println("nice to meet you junior");
        }
    }
}


