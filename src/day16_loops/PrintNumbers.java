package day16_loops;

public class PrintNumbers {
    public static void main(String[] args) {


        int num = 2;
        while (num <= 100) {
            num += 2;
            System.out.println(num);

        }
        System.out.println();
        System.out.println(num);
        System.out.println("--------");
        int i = 1;
        while (i <= 100) {
            // instead of printing all numbers up until 100, print only even number
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}