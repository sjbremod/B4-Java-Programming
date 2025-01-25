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

    /**
     * this method returns the index of given int num from the give int array
     * @param arr given int array
     * @param num given int value
     * @return the index of value if exists, if not returns -1
     */
    public static int indexOf (int []arr , int num){
        int index = -1;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == num){
                index = i;
                break;
            }
        }
        return index;

    }
    /**
     * this method returns the index of given String str from the give String array
     * @param arr given string array
     * @param str given string value
     * @return the index of value if exists, if not returns -1
     */
    public static int indexOf (String []arr , String  str){
        int index = -1;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] .equals(str)){
                index = i;
                break;
            }
        }
        return index;

    }

    /**
     * this method returns the sum of all the int numbers in the given int array
     * @param arr given int array
     * @return the total sum of all elements
     */
    public static int sum(int ... arr){
        int total = 0;
        for (int each  :arr  ){
            total += each;
        }


        return total;
    }

    /**
     * this method returns int array with give int element added at the end of the give int array
     * @param arr
     * @param num
     * @return int arr
     */
    public static int [] addElemInArr(int []arr,int num){

        int [] addedArr = Arrays.copyOf(arr,arr.length+1);
        addedArr [addedArr.length-1]=num;


        return addedArr;
    }

    /**
     * this method returns int array with given int var args  elements added at the end of the give int array
     * @param arr given int array
     * @param arr2 given var args
     * @return int array
     */
    public static int [] addElemInArray (int []arr, int ... arr2){

        int [] addedAr= Arrays.copyOf(arr,arr.length+arr2.length);

        for (int i = arr.length, j=0; i < addedAr.length; i++, j++) {
            addedAr[i] =arr2[j];
        }


        return addedAr;
    }
}
