package day44_map_and_functions.string_sbuilder_sbuffer;

public class StringStringBuilderStringBuffer {
    public static void main(String[] args) {

        // 1. String
        //    Strings are IMMUTABLE

        String str1 = "loopcamp";                    // stored in the string pool
        String str2 = new String("loopcamp"); // stored directly in heap
        str1 = str1 + str2;                          // this line created completely new object in heap
        System.out.println("String: "+str1);

        System.out.println("-----------------------");
        //2. StringBuilder
        //   StringBuilder is MUTABLE (can change) - can only be created by new keyword - it is not synchronized not thread safe
        StringBuilder strBuilder1  = new StringBuilder("loopcamp"); // stored it directly in the heap
        System.out.println("StringBuilder: "+ strBuilder1);
        strBuilder1.append("loopcamp");                     // this line does NOT create a new object, it updates
        System.out.println("StringBuilder: "+ strBuilder1);

        //3. StringBuffer
        //   is MUTABLE - only can be created by new keyword - is synchronize is thread safe
        StringBuffer strBuffer1 = new StringBuffer("loopcamp");
        System.out.println(strBuffer1);
        System.out.println(strBuffer1.reverse());


    }
}
