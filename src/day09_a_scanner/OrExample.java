package day09_a_scanner;

import java.util.Scanner;

public class OrExample {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int apple = 5;
        int orange = 7;
        System.out.println(apple > 3 || orange <5);
        // || short circuit operator
        // true + false = true

    }
}
