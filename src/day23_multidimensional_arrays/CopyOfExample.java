package day23_multidimensional_arrays;

import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = a;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 10;
        b[1] = 200;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println();

        int [] x =  new int [a.length];
        System.out.println(Arrays.toString(x));

        for (int i = 0; i <x.length ; i++) {
            x[i] = a[i];

        }
        System.out.println(Arrays.toString(x));
        System.out.println();
        a[0]= 100;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(x));

        // shorter way to do it
        System.out.println();
        int [] y = Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(y));
        b[2]= 300;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(y));

        System.out.println("-----------");
        int [] z = new int[a.length * 2 ];
        System.out.println(Arrays.toString(z));

        for (int i = 0; i <a.length ; i++) {
            z[i] = a[i];

        }
        System.out.println(Arrays.toString(z));

        System.out.println();
        int []z2 = Arrays.copyOf(a, a.length*2);
        System.out.println(Arrays.toString(z2));
        z2[1] = 500;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(z2));
        System.out.println();

        int[] z3 = Arrays.copyOf(a,a.length-1);
        System.out.println(Arrays.toString(z3));



    }
}
