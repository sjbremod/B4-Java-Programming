package day12_switch_statements;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int numInWeek;
        System.out.print("please enter a day in number that represents a weekday: ");
        numInWeek = key.nextInt(); //1
        String day;

        switch (numInWeek){
            case 1:
                day = "monday";
                break;
            case 2:
                day = "tuesday";
                break;
            case 3:
                day = "wednesday";
                break;
            case 4:
                day = "thursday";
                break;
            case 5:
                day = "friday";
                break;
            case 6 :
                day = "saturday";
            case 7:
                day = "sunday";
            default:
                day = "not valid num day in week";
        }
        System.out.println(day);
    }

}
