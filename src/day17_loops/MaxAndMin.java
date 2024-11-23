package day17_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Hey , how many numbers do you want to compare: ");
        int countOfNumber = key.nextInt();
        int cycle = 1;
        int userNum= 0;
        int biggest =-2147483648;
        //int biggest = Integer.MIN_VALUE;
        int smallest = 2147483647;

        //System.out.println(Integer.MAX_VALUE);  // 2147483647 inside of this Integer class, there is a way to get the max number
        //System.out.println(Integer.MIN_VALUE);  // -2147483648 inside of this Integer class, there is a way to get the min number

        while(cycle <=countOfNumber){
            System.out.print("Please eneter the number "+cycle+": ");
            userNum = key.nextInt();
            if(userNum>biggest){
                biggest = userNum;
            }
            if(userNum<smallest){
                smallest = userNum;
            }
            cycle++;
        }

        System.out.println("biggest: "+biggest);
        System.out.println("smallest: " + smallest);

    }
}
