package day27_Wrapper_arrayList;

import java.util.Arrays;

public class AddElementInArr {
    public static void main(String[] args) {
        int [] a = { 1,2,3,4,5};

        int []b = addElemInArr(a,40);
        System.out.println(Arrays.toString(b));
        System.out.println("--------------------");
        int []c = addElemInArray(a,3,4,56,76);
        System.out.println(Arrays.toString(c));


    }


    public static int [] addElemInArr(int []arr,int num){

        int [] addedArr = Arrays.copyOf(arr,arr.length+1);
        addedArr [addedArr.length-1]=num;


        return addedArr;
    }
    /*
    TODO: home practice
        implement the same code with fori loop
        note: make the method name : addElemInArr2
     */
    // i need to build a function / a code (method) which adds couple elements into an array

    public static int [] addElemInArray (int []arr, int ... arr2){

        int [] addedAr= Arrays.copyOf(arr,arr.length+arr2.length);

        for (int i = arr.length, j=0; i < addedAr.length; i++, j++) {
            addedAr[i] =arr2[j];
        }


        return addedAr;
    }
    /**
     * TODO: add the version of 2 methods above for string
     */
}
