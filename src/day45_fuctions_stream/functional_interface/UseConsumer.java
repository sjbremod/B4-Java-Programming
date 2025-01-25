package day45_fuctions_stream.functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 *  Consumer <T>:
 *  method : vpod acce[t (T t)
 */
public class UseConsumer {
    public static void main(String[] args) {

        Consumer <Integer> printNumbers =(Integer number) -> {

        for (int i = 0; i <= number ; i++) {
            System.out.print(i + " ");
        }
        };
        printNumbers.accept(10); // sincve im implementing from the same class, i can just use the functional interface ref without class

        System.out.println("\n---------------");

        List <String> list = new ArrayList<>(Arrays.asList("java", "selenium","softskills", "ci/cd","db","api"));
        // ()-> {}
        //list.forEach(  (str)-> {System.out.println(str);} );
        list.forEach(  str-> System.out.println(str) ); // removed () and the {} bc its since parameter and single statement

        //.forEach()  is a loop that can work with Collection interface data structures and help us loop through all the elements from specific data structure
        // (str)-> {System.out.println(str);}  --> lambda expression --> specific to Consumer --> b.c forEach() accepts argument as Consumer
        // str is the reference that will get each element from 'List' data structure on each cycle

        System.out.println("----------------------");
        list.forEach(e->{
            System.out.println("every cycle getting each element: ");
            System.out.println(e);
        });

        System.out.println("----------------------");
        list.forEach(e->{
            System.out.println(e.charAt(0) + "-" + e.charAt(e.length()-1));

        });

        System.out.println("----------------------");
        list.forEach(e->{
            if(e.length()>4){
                System.out.println(e);
            }

        });

        System.out.println("----------------------");

        List <Integer> listNumbers = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        listNumbers.forEach((e) -> {
            if (e %2 == 0 ){
                System.out.println(e);
            }
        });

        





    }
}
