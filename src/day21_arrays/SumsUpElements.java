package day21_arrays;

import java.util.Arrays;

public class SumsUpElements {
    public static void main(String[] args) {
        int[] nums = {3, 6, 10};
        System.out.println("size of array: " +nums.length);
        System.out.println("each elements: " + nums[0] + ", " + nums[1]+ ", "+ nums[2]);
        System.out.println("all elements: "+ Arrays.toString(nums).substring(1,Arrays.toString(nums).length()-1));

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            sum += nums[i];
        }
        System.out.println("sum of all elements " +sum);
    }
}
