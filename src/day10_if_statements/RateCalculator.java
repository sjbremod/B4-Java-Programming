package day10_if_statements;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter annual salary: $");
        double salary = key.nextDouble();
        System.out.print("How many hours did you work in a week: ");
        int hoursPerWeek = key.nextInt();
        double hourlyRate = salary / (hoursPerWeek * 52);
        System.out.println("my hourly rate is: $" + hourlyRate);







    }
}
