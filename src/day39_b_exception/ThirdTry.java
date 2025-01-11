package day39_b_exception;

import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter an number");
            int userNum = scanner.nextInt();

            System.out.print("enter another number: ");
            int userNum2 = scanner.nextInt();

            System.out.println(userNum / userNum2);

        }catch(RuntimeException e){
            System.out.println("general catch");
        } finally {
            //ths finally block will be executed no matter if there was exception or not
            System.out.println("finally block");
            scanner.close();
        }
        System.out.println("finish line");
    }
}
