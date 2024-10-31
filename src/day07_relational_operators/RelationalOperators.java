package day07_relational_operators;

public class RelationalOperators {
    public static void main(String[] args) {
        System.out.println( 10 > 5);
        System.out.println( 10 < 5);

        int a = 5;
        int b = 2;
        System.out.println( a > b );
        System.out.println( a < b );

        boolean compare1 = 4 >= 2;
        // boolean c = 5 + 4; doesnt work bc the answer is an int
        System.out.println(compare1);
        System.out.println();
        System.out.println(6>=6);
        System.out.println(7<=7);

        System.out.println();
        System.out.println(7 < 7);
        System.out.println(6>6);
        System.out.println();
        System.out.println(4==4);
        System.out.println(4!=4);
        System.out.println(3!=-3);
        System.out.println(-8!=8);
        System.out.println();


    }
}
