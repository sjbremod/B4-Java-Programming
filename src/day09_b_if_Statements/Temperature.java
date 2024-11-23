package day09_b_if_Statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("please enter the temp");
        int temp = key.nextInt();
        if (temp >= 70){ // if (temp >70 || temp == 70){
            System.out.println("Its a nice day\n\t Go outside, but with your laptop to code java");
        }else {
            System.out.println("Its too cold \n\t code more java");
        }
    }
}
