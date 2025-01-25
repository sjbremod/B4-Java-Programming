package day23_multidimensional_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {

        //int [] arr1 = { 45,123,62};
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter the size of arr1: ");
        int sizeArr1 = key.nextInt();
        int [] arr1 = new int[sizeArr1];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("please enter the value for index "+i+ "; ");
         arr1 [i]= key.nextInt();

        }
        //System.out.println(Arrays.toString(arr1));
        System.out.println("Please enter how many additional elemnts you want to add into array ");
        int additionalSize = key.nextInt();

        int [] arr2 = Arrays.copyOf(arr1, arr1.length+additionalSize );


        System.out.println(Arrays.toString(arr2));

        for (int i = arr1.length; i < arr2.length; i++) {
            System.out.println("please enter a value for index " + i + ": ");
            arr2[i]= key.nextInt();
        }


        System.out.println(Arrays.toString(arr2));


    }
}
