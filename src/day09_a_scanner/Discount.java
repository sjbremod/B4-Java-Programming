package day09_a_scanner;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        boolean isWeekend =false;
        boolean isTeacher = true;
        boolean isOfficer =true;
        boolean isFireFighter =false;

        boolean isELigibleForDiscout = isWeekend && (isTeacher || isOfficer || isFireFighter);
        System.out.println("Is eligible for discount: " +isELigibleForDiscout);

    }
}
