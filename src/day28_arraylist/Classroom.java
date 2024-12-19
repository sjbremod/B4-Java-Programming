package day28_arraylist;
import  java.util.*;

public class Classroom {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums .add(100);
        nums .add(200);
        nums .add(300);
        nums .add(400);
        System.out.println(nums);

        System.out.println(nums.size());

        System.out.println(nums.get(0));
        nums.get(nums.size()-1);

        nums.add(300);
        nums.add(300);
        System.out.println(nums);
        nums.remove(1);
        System.out.println(nums);
        nums.add(2,800);
        System.out.println(nums);
        //Integer n = 300; // alternate way of doing it  and put n as the value to remove
        nums.remove((Integer)300);
        System.out.println(nums);

    }
}
