package day15_String;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter three words:");
        String word1 = key.next().toLowerCase();
        String word2 = key.next().toLowerCase();
        String word3 = key.next().toLowerCase();

        boolean isWord1Biggest =  word1.length() > word2.length() && word1.length() > word3.length() ;
        boolean isWord2Biggest =  word2.length() > word1.length() && word2.length() > word3.length();
        boolean isWord3Biggest =  word3.length() > word1.length() && word3.length() > word2.length();
        boolean word1WithA = word1.contains("a");
        boolean word2WithA = word2.contains("a");
        boolean word3WithA = word3.contains("a");
        boolean containsA = word1WithA || word2WithA || word3WithA;

        if (isWord1Biggest){
            if(word1WithA){
                System.out.println(word1);
            }
        }else if (isWord2Biggest) {
            if(word2WithA){
                System.out.println(word2);
            }
        }else if (isWord3Biggest){
            if(word3WithA){
                System.out.println(word3);
            }

        }
        if (!containsA){
            System.out.println("There are no words that contain the letter a");
        }




        boolean isFirstLongestWithA = word1.contains("a") && ( word1.length() > word2.length() && word1.length() > word3.length() );
        boolean isSecondLongestWithA = word2.contains("a") && word2.length() > word1.length() && word2.length() > word3.length();
        boolean isThirdLongestWithA = word3.contains("a") && word3.length() > word1.length() && word3.length() > word2.length();

        // TODO: Improve the code - implement the option if the words to no have "a" in it. But if there word with "a" then print that one.
        //  HINT: nested if
//        if (isFirstLongestWithA){
//            System.out.println(word1 + " is the longest with a");
//        } else if (isSecondLongestWithA) {
//            System.out.println(word2 + " is the longest with a");
//        } else if (isThirdLongestWithA) {
//            System.out.println(word3 + " is the longest with a");
//        }
   }
}
