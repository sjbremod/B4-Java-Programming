package day45_fuctions_stream.functional_interface;

import java.util.function.Predicate;

/**
 * predicate <T>
 *     method: boolean test(T t)
 *

 */
public class UsePredicate {
    public static Predicate <String> isPalindrome = (String str) -> {

        // check if String str is palindrome (same from beginning and end)

        StringBuilder reversedStr = new StringBuilder(str);
        reversedStr.reverse();

        return str.equals(reversedStr.toString());
    };

   static Predicate <Integer> isPrime = (Integer num) -> {
    // check is num is prime - divisibke iteslf and 1 : div 2 times

        int count = 0;

        for (int i = 1; i <=num ; i++) {
                if (num % i == 0) {
                    count++;
                }
        }
        if (count == 2) {
            return true;
        }else{
            return false;
        }

    };



}
