package day07_relational_operators;

public class GiftCard {
    public static void main(String[] args) {

        double giftCard = 200;
        double item1 = 10;
        double item2 = 25.9;
        System.out.println("I have $" + giftCard + " balance on my gift card.");
        System.out.println("I bought a cup for $ "+ item1);

        //giftCard = giftCard - item1
       giftCard -= item1;
        System.out.println("after purchaing the cup, i have $" +giftCard + " balance");
        //we can do the code below as well to combine two statements into one
        //System.out.println("After purchasing the cup, I have $" +(giftCard -= item1) + " balance");
        System.out.println("i bought a tv shirt ");

// get the rest from his code
    }
}
