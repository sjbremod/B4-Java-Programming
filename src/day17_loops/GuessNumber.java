package day17_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int secretNumber = 777;
        int userGuess;


        do{
            System.out.println("Please, guess the number: ");
           userGuess= key.nextInt();
           if(userGuess <secretNumber){
               System.out.println("its too low");
           }else if(userGuess>secretNumber){
               System.out.println("it is too high");
           }else{
               System.out.println("guessed correctly");
           }
        }while (userGuess != secretNumber);{
        /*
        TODO: home practice
            in this code implement a logic that tells me after how many tries , i found the correct
                    -print "after nth try you guessed it"
         */
        }
    }
}
