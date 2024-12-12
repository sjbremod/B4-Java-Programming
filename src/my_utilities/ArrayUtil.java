package my_utilities;

import java.util.Arrays;

/**
 * this method returns the minimum value in the given int array
 */
public class ArrayUtil {
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

    /**
     * this method returns a boolean whether given int array contains the given number
     * @param arr given arr
     * @param num given num
     * @return boolean whether contains or not
     */
    public static Boolean contains(int [] arr, int num){
        boolean result = false;

        for(int each : arr){
            if(each == num){
                result= true;
                break;
            }
        }

        return result;
    }
}
