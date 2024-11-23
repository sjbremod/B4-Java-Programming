package day18_loops;

import java.util.Scanner;

public class ReverseMiddle {
    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);
        System.out.println("please give me a sentence with at least 3 words");

        String sentence = key.nextLine().trim();
        int countSpace = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                countSpace++;
            }

        }

        if (countSpace >= 2) {
            // I love java
            int firstSpaceIndex = sentence.indexOf(" ");
            int lastSpaceIndex = sentence.lastIndexOf(" ");
            String middle = sentence.substring(firstSpaceIndex+1,lastSpaceIndex);
            String revere = "";
            for (int i = middle.length()-1; i >= 0 ; i--) {
                revere += middle.charAt(i);

            }
            System.out.println(    sentence.substring(0,firstSpaceIndex)+ " " + revere + " " + sentence.substring(lastSpaceIndex+1)   );

        } else {
            System.out.println("your sentence has less than 3 words. ");

        }

        /*
        TODO: home practice : improve this code
            ask a use to enter a sentence with at least 3 words until user gives it to you  (while or do while)
         */
    }
}
