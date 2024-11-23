package day18_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String word = "Anna";
        String reversed = "";
        /* check the originalWord is same with reversedWord
            1. revere the word
                get each  from end and out the beginning
                    .charAt()

         */
        for (int i = word.length()-1 ; i >=0 ; i--) {
            reversed += word.charAt(i);


        }
        System.out.println(reversed);
        if(word.equalsIgnoreCase(reversed)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not plaindrome");
        }

        // with ternary
        System.out.println(word.equalsIgnoreCase(reversed) ? "it is palindrome" : "it is not palindrome");
    }
}
