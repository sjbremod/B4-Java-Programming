package day12_switch_statements;

import java.util.Scanner;

/*
ask a user to enter a browser type
 */
public class Browser {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("please enter a browser type: ");
        String browser = key.nextLine();
        System.out.println("what is the webpage you want to navigate to" );
        String webpage = key.next();
        // opening &webpage in $browser     case sensative
        switch (browser){
            case "chrome":
                System.out.println(" opening "+ webpage + " in chrome browser");
                break;
            case "safari": // this is browser safari || Safari || SAFARI
            case "Safari":
            case "SAFARI":
                System.out.println(" opening "+ webpage + " in safari browser");
                break;
            case "firefox":
                System.out.println(" opening "+ webpage + " in firefox browser");
                break;
            case "opera":
                System.out.println(" opening "+ webpage + " in opera browser");
                break;
            case "tor":
                System.out.println(" opening "+ webpage + " in tor browser");
                break;
            default:
                System.out.println("we dont not have "+ browser + " installed in our computer");

        }

    }
}
