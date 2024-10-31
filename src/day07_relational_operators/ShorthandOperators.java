package day07_relational_operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        int a = 10; // declared and initialized
        a = 20;     // re assigned
        a++;        // re assigned by post increment a= a+1
        ++a;        // re assigned by pre increment a= a+1
        a = a+1;    // re assigned by adding +1

        a = a + 10; // re assigned by adding 10 in regular way
        a += 10;     //  re assigned by 10 with shorthand operator
        System.out.println(a); // a=43
        //a =+10 this is not a shorthand  reads it  =     +10
        a = 10+23; // a += 23 these are not the same.
        // shorthand only works when you add to itself but also only works with + - * / %
        System.out.println();

        int b = 2;
        b *= 3;
        System.out.println(b);
        System.out.println();

        int c = 10;
        c %=3;
        System.out.println(c);
        System.out.println();













    }
}
