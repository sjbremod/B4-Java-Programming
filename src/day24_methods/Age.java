package day24_methods;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter the year you were born: ");
        int userBirthYear = key.nextInt();
        calculateAge(userBirthYear);
    }

    public static void calculateAge (int year){
        System.out.println("your age: "+ (2024-year));
        System.out.println("your age: "+ (Year.now().getValue() -year));

        // there is a utility class in java which returns you the current year

    }
}
