package day06_b_unary_operators;

public class Store {
    public static void main(String[] args) {

        String store = "Costco";
        int numberOfTv = 100;

        System.out.println("someone came into the store and they bought a tv");
        numberOfTv = numberOfTv - 1;
        System.out.println("number of tv in stock: " + numberOfTv);
        System.out.println("number of tv in stock: " + --numberOfTv);
        System.out.println("another one bout the same tv" );
        System.out.println("number of tv in stock: " + --numberOfTv);
        System.out.println("someone else came into the store and put it into the tv but hasnt paid yet");
        System.out.println("number of tv in stock: in the computer " + numberOfTv--);
        numberOfTv = numberOfTv +15;
        System.out.println(numberOfTv);

    }
}
