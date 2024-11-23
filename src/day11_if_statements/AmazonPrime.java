package day11_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {
        double price = 30.99;
        boolean hasPrimeMembership = true;

        if (hasPrimeMembership) {
            System.out.println("eligible for 2 day shipping");
        } else {

            if (price >= 25) {
                System.out.println("eligible for regular shipping");
            } else {
                System.out.println("not eligible shipping  $3.99");
                price += 3.99;
                System.out.println(price);


            }
        }

    }
}