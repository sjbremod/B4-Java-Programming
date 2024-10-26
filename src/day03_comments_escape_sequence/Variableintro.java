package day03_comments_escape_sequence;

public class Variableintro {
    public static void main(String[] args) {

        // option 1
        int num1; // declared variable called num1 and int data type (for declaratioin you need data type)
        num1 =6; // assigned value/data into variable
        System.out.println(4);
        System.out.println(num1);
    num1=10; // re-assignment
        System.out.println(num1);

        // num2 = 50; //you can not declare only variable name without datatype

        // option2

        int num2 = 33; // declared variable and assigned it too
        System.out.println(num2);
        System.out.println(20);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        System.out.println(num2);
        num2 = 40;
        System.out.println(num2);
        System.out.println(90);

        System.out.println(4); // by default this is int
        byte n1 = 4;
        short n2 = 4;
        int n3 = 4;
        long n4 = 4;
        long n5 = 8000000000L;

        //----------------------------------------------
        System.out.println("----------------------------------------------");
        System.out.println(4.5); // by default it is double
        float d1 = 3.6f; // no one uses this anymore
        double d2 = 3.6; // standard for decimal numbers
        System.out.println(d1);
        System.out.println(d2);

        System.out.println("----------------------------------------------");

        char letter1;
        letter1 = 'a'; // needs to be in single quotes for character literals
        // in a single quote you can not use more than one character
        System.out.println(letter1);
        String letter2 = "aa";

        System.out.println("----------------------------------------------");
        boolean varName = true;
        System.out.println(varName);
        varName = false;
        System.out.println(varName);

        //varName = correct; // it only can hold either true or false

        System.out.println("----------------------------------------------");

        //sameple strings
        String word = "Apple"; // here i declared string variable and assigned "apple" value to it
        System.out.println(word);
        System.out.println("Apple"); // here i printed out a string value directly
        System.out.println("----------------------------------------------");

        int totalPrice;
        int apple = 5;
        int bread = 2;
        totalPrice = apple + bread;
        System.out.println(totalPrice);



    }
}
