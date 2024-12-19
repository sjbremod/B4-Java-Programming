package day28_arraylist;

import java.util.ArrayList;

public class indexOfMethods {
    public static void main(String[] args) {

        String str = "Loooooop";
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("l")); // -1 b/c case sensitive and not in the string


        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.add(600);
        nums.add(100);
        System.out.println(nums);

        // .indexOf():
        System.out.println(nums.indexOf(100)); // 0
        System.out.println(nums.indexOf(700)); // -1 b/c not in the array list

        int indexOf500 = nums.indexOf(500);
        System.out.println(indexOf500);
        System.out.println("-------------------");

        //.lastIndexOf(); // will return the index of the first match from the end

        System.out.println(nums.lastIndexOf(100));
        System.out.println();
        nums.add(350);
        nums.add(450);
        nums.add(100);
        nums.add(250);
        System.out.println(nums);
        // change the value of the last 100 to be -100
      //  nums.lastIndexOf(100);
        nums.set(nums.lastIndexOf(100),-100);
        System.out.println(nums);


    }
}
