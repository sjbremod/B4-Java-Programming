package day16_loops;

public class Factorial {
    public static void main(String[] args) {
        // n! = n \times (n-1) \times \ dot \times 1
        //4! = 4 * 3 * 2 * 1
        //5! = 5 * 4 * 3 * 2 * 1

        int num = 5;
        int result =1;
        while (num > 0){


       result =  result * (num); // result = 1 * 4
        num--;                   // num = 3
        }
        System.out.println(result);
    }
}
