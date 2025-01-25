package day22_arrays;

import java.util.Arrays;

public class Splitexample {
    public static void main(String[] args) {

        String str = "monday tuesday wednesday thursday friday saturday sunday";

        String [] days = str.split(" ");
        System.out.println(days.length);
        System.out.println(Arrays.toString(days));

        for (String each : days){
            System.out.println(each);
        }
        System.out.println("-------------");
        String [] days2 = str.split("day");
        System.out.println(Arrays.toString(days2));
        for (int i = 0; i <days2.length ; i++) {
            days2[i]= days2[i].trim();// we trimmed the extra space out now

        }
        System.out.println(days2);

        System.out.println("-------------");
        String [] days3 = str.split("day ");
        System.out.println(Arrays.toString(days3));// sunday prints fully because it cant find the space after day

        System.out.println("-------------");
        String [] days4 = str.split("");
        System.out.println(Arrays.toString(days4));

        System.out.println("-------------");
        String month = "jan-feb-march-apr-may-jun-july";
        String [] monthArr = month.split("-");
        System.out.println(Arrays.toString(monthArr));
        System.out.println("-------------");


        String [] month3 = month.split("dec");
        System.out.println(month3.length);
        System.out.println(Arrays.toString(month3));




    }
}
