package day04_variables;

public class School {
    public static void main(String[] args) {
        int numberOfStudentsInGrade1 = 20;
        int numberOfStudentsInGrade2 = 30 ;
        int numberOfStudentsInGrade3 =40;
        int numberOfStudentsInGrade4 = 50;
        int numberOfStudentsInGrade5 = 60;

        int totalStudentNumber = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5;

        //System.out.println(totalStudentNumber);

        double numOfDaysInAYear = 100.5;
        double numOfSnowDays = 12.5;
        double avgGpa = 2.6;
        System.out.println(" numberOfStudentsInGrade1: "+numberOfStudentsInGrade1);
        System.out.println(" numberOfStudentsInGrade2: "+numberOfStudentsInGrade2);
        System.out.println(" numberOfStudentsInGrade3: "+numberOfStudentsInGrade3);
        System.out.println(" numberOfStudentsInGrade4: "+numberOfStudentsInGrade4);
        System.out.println(" numberOfStudentsInGrade5: "+numberOfStudentsInGrade5);
        System.out.println();

        System.out.println("TOtal student number in out school: \t" +totalStudentNumber);
        System.out.println("Number of school days\t\t\t\t\t"+ numOfDaysInAYear);
        System.out.println("number of snow days: \t\t\t\t\t"+numOfSnowDays);
        System.out.println("avg gpa \t\t\t\t\t\t\t\t"+avgGpa);
    }
}
