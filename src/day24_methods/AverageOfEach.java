package day24_methods;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {

        double [][] numbers = {
                {3, 4 , 5, 6},
                {5, 2, 6},
                {10,20,30}
        };
        double totalSum = 0;
        int totalLength = 0;

        for( double [] each : numbers){
            double sumEachArr = 0;
            //System.out.println(Arrays.toString(each));

            for( double eachElem : each){
               // System.out.println(eachElem);
                sumEachArr += eachElem;
            }
            totalSum += sumEachArr;
            totalLength += each.length;
            System.out.println("average of "+ Arrays.toString(each)+ " is: "+ sumEachArr/each.length);
        }

        System.out.println("average of 2d array: " + totalSum/totalLength);

    }
}
