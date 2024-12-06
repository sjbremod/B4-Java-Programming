package day23_multidimensional_arrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        int [] arr1 = {30, 90, 60, 360, 180};
        int [] arr2 = {180, 360, 30, 60, 90};

        //how to print arrays / how to covert array to string with square brackets and comas
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // how to compare two arrays
        boolean result = Arrays.equals(arr1,arr2);
        System.out.println(result);
        System.out.println("Before sorting compare: "+Arrays.equals(arr1,arr2));

        // how to sort
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("After sorting compare: "+ Arrays.equals(arr1,arr2));

        System.out.println("-------------");
        //how to join elements in Array / how  to convert array into String
        String [] strArr = {"java", "selenium", "jire", "sprint", "release"};
       String str2 =  String.join( "", strArr );
        System.out.println(str2);

        System.out.println(String.join("##", strArr));
        System.out.println("-------------");

        //how to convert String into String array
        String str3 = "Today is Thursday";
        String [] str3Arr = str3.split(" ");
        System.out.println(Arrays.toString(str3Arr));
        System.out.println("-------------");
        // how to convert String into char array

        String str4= "loopcamp";
        char [] str4Arr = str4.toCharArray();
        System.out.println(Arrays.toString(str4Arr));
        System.out.println(Arrays.toString(str4.toCharArray()));// char array
        System.out.println(Arrays.toString(str4.split("")));// string array




    }
}
