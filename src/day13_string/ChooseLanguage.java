package day13_string;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please, choose one of the options below: ");
        System.out.println("\t1 - english\n\t2 - spanish\n\t3 - turkish\n\t4 - russian\n\t5 - french\n\t6 - azerbaijan");
        int userOption = key.nextInt();
//option 1 with if else
        if(userOption ==1){
            System.out.println("hello, thanks for your call");
        }else if(userOption == 2){
            System.out.println("hola");
        }else if (userOption ==3){
            System.out.println("merhaba");
        }else if (userOption ==4){
            System.out.println("privet");
        }else if (userOption== 5){
            System.out.println("merci");
        }else if (userOption==6){
            System.out.println("salam");
        }else {
            System.out.println("we will use english by default");
        }
        System.out.println("======================================");
// option 2 with switch
        String message;
        switch(userOption){
            case 1:
                message= "hello";
                break;
            case 2:
                message = "hola";
                break;
            case 3:
                message = "merhaba";
                break;
            case 4:
                message = "merci";
                break;
            case 5:
                message = "privet";
                break;
            case 6:
                message = "salam";
                break;
            default:
                message = "we will use english by default";

        }
        System.out.println(message);
    }
}
