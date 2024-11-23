package day15_String;

public class SubStringMethod {
    public static void main(String[] args) {
        String word = "Saturday";

        System.out.println(  word.substring(0)); // give me the portion starting from index 0 to the end saturday
        System.out.println(  word.substring(3)); // give me the portion starting from index 0 to the end urday
        System.out.println("Sat" + word.substring(3)); // "sat + "urday" ---> Saturday
        System.out.println();
        System.out.println(word.substring(0,3));
        System.out.println();
        System.out.println(word.substring(5,8)); // 8 is not inclusive - stops before 8
        System.out.println(word.substring(5,9)); // string index out of boundsexception bc its looking to print index 8 which doesnt exist


    }
}
