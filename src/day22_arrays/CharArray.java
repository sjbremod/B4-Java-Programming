package day22_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        String word = "loopcamp";
        System.out.println("string size: " +word.length());
        System.out.println("print" +word);

        System.out.println("----------");
        char[] letters = {'l','o','o','p','c','a','m','p'};
        System.out.println("char array size: "+ letters.length);
        System.out.println(letters); // what does this not give me memory location but actual string
        // if you print char [] directly it will convert it to String and print
        System.out.println("print with toString: "+ Arrays.toString(letters));


        System.out.println("------------------");
        char []wordLetters = new char[word.length()];
        System.out.println("char array2 size: " +wordLetters.length);
        System.out.println(wordLetters);//memory location bc it doesnt have values
        System.out.println(Arrays.toString(wordLetters));//memory location bc it doesnt have values

        System.out.println("------------------");
        for (int i = 0; i < word.length(); i++) {
            wordLetters [i] = word.charAt(i);
        }


        System.out.println(Arrays.toString(wordLetters));
        System.out.println("------------------");

        //.toCharArray() ---> will do the exact same as the one about

        char[] wordLetters2 = word.toCharArray();
        System.out.println(Arrays.toString(wordLetters2));


        System.out.println("------------------");
        char []letters3 = "Wednesday".toCharArray();
        System.out.println(Arrays.toString(letters3));
        System.out.println("------------------");

        // String word3 = letters3 // doesnt work
        String word3 = new String(letters3);
        System.out.println(word3);




    }
}
