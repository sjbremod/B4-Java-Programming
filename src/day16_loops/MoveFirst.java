package day16_loops;

import java.util.Scanner;

public class MoveFirst {
    public static void main(String[] args) {
        System.out.println("please enter a sentence: ");
        Scanner key = new Scanner(System.in);
        String sentence = key.nextLine(); // Java is a fun language
        String part1 = sentence.substring(0, sentence.indexOf(" "));
        String part2 = sentence.substring( sentence.indexOf(" ")+1);
//        System.out.println(part1);
//        System.out.println(part2);
        System.out.println(part2+ " " + part1);
/*
TODO: home practice
    handle the case where user provides only single word as a sentence.
    if user provides single word ---> print the same word
    hint contains();   check for empty space to see if there are multiple words
 */
    }
}
