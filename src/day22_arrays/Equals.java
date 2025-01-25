package day22_arrays;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4};
        int [] b = {1, 2, 3, 4};
        int [] c = a;

        System.out.println(a == b); // DO NOT USE when comparing arrays/objects
        System.out.println(a==c);  // still DO NOT USE THIS WAY
        System.out.println();
        System.out.println(Arrays.equals(a,b));

        boolean result = Arrays.equals(a,b);
        System.out.println(result);

        System.out.println();
        int [] d = {4, 3, 2, 1};

        Arrays.sort(d);
        System.out.println(Arrays.equals(a, d));


    }
}
