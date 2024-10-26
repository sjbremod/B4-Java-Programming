package day05_variables;

public class RecapVariables {
    public static void main(String [] args) {
        //declare some variables [LOCAL VARIABLES]
        byte numOfTeaCups;
        double totalPrice;
        int numOfTotalStudents;

       // System.out.println(numOfTeaCups);
       //  System.out.println(totalPrice);
      //  System.out.println(numOfTotalStudents);

        // assigning / initializing the variables
        numOfTeaCups = 4;
        totalPrice = 20.0;
        numOfTotalStudents = 30;
        // since we have assigned the values now we can use those containers/ variables
         System.out.println(numOfTeaCups);
         System.out.println(totalPrice);
         System.out.println(numOfTotalStudents);

        System.out.println(numOfTeaCups * numOfTotalStudents); // 4 * 30 int * int --- 120
        System.out.println(numOfTeaCups + " * " + numOfTotalStudents); // int +string + int ---

        // declare and assign in one statement together

        double temperature = 67.7;
        int day = 4;
        System.out.println("Today is " + 4 + "the day of the week "); // hardcoded
        System.out.println("Today is " + day + "the day of the week "); // Dynamic code
        System.out.println();
        System.out.println("Today the temperature was " + temperature + " degree");

        System.out.println("test " +4 +5); // test 45
        System.out.println("test " + (4+5));  // test 9

        //  int i1,i2,i3; // same as doing it in three lines has to be the same datatype



    }
}
