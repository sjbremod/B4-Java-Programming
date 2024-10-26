package day04_variables;

public class FloatingNumbers {
    public static void main(String[] args) {


        System.out.println(3);
        System.out.println(4);

        System.out.println(3 + 4);
        System.out.println(3 * 4);
        // in java we can not store the fraction with in datatype
        System.out.println(3/4);  // 0.75 int give you the whole number portion
        System.out.println(13/4); // 3.25 int gives you whole number portion

        // that is why we have floating data types
        double price = 10.99; // this is the way to store decimal numbers with fraction  Mostly use
        float gpa = 3.4f; // this is another way you store decimal numbers with fraction  must use f or F at the end

        System.out.println(price); // datatype double
        System.out.println(gpa);   // data type float
        System.out.println(5.6);  // datatype double by default
        System.out.println(3.0/4);
        // double / int ----- result promotes to be the bigger data type in operations
        System.out.println(13/4.0);
    }
}
