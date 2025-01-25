package day45_fuctions_stream.functional_interface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        // create an implementation that takes string and integer and prints the string number of times given integer
        BiConsumer <String, Integer> printNTimes = (str,n) -> {
            for (int i = 1; i <=n ; i++) {
                System.out.print(str + " ");
            }
            System.out.println();
        };


        printNTimes.accept("java",5);
        printNTimes.accept("python ",3);

        System.out.println("----------------");

        Map <String, Integer> map = new LinkedHashMap<>();
        map.put("java", 5);
        map.put("python", 3);
        map.put("ci/cd ", 6);

        // . forEach() with map accepts BiConsumer
        // on every cycle with forEach() take each key value pair use for biconsumer input
        map.forEach( (eachKey, eachValue) -> {
            System.out.println(eachKey + " : " + eachValue);
        } );

        System.out.println("=====================");
        map.forEach((k, v) -> {
            System.out.println(k + " has " + k.length() + " characters");
        });









    }
}
