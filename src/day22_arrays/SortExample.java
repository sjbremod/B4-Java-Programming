package day22_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {23, 34, 2, 65, -56, 3};
        System.out.println("Before sorted: " + Arrays.toString(nums));

        int [] sortedNums = nums;// here I did not create a new array. I just pointed to the same array
        System.out.println("Before sorted: " + Arrays.toString(sortedNums));

        System.out.println("---------------");
        Arrays.sort(nums); //sorted the nums from smallest to biggest

        System.out.println("after sorted: " + Arrays.toString(nums));
        System.out.println("after sorted: " + Arrays.toString(sortedNums));

        System.out.println("min " + nums[0]);
        System.out.println("max " + nums[nums.length-1]);
        System.out.println("----------");
        int[] nums2 = new int [nums.length];// here i created a brand new array with copying the size of nums array
        System.out.println(Arrays.toString(nums2));

        for (int i = 0; i <nums2.length ; i++) {
            nums2[i] = nums [i];

        }
        System.out.println(Arrays.toString(nums2));
    }
}
