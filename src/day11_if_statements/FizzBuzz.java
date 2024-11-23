package day11_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please , enter a number: ");
        int num = key.nextInt();

//        if (num % 3 == 0){
//            System.out.println("Fizz");
//        }else if (num % 5 == 0 ){
//            System.out.println("Bizz");
//        }else if (num % 3 == 0 && num % 5 == 0){
//            System.out.println("FizzBuzz");
//        }// option to fix fixxbuzz is to change the order


        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Fizzbuzz");
        }else if (num % 3 == 0 ){
            System.out.println("Fizz");
        }else if (num % 5 == 0 ){
            System.out.println("bizz");
        }else{
            System.out.println(num);
        }
        // OPTION 2 -- 15
        if (num % 3 == 0 && num % 5 != 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0 && num % 3 != 0) {
            System.out.println("Bizz");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println(num);
        }

    }
}
