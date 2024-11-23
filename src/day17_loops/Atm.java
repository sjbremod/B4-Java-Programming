package day17_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        int validPin = 7777;
        int userEnterPin;
        Scanner key = new Scanner(System.in);
        int attemptCount = 0;
        // challenge: allow user to attempt max 3 times
        System.out.println("welcome to ATM");
        do{

            System.out.print("Please, enter PIN: ");
            userEnterPin = key.nextInt();
            attemptCount++;
        }while(userEnterPin != validPin&& attemptCount<3); // as long as attempt is less or equal to 3 continue loop.

        if (attemptCount ==3&& userEnterPin != validPin){
            System.out.println("you are locked out.");
        }
        //System.out.println(attemptCount);
    }
}
