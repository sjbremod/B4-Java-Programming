package day13_string;
// import java.lang.String; // this package is imported by default/ automatically

import java.util.Scanner; // we need to import it

public class StringMemory {
    public static void main(String[] args) {
        // class name (scanner is the object type) objectReferenceName(key)
        //dataType is non primitive / object type
        String key;
        Scanner word;


        // datatype (primitive)
        int num;

        //------------------------------

        //there are 2 options that you can create a string
        //option 1 - by literals -->simply by double quotes --""
        String str1 = "java";

        //option 2 - by new key word ---> new String ("");
        String str2 = new String("java");
//two types of memory
        // stack and heap
        // in heap we have String pool which was created by literals.   but when you use new keyword its created directly into the heap
        String str3 = "java"; // literals so only one "java" in the string pool.. points to the java already in the pool

        String str4 = new String("java"); // creats an entire new " java" in the heap.  so now we have two " javas" in heap


        System.out.println("str1");
        System.out.println("str2");
        System.out.println("str3");
        System.out.println("str4");
        System.out.println("____________________");
        System.out.println(str1==str2);// false memory location is dif
        System.out.println(str2 == str3);// false memory location is dif
        System.out.println(str1 == str3);// true memory location is the same
        System.out.println(str4 == str4);// false  memory location is dif

        String str5 = "Java";
        System.out.println(str1 == str5);// false because case sensative
        //  == -----> with this relationship operator we are comparing the memory location not the value itself




    }
}
