package day28_arraylist;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {


        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        System.out.println(nums);

            // .set (index, newValue); // this method updated the value at the give index
        nums.set(1,900);
        System.out.println(nums);
       // nums.set(5,800);
        //System.out.println(nums);// out of bounds because no index 5

        nums.set(nums.size()-1, 1000); //dynamically getting the last elements index and replacing is with 1000

        System.out.println(nums);
        System.out.println();

        ArrayList <String> strList = new ArrayList<>();
        strList.add("jave");
        strList.add("api");
        strList.add("db");
        strList.add("ci/cd");
        strList.add("soft-skills");
        System.out.println(strList);
        strList.set(2, "data base");
        System.out.println(strList);




    }
}
