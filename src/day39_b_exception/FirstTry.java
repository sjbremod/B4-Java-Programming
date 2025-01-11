package day39_b_exception;

import java.util.Scanner;

public class FirstTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("first print out");
        System.out.println("give me the index: ");
        int index = scanner.nextInt();
        String str = "loop";
       // String str = 'loop';// compile exception


        try {
            System.out.println(str.charAt(index));

        }catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("exception is caught");
        }


        //System.out.println(str.charAt(4));// run time exception - out of bounds
       // System.out.println(str.charAt(index));

        System.out.println("second print out");
    }
}
