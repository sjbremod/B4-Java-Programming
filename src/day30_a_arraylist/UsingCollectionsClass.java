package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {

        ArrayList <Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 2, 4, 62, 23, 9));
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);


        Collections.reverse(list1);
        System.out.println(list1);


        System.out.println(Collections.max(list1));
       int minInList =  Collections.min(list1);
        System.out.println(minInList);

        //.swap
        Collections.swap(list1,1,list1.size()-1);
        System.out.println(list1);

        //.frequency()
        //"loopcamp"

        String str = "loopcamp";
        ArrayList <String> letterList = new ArrayList<>(Arrays.asList(str.split(""))); // we split it to make it an array then went to arraylist

        System.out.println(letterList);

       int numOfLetterO =  Collections.frequency(letterList,"o");// we can print this directly too if we want
        System.out.println(numOfLetterO);
        System.out.println(Collections.frequency(letterList, "p"));
        System.out.println(Collections.frequency(letterList, "a"));

        System.out.println();
        System.out.println(Collections.frequency(list1,9));
        System.out.println();



    }
}
