package day25_methods;

import java.util.Arrays;

public class MinNumberInArray {
    public static void main(String[] args) {
       int [] nums = {23, 345,23,1356,765,2344,2,-78};
        System.out.println(minNumInArr(nums));


    }

    public static int minNumInArr(int[]arr){
        int min = 0;
        Arrays.sort(arr);
        min = arr[0];

        return min;
    }
    public static int maxNumInArr(int[]arr){
        int max = 0;
        Arrays.sort(arr);
        max = arr[arr.length-1];

        return max;
    }
}
