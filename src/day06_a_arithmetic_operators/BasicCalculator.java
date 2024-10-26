package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {
        double num1 = 3; // the 3 value is in   since we are assigning int into double  the implicit casting happens automatically
        double num2 = 2; //
        double addition = num1 + num2; // 3.0 + 2.0 --- 5.0
        //int subtraction = num1 - num2;  // 3.0-2.0 ----- 1.0 double
        int subtraction = (int)num1 - (int)num2;  // 3-2-----1(int)

        double sub = num1 - num2;
        double multiplication = num1 * num2;
        double div = num1 / num2; // since its a double you can see the decimal
        double remainder = num1 % num2; // modules



        System.out.println(num1 + " + " +num2 + "=" + addition);
        System.out.println(num1 + " - " +num2 + "=" + sub);
        System.out.println(num1 + " * " +num2 + "=" + multiplication);
        System.out.println(num1 + " / " +num2 + "=" + div);
        System.out.println(num1 + " % " +num2 + "=" + remainder);

num1 = 13;
num2 = 5;
remainder = num1%num2;
        System.out.println(num1 + " % " +num2 + "=" + remainder);


        int i1 =13;
        int i2 = 5;
        int div1 = i1/i2;
        double div2 = i1/i2;
        System.out.println(div1);
        System.out.println(div2);

        // module/ remainder
int rem = i1 % i2;
double rem2 = i1%i2;
        System.out.println(rem);
        System.out.println(rem2);
        System.out.println();
        System.out.println(3.4 + 1);

        int a = 5;// 5
        double d = 4; // 4.0
        System.out.println(a+d);

        byte b = 3;
        short s = 2;
        System.out.println(b*s); //  when byte and short result is always the defaulted INT

byte b1 = 4;
short s2 = 5;
     //   short result = b1 * s2;// 20 int so it doesnt work without casting
short result = (short)(b1 * s2);// 20 int ---

        System.out.println("-----------");

        double result2 = b1 +s2; // byte = short ---- int --- storing it into double so its ok widening or implicit
        byte b6= 5;
        byte b7 = 4;
        // byte b3 = b1 * b2; // this a reaction results in int so it doesnt work


    }
}
