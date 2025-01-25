package day28_arraylist;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        System.out.println(nums.isEmpty()); //returns true if empty false if element
        boolean result = nums.isEmpty();
        System.out.println(result);
        System.out.println();
        nums.add(100);
        System.out.println(nums.isEmpty());
        nums.add(Integer.parseInt("200")); // will work because of autoboxing but bad approach

        nums.add(Integer.valueOf("200")); // proper way
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.add(600);
        System.out.println(nums);

        System.out.println(nums.contains(400));








    }
}
