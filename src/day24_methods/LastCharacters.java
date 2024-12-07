package day24_methods;

import java.util.Arrays;

public class LastCharacters {
    public static void main(String[] args) {

        String[][] words = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"},
        };

        System.out.println(Arrays.deepToString(words));
        for (String[] eachSingleArr : words) {
            String lastChar = "";

            for (String eachElem : eachSingleArr) {
                lastChar += eachElem.charAt(eachElem.length() - 1);
            }
            System.out.println(lastChar);
        }
        /*
        TODO: Practice
        implement the same code with the traditional loop fori
         */
    }
}
