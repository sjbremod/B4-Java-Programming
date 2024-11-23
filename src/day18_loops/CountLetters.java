package day18_loops;

public class CountLetters {
    public static void main(String[] args) {
/*

    Given a String we want to count how many 'a' characters we have

    Todo: Challenge: adjust so that we can check for not only 'a' but any character

    Ex: aabbcaa

        4

 */
        String word = "aabbcaa";
        //             0123456
        char letter = 'a';
        int count = 0;

        /*
            I would loop through the character/letters from the word and check 1 by 1 if it is equal
            If it is equal, I would count.
         */

        for (int i = 0; i < word.length() ; i++) {

            if (word.charAt(i) == letter) {  // Every char has ASCII number assigned *** a == a | a == a | b == a | b == a | c == a | a == a | a == a
                count++;
            }
        }


        System.out.println("In \"" + word + "\", we have " + count + " \'" + letter + "\' chracter"  );



    }
}