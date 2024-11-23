package day11_if_statements;

import java.util.Scanner;

public class Diver {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int oxygenLevel = 80;
        // if you do it this way it needs to add the upper limit
        // if you go 90 first then down to 50 then you dont need upper limit because it will stop at the correct spot
        // look at discord
        if (oxygenLevel > 50) {
            System.out.println("Be careful now you are at 50%");
        }else if(oxygenLevel>60){
            System.out.println("start to head back");
        }else if ( oxygenLevel>70){
            System.out.println("dont go to far");
        }else if (oxygenLevel>80){
            System.out.println("still ok");
        }else if (oxygenLevel>90){
            System.out.println("your tank is full");
        }

    }
}
