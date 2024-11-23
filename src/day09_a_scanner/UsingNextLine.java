package day09_a_scanner;
import java.util.Scanner;

public class UsingNextLine {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("what day is today: ");
        String day = key.nextLine();

        System.out.println("enter your first name: ");
        String firstName = key.next();

        System.out.println("enter your last name: ");
        String lastName = key.next();

        key.nextLine();// to handle the enter issue

        System.out.println("enter your address: ");
        String address = key.nextLine();
        //System.out.println(address);
// rule with if there are any other scanner methods than .nextLine before .nextline we need to handle it with an extra key.nextLine();
        System.out.println("please enter job titltes: ");
        String jobTitles = key.nextLine();

        System.out.println("please enter couple names: ");
        String names = key.nextLine();


    }
}
