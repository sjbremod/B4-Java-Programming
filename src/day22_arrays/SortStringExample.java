package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {

        String [] str = {"java", "hello", "by", "ba", "Hi", "4", "$", "@", "10"};
        //sort it
        //uppercase comes before lower case
        //numbers before uppercase
        //special characters before numbers
        // i think it has to do with ascii table
        // checks first character to first character  which is why 10 comes before 4
        Arrays.sort(str);
        System.out.println("after sort"+ Arrays.toString(str));

        System.out.println("----------");



    }
}
