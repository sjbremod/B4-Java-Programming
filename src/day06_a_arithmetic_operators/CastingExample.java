package day06_a_arithmetic_operators;

public class CastingExample {
    public static void main(String[] args) {
        // order byte short int long float double
        // implicit casting happens automatically
        //explicit you need to do it manual

        int num1 = 10;
        float num2 = num1; // going from small to big ( assigning small into big)  happens automatically
        System.out.println(num1);
        System.out.println(num2);
        System.out.println();

        float num3 = 3.4F;
        short num4 = (short)num3; // going from big to small so we need to cast  EXPLICITLY
        //short num5 = (int)num3;  // going from float to int int is bigger thant short
        short num6 = (byte)num3;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num6);
        System.out.println();

        // we can conver the char into int b/c if the ascii table value
        char letter = 'A';
        int letterInNum = letter;  //going from smaller to big  no need to explic cast
        System.out.println(letter);
        System.out.println(letterInNum);

        String letter2 = "B";
        // int letterInNum2 = letter; // not valid

        System.out.println('C');
        System.out.println((int)'C'); // you will see the number value this time


    }


}
