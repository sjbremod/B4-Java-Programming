package day15_String;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = key.nextLine(); //Java is a good coding language
        System.out.println(sentence.charAt(0)); // J  this is not concat or addition so it prints
        System.out.println(0+ sentence.charAt(0)); // 74 now bc we did additon it uses the value of the char from the ascii table
        System.out.println(sentence.charAt(sentence.length()-1)); // e from the index
        System.out.println(0+ sentence.charAt(sentence.length()-1)); //101 from ascii table


        System.out.println("first char:  " + sentence.charAt(0)); // this is concat
        System.out.println("last char: " + sentence.charAt(sentence.length()-1)); // this is concat

        /*TODO: get the last char and 2nd last char and check oif they are the same
            if they are - print " double same char at the end"
            if not - print last two char are not same
         */
    }
}
