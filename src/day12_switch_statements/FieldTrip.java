package day12_switch_statements;
/*
grade
teacher
location
num of groups
base on the grade make a decision where the location is going to be and what the number of groups will be and who the teacher will be.
 */
import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        int grade;
        String teacher;
        String location;
        int numOfGroups;

        Scanner key = new Scanner(System.in);
        System.out.println("what is the grade you want to get a field trip info: ");
        grade = key.nextInt();

        // grade from 1 to 6 ----> Mr. Nadir | apple orchard | 3
        // all of the other grades ---> Mr. Benjamin | Fire works  | 10
        if (grade >= 1 && grade <= 6){
//            teacher = "Mr. Nadir";
//            location = "Apple Ordchard";
//            numOfGroups = 3;
            if(grade ==1){
                teacher = "Ms. Jessica";
                location = "zoo";
                numOfGroups = 4;
            }else if (grade ==2 ){
                teacher = "Ms. case";
                location = "movie theater";
                numOfGroups = 5;

            }else if (grade ==3  ) {
                teacher = "MR. TOM";
                location = "museum";
                numOfGroups = 7;
            }else if (grade ==4  ) {
                teacher = "MR. jerry";
                location = "aquarium";
                numOfGroups = 9;
            }else if (grade ==5 ) {
                teacher = "Ms. winnie";
                location = "disneyland";
                numOfGroups = 2;
            }else{
                teacher = "Ms. pooh";
                location = "concert";
                numOfGroups = 3;
            }

        }else{
            teacher = "n/a";
            location = "n/a";
            numOfGroups = 0;
        }
        System.out.println("\nhere is the field trip info for the grade " + grade);
        System.out.println("\tteacher name: "+ teacher);
        System.out.println("\tlocation: " + location);
        System.out.println("\tnumber of groups: " +  numOfGroups);
    }
}
