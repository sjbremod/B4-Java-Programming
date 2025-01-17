package day41_collection.set;

import java.util.*;

public class SetObjects {
    public static void main(String[] args) {
//
//        HashSet<String> set1 = new HashSet<String>(); //ref: itself
//        Set<String> set2 =  new HashSet<String>(); //ref: first interface 'set'
//        Collection<String> set3 =  new HashSet<String>(); //ref: second interface 'Collection'
//        Iterable<String> set4 =  new HashSet<String>(); //ref: third interface 'Iterable'

        Set <String> set1 = new HashSet<>();
        set1.add(null);         // null is allowed
        set1.add("hello");
        set1.add("$9.99");
        set1.add("400");
        set1.add("hello");      // duplicate is NOT allowed
        set1.add("%");
        System.out.println(set1);       //insertion order is not kept - unordered

        System.out.println();
        Set <String> set2 = new LinkedHashSet<>();
        set2.add(null);         // null is allowed
        set2.add("hello");
        set2.add("$9.99");
        set2.add("400");
        set2.add("hello");      // duplicate is NOT allowed
        set2.add("%");
        System.out.println(set2); // insertion order is KEPT


        System.out.println();
        Set <String> set3 = new TreeSet<>();
       // set3.add(null);         // null is  NOT allowed
        set3.add("hello");
        set3.add("$9.99");
        set3.add("400");
        set3.add("hello");      // duplicate is NOT allowed
        set3.add("%");
        System.out.println(set3); // SORTED order kept in ASCENDING Order (ascii table)



    }
}
