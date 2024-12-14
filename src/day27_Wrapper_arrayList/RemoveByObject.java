package day27_Wrapper_arrayList;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(1);
        nums.add(30);
        nums.add(6);
        nums.add(20);
        nums.add(3);
        nums.add(-10);
        nums.add(0);
        System.out.println(nums);
        System.out.println(nums.size());


        /*
            .remove() method
                .remove(index)
                .remove(Object)
         */

        /*
                which element do you want to use?
                "I want to remove element: 3"

         */
        String userAnswer = "I want to remove element: 3";
       String numFromUserAnswer = userAnswer.substring(userAnswer.lastIndexOf(" ")+1);
        System.out.println(numFromUserAnswer);
        int i1= Integer.parseInt(numFromUserAnswer);
        Integer i2= Integer.valueOf(numFromUserAnswer);

        nums.remove(3); // removed it by int which is Index
        System.out.println(nums);
        nums.remove((Integer)3); // removed it by Integer which is Object
        System.out.println(nums);

        nums.remove(i1); // since i1 is int it will remove the index
        nums.remove(i2); // since i2 is Integer it will remove by object
        System.out.println(nums);

        nums.remove(Integer.valueOf("4"));
        System.out.println(nums);
        nums.remove(Integer.parseInt("4"));
        System.out.println(nums);





    }
}
