package day41_collection.list;

import java.util.*;

public class ListObjects {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>(); // reference itself
//        List<String> list1 = new ArrayList<>();           // ref First interface 'List'
//        Collection<String> list2 = new ArrayList<>();     // ref second interface ' Collection
//        Iterator<String> iterator = list.iterator();      //ref third interface 'Iterable'

        List<String> list1 = new ArrayList<>(); //ref is List interface - object is ArrayList class - internally uses dynamic Array
        list1.add("a");         //add and remove is slower since it uses array in background
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add(null);                //null is allowed
        list1.add("a");                 //duplicate elements are allowed as well
        System.out.println(list1);      // insertion order is kept
        System.out.println(list1.get(3)); //get() comes from List interface. ArrayList works with indexes - reading element is faster

        System.out.println();
        List <String> list2 = new LinkedList<>();//ref is list interface - object is linkedList class - internally uses nodes
        list2.add("a");         // add and remover is faster since it uses NODES in the background
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null);                //null is allowed
        list2.add("a");                 //duplicate elements are allowed as well
        System.out.println(list2);      // insertion order is kept
        System.out.println(list2.get(3)); //get() comes from List interface. linkedList works with nodes reading element is slower

        System.out.println();
        List <String> list3 = new Vector<>(); //ref is List interface - object is vector object - thread save - synchronized which makes it slower
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add(null);                //null is allowed
        list3.add("a");                 //duplicate elements are allowed as well
        System.out.println(list3);      // insertion order is kept
        System.out.println(list3.get(3));




    }
}
