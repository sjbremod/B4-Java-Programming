package day03_comments_escape_sequence;

public class TabandNextline {
    public static void main(String[] args) {

        //this is explaining the spaces
        System.out.println("A sentence");
        System.out.println(" A sentence");
        System.out.println("  A sentence");
        System.out.println("   A sentence");
        System.out.println("    A sentence"); // 4 spaces
        System.out.println("\tA sentence"); // using tab sequence 4 spaces
        System.out.println("\t\tA sentence"); // using tab sequence 4 spaces times 2

        System.out.println();
        // this is explaining new line

        System.out.println("1) unlock the car door");
        System.out.println("2) get into the car");
        System.out.println("3) start the car");

        System.out.println();
        System.out.println("1) unlock the car door \n2) get into the car \n3) start the car");

        System.out.println();
        System.out.println("Week days: Monday Tuesday Wednesday thursday friday saturday sunday");
        /* make it
            monday
            tuesday
            *
            *

         */
        System.out.println();
        System.out.println("Week days:\n\tMonday\n\tTuesday\n\tWednesday\n\tthursday\n\tfriday\n\tsaturday\n\tsunday");
    }
}
