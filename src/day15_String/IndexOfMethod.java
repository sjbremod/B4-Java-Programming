package day15_String;

public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "penpen";

        System.out.println(str.indexOf('p'));
        System.out.println(str.indexOf("p"));

        System.out.println("------------------------");
        System.out.println(str.indexOf('p'));
        System.out.println(str.indexOf("pe"));

        System.out.println("------------------------");
        System.out.println(str.indexOf('e'));
        System.out.println(str.indexOf("pen"));
        System.out.println("------------------------");
        System.out.println(str.indexOf('x'));  // returns -1 bc there was no match (x is not in "penpen"

        System.out.println("------------------------");

        System.out.println(str.indexOf('e', 2));
        System.out.println(str.indexOf("e", 1));
        System.out.println(str.indexOf("e", 2));
        System.out.println(str.indexOf("en", 1));
        System.out.println(str.indexOf("en", 2));
        System.out.println(str.indexOf("np", 3));


    }
}
