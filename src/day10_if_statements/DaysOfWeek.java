package day10_if_statements;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("please enter a number between 1-7 inclusive for days of the week: ");
        int weekDayInNum = key.nextInt();
        // get it from discord
        boolean isMonday = weekDayInNum == 1;

        if (isMonday) {
            System.out.println("Monday");
        }

        if (weekDayInNum == 2) {
            System.out.println("Tuesday");
        }

        if (weekDayInNum == 3) {
            System.out.println("Wednesday");
        }

        if (weekDayInNum == 4) {
            System.out.println("Thursday");
        }

        if (weekDayInNum == 5) {
            System.out.println("Friday");
        }

        if (weekDayInNum == 6) {
            System.out.println("Saturday");
        }

        if (weekDayInNum == 7) {
            System.out.println("Sunday");
        }

        if (weekDayInNum != 1 && weekDayInNum != 2 && weekDayInNum != 3 && weekDayInNum != 4 && weekDayInNum != 5 && weekDayInNum != 6 && weekDayInNum != 7){
            System.out.println("Invalid input. Your number is not between 1 and 7. Your number is " + weekDayInNum);
        }


        System.out.println("---------");

        if (isMonday) {
            System.out.println("Monday!");
        } else if (weekDayInNum == 2) {
            System.out.println("Tuesday!");
        } else if (weekDayInNum == 3) {
            System.out.println("Wednesday!");
        } else if (weekDayInNum == 4) {
            System.out.println("Thursday!");
        } else if (weekDayInNum == 5) {
            System.out.println("Friday!");
        } else if (weekDayInNum == 6) {
            System.out.println("Saturday!");
        } else if (weekDayInNum == 7) {
            System.out.println("Sunday!");
        } else {
            System.out.println("Invalid input. Your number is not between 1 and 7. Your number is " + weekDayInNum);
        }



    }
}
