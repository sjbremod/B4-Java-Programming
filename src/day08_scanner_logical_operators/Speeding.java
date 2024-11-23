package day08_scanner_logical_operators;

public class Speeding {
    public static void main(String[] args) {
        int currentSpeed = 31;
        int speedLimit = 25;

        // you can go a little higher
        boolean  isSpeeding = currentSpeed > speedLimit +5;
        System.out.println("you are speeding: " + isSpeeding);


        System.out.println("speeding limit in law in this area is " + speedLimit);



    }
}
