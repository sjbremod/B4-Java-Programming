package day08_scanner_logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(n > 5); // this is a single different statement
        System.out.println(n < 20); //
        System.out.println( n>5 && n<20);// this is a single statement using logical and relational operators
    // first                f   &&    t


        System.out.println("-----------------");
        System.out.println( 6 > 1 || false);

        System.out.println(1 > 5 || false);
        System.out.println("-----------------");

        System.out.println(true);
        System.out.println(!true); // not operator ---> not true ----> false
        System.out.println(false);

        System.out.println( 6 != 6 );

    }
}
