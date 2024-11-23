package day16_loops;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a url: ");
        String url= scan.next();

        url = url.substring(  url.indexOf(".")+1,url.lastIndexOf("."));
        System.out.println(url);

        /*
        TODO home practice
            Make sure that url starts with www. and ends with .com
            if not  print " my code is not designed to handle your URL
            if it is do what the task says

         */
    }
}
