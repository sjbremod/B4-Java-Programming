package day27_Wrapper_arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        /*
            ArrayList
                - size is flexible
                - works only with object data types

         */
        int [] arr;              //array works with primitive and non - primitive
        Integer [] arr2;         //array works with primitive and non - primitive
        ArrayList <Integer> arrList2;    // collection data structures work only with Object type / non - primitive

        ArrayList <Integer> arrList3 = null; // i created array list of Integer reference with no object meaning null
        System.out.println(arrList3);// null meaning no object
        ArrayList <Integer> arrList4 = new ArrayList<>(); // i created array list of Integer reference with object being empty
        System.out.println(arrList4);// this one is just empty

        // we dont really use this way of declaring
        ArrayList<Integer>arrayList5 = new ArrayList<Integer>(20);// we do not do it with this method

        System.out.println();

        System.out.println(arrList4.size());
        System.out.println();
        arrList4.add(45);
        System.out.println(arrList4);
        System.out.println(arrList4.size());

        arrList4.add(-90); // ArrayList is ordered ---> keeps the insertion order
        System.out.println(arrList4);
        System.out.println(arrList4.size());
        arrList4.add(55);
        arrList4.add(-100);
        System.out.println(arrList4);
        System.out.println(arrList4.size());
        System.out.println();

        arrList4.add(1,50);
        System.out.println(arrList4);
        System.out.println(arrList4.size());


        //how do we reach each of those elements from ArrayList
        System.out.println(arrList4.get(0));
        System.out.println(arrList4.get(1));
        System.out.println(arrList4.get(arrList4.size()-1));

        System.out.println();
        // how do we know hoe many elements we have in ArrayList --- size();


        int sizeOfArrList = arrList4.size();
        int firstElemInArrList = arrList4.get(0); //Integer 45 ---> unboxing --> int 45 this happens automatically



    }

}
