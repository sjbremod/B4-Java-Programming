package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {
    public static void main(String[] args) {

        // lets say i want to build a method that returns me days of week
        System.out.println(getDaysOfWeek());

        // you can assign it

        ArrayList <String> weekDays = getDaysOfWeek();

        System.out.println(weekDays.get(0));

        //build another function that prints the given arrayList in specific format
        /*
            list:
                elem1
                elem2
                .....
         */
        printElements(weekDays);


    }

        public static  ArrayList <String>   getDaysOfWeek(){
            ArrayList <String> weekDays = new ArrayList<>(Arrays.asList("monday", "tuesday", "wednesday","thursday","friday","saturday","sunday"));

            return weekDays;
        }

        public static void printElements ( ArrayList<String> list   ){
            System.out.println("list: ");
            for( String each  : list){
                System.out.println("\t"+each);
            }


        }




}
