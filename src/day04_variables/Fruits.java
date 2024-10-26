package day04_variables;

public class Fruits {
    public static void main(String[] args) {

// have 3 container and each container will have " x number" of apples, grapes, and bananas

        int apples = 70;
        int grapes = 80;
        int bananas = 100;

        // println statement
        // "" ---- Sting
        // + ------ concatenation / plus math
        // 60 ----- value which is an int by default
        System.out.println("This is how many apples i have: " + 60); // the value 60 ---- hardcoded not from variable

        System.out.println("This is how many apples i have: " + apples); // the apples is a variable  DYNAMICALLY

        System.out.println(grapes);//sout
        System.out.println("Grapes: = " + grapes);//soutv

        System.out.println("Bananas = " + bananas);

        // reassigment
        // i sold 30 apples
        System.out.println("--------------");
        System.out.println("I sold 30 apples");
        apples = 40;
        System.out.println("This is how many apples i have: " + apples);

        System.out.println("--------------");

        double price = 16.99;
        //"" ---- String
        // + concatenation
        // "" string
        System.out.println("The disounted price for all the leftover apples is $" +"15.99"); // 15.99 is hardcoded
        System.out.println("The disounted price for all the leftover apples is $" +price); //  price is dynamic

        System.out.println("--------------");

        // concatenation vs plus(math)
        System.out.println(50+50); // plus math
        System.out.println("50" + 50); // concatenation
        System.out.println(10 + 10 + "10" + 10 + 10);
        // int + int + String + int + int
        //      int  + String +  int + int  --- 10 + "10" + 10 +10
        //              String + int +int   --- "2010" + 10 + 10
        //                  String + int   ----- "201010" + 10
        //                  string  --------------" "20101010"

        System.out.println("10" + 10 + "10" + 10 + 10);
// after first string ---- everything becomes string

        System.out.println(10 + " Apple" + 10 + " " + 10); //


    }


}
