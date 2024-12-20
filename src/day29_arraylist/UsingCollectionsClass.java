package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {

        //collections s at the end

        ArrayList <Integer> numList =new ArrayList<>();
        numList.addAll(Arrays.asList(4,2,87,23,76,11));
        System.out.println("before sort: "+numList);

        //sort for collections is
        Collections.sort(numList);
        System.out.println("after sort: "+numList);

        //reverse

        Collections.reverse(numList);
        System.out.println("after reverse "+numList);

        System.out.println("----------------------");

        ArrayList <Character> letters = new ArrayList<>(Arrays.asList('C','Z','K','A'));
        System.out.println("original: "+letters);
        Collections.reverse(letters);
        System.out.println("reversed: "+letters);
        Collections.sort(letters);
        System.out.println("sorted: "+ letters);

        System.out.println("----------------------");
        System.out.println(Collections.max(numList));
        System.out.println(Collections.min(numList));
        System.out.println("----------------------");

        Collections.swap(letters,1,3);
        System.out.println("swap: "+letters);







    }
}
