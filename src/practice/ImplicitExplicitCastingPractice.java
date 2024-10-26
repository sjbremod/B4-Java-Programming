package practice;

public class ImplicitExplicitCastingPractice {
    public static void main(String[] args) {

        // implicit

        byte a = 100;
        int b = a;


        //explicit
        double c = 3.14;
        int i = (int) c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(i);


    }
}
