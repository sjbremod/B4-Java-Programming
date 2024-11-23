package day09_a_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        //object reference = object itself
        Scanner key = new Scanner(System.in);
        boolean isTriangle, isCircle;

        System.out.println("enter three angles ");
        double angle1 = key.nextDouble();
        double angle2 = key.nextDouble();
        double angle3 = key.nextDouble();

        isTriangle = angle1 + angle2 + angle3 == 180;
        isCircle = angle1 + angle2 + angle3 == 360;

        System.out.println("it is a triangle: " + isTriangle);
        System.out.println("it is a circle: " + isCircle);


    }
}

