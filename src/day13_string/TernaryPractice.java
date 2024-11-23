package day13_string;

public class TernaryPractice {
    public static void main(String[] args) {
        // if the number is less than 10 and bigger than or equal -9 then print "number is single digit" else print number is multi digit

        int num =-8;
        if(num<10 && num>= -9){
            System.out.println("number is single digit");
        }else{
            System.out.println("number is multi digit");
        }
        System.out.println("===================");
        // option two with ternary

        System.out.println((num<10 && num>= -9)? "number is single digit" : "number is multi digit");

        System.out.println(num % 2 == 0 ? (num < 10 && num >= -9) ? "Number is single digit" : "Number is multi digit" : "TEST" );

        // ALWAYS try to find the CORRECT syntax if you have multiple ternary used together.
        // condition ? trueValue : falseValue
        // first it ran (num < 10 && num >= -9) ? "Number is single digit" : "Number is multi digit" -- then the out come goes to the next condition
        // num % 2 == 0 ? "Number is single digit" : "TEST" ===== test

    }
}
