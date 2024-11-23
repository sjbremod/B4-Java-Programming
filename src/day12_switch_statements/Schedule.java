package day12_switch_statements;

import java.util.Scanner;


public class Schedule {
    public static void main(String[] args) {
      Scanner key = new Scanner(System.in);
        System.out.print("what day do you want know about: ");
        String day = key.next();
        String information;

        switch (day){
            case "monday":
            case "Mon":
            case "mon":
            case "Monday":
            case "MONDAY":
                information = "we have mentor sessions on mondays!";
                break;
            case "tuesday":
                information = "we do not have a class";
                break;
            case "wednesday":
            case "thursday":
            case "saturday":
                information = "beautiful day java class";
                break;
            case "friday":
                information = "we do not have a class";
                break;
            case "sunday":
                information = "\" beautiful beautiful \" dayyy java class";
            default:
                information = "no valid input!";

        }
        System.out.println(information);
    }
}
