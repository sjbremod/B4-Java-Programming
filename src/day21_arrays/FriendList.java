package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner key =new Scanner(System.in);
        System.out.print("Please enter how many friends you have: ");
        String [] friendList = new String [key.nextInt()]; //2 null , null
        key.nextLine();
        for (int i = 0; i < friendList.length ; i++) {
            System.out.print("please enter the name: " +(i+1)+ " : ");
            friendList[i] = key.nextLine();

        }
        System.out.println();
        //at the end print your friends list
       // System.out.println(Arrays.toString(friendList));
        System.out.println(" my friend list" );
        for(String each: friendList ){
            System.out.println("\t"+each);
        }
    }
}
