package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {

        ArrayList <String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("energy drinks");
        drinks.add("soda");
        System.out.println(drinks);

        ArrayList <String> drinks2 = drinks;
        System.out.println(drinks2);

        ArrayList <String> drinks3 = new ArrayList<>(drinks); // created a new list by copying drinks
        System.out.println(drinks3);

        drinks.remove("tea");
        System.out.println(drinks);
        System.out.println(drinks2);
        System.out.println(drinks3);

        System.out.println();
        String [] drinks4 = {"coffee","tea","energy drinks","soda"};
        //convert array to Arraylist
        //ArrayList <String> drinks5 = drinks4 // cant do this
        //ArrayList <String> drinks6= new ArrayList<>(drinks4); // cant convert directly
        ArrayList <String> drinks7 = new ArrayList<>(Arrays.asList(drinks4)); //
        System.out.println(drinks7);
        System.out.println(Arrays.toString(drinks4));

        System.out.println();
        // since asList(var ... args) accepts parameter as var args we can send the values directly as well
        // ArrayList <String> drinks8 = new ArrayList

        //get missing

        // bulk action
        System.out.println();
        System.out.println("bulk actions");
        ArrayList <String> drinks10 = new ArrayList<>();
//        drinks10.add("coffee");
//        drinks10.add("tea");

        //drinks10.addAll("coffee","tea","energy drinks","soda");// not valid
        drinks10.addAll(Arrays.asList("coffee","tea","energy drinks","soda"));
        System.out.println(drinks10);
        drinks10.add("milkshake");
        System.out.println(drinks10);
        drinks10.add(1,"latte");
        System.out.println(drinks10);

        drinks10.addAll(Arrays.asList("matcha", "hot cocoa"));
        System.out.println(drinks10);

        drinks10.addAll(2,Arrays.asList("hot chocolate", "chai latte"));
        System.out.println(drinks10);



    }
}
