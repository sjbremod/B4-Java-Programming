package day21_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] arr ={1, 2, 3, 4, 5};

        String result = "[";
        for (int i = arr.length-1; i >=0 ; i--) {
            result+= arr[i]+ ", ";


        }

            result = result.substring(0, result.length()-2)+ "]";
        System.out.println(result);
//option 2 - creat another array and store all elements from arr in a reveresed order

        int[] reversed = new int [arr.length];
        for (int i = 0; i <arr.length ; i++) {
            reversed[reversed.length-1 -i] = arr[i];
        }

        System.out.println(
                "original: "+Arrays.toString(arr));
        System.out.println("reveresed: "+Arrays.toString(reversed));

/*
from aslan alternative solution
or (int j=0, i = arr.length - 1;        i >= 0     ; i--, j++) {
                reversed[j] = arr[i];
        }
 */
    }
}
