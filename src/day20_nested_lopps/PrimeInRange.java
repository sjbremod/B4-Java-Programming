package day20_nested_lopps;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a number to find all prime numbers up to that number");
        int userNum = key.nextInt();
        for (int i = 1; i <=userNum ; i++) {
            int count =0;
            int singleNum = i;
            for (int j = 1; j <=singleNum ; j++) {

                if(singleNum%j==0){
                    count++;
                }

            }
            if(count ==2){
                System.out.print(singleNum + " ");
        }


        }
    }

}
