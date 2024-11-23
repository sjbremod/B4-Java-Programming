package day14_String;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a website: ");
        String websiteUrl = key.next().toLowerCase();

        boolean isValidBeginning = websiteUrl.startsWith("www");
        System.out.println(isValidBeginning);
        boolean isValidEnd = websiteUrl.endsWith(".com") || websiteUrl.endsWith(".edu")|| websiteUrl.endsWith(".gov")||websiteUrl.endsWith("net")||websiteUrl.endsWith(".io");

        if(isValidBeginning && isValidEnd){
            System.out.println("its valid website ");
        }else{
            System.out.println("its not valid");
            if(!isValidBeginning){
                System.out.println("\tinvalid begining");
            }
            if(!isValidEnd){
                System.out.println("\tinvalid ending");
            }
        }

        }


}
