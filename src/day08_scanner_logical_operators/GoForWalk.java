package day08_scanner_logical_operators;

public class GoForWalk {
    public static void main(String[] args) {
        boolean isRaining = true;
        int temperature = 80;
        boolean isGoodToWalk = !isRaining && temperature > 78;

        System.out.println("is it good to go for a walk: " +isGoodToWalk);


    }
}
