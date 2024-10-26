package day06_b_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {

        int i= 5;
        int z = i++;
        //two actiona about
        // 1 - assignment
        // 2 - post increement
        System.out.println(i);
        System.out.println(z);

        int a = 10;
        int b = a + 1; // a+1  NOT a = a+1
        System.out.println(a);
        System.out.println(b);
        System.out.println();
        int c = ++a;
        System.out.println(a);
        System.out.println(c);
    }
}
