package day23_multidimensional_arrays;

import java.util.Arrays;

public class multiDimArrayExample {
    public static void main(String[] args) {

        int [] n = {5,10,20,10};            //single dimensional array
        int [] m = {5, 10, 100, 39, 19};       // single dimensional array


        int [][] all = {n, m};
        int [][] all2 = {{5,10,20,10}, {5, 10, 100, 39, 19} }; // we stored single dimensional arrays in 2dimensional array

        System.out.println(all2);// hashcode
        System.out.println(Arrays.toString(all));// hashcode

        System.out.println(Arrays.deepToString(all));
        System.out.println();
        int [][] arr2D = {
                {90,80,70},
                {60,50,40},
                {20,0,-10},
                {50}
        };

        System.out.println(arr2D.length);//
        System.out.println(arr2D[0].length);//3
        System.out.println(arr2D[1].length);//3
        System.out.println(arr2D[2].length);//3
        System.out.println(arr2D[3].length);//1
        System.out.println();
        // 40
        System.out.println(arr2D[1][2]);
        System.out.println(Arrays.toString(arr2D[2]));

    }
}
