package day23_multidimensional_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

       // int [] n = new int[4];

        String [][] groups1 = new String[4][]; // this 2d array will hold 4 single dim arrays
        //{ {},{},{},{}  }

        String [][] groups2 = new String[4][3]; // this 2d array will hold 4 single dim arrays each one with 3 elements
//{ {},{},{}, {},{},{},{},{},{},{},{},{} }
        System.out.println(Arrays.deepToString(groups1));
        System.out.println(Arrays.deepToString(groups2));

        System.out.println("----------------");
        String[] group1 = { "Artem","Diana","Yuliia", "Roma"};
        String [] group2 = {"pavlo", "steven", "ketevan"};

        String [][] mentorGroups = {group1, group2};

        System.out.println(Arrays.deepToString(mentorGroups));
        System.out.println(Arrays.toString(mentorGroups[0]));
        System.out.println(Arrays.toString(mentorGroups[1]));

        System.out.println("for each----------------");
        // i want to loop through 2d array and print single dimensional arrays

        for( String [] each : mentorGroups){ // this will loop through 2d array and get each single dimensional array on each cycle
           // System.out.println(Arrays.toString(each));
            for(String eachname: each){ // this will loop through each single dim array and get each element on each cycle
                System.out.println(eachname);
            }

        }


    }
}
