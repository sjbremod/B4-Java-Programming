package day05_variables;

public class TypeCasting {
    public static void main(String[] args) {
        byte b =40;
        int i = b;  // the byte value is converted automatically into int b/c byte is smaller than int

        int i2=100;
        //byte b2 = i2; // the int value can not automatically convert into byte
        byte bb2= 100;
        byte b2 = (byte)i2; // since we can not automatically convert int into byte we can use CASTING explicit
        System.out.println(i2);
        System.out.println(b2);
        System.out.println();
        int i3 = 150;
        byte b3 = (byte)i3; // byte range is -128 to 127 ---- then data loss is happening
        System.out.println(i3);
        System.out.println(b3);

        double d1 = 34.6;
        int i4 = (int)d1;
        System.out.println(d1); // after casting, it will keep the whole portion and loose decimal part narrowing conversion
        System.out.println(i4);

int i5 = 46;
double d5= i5; // conversion happens automatically widening conversion
        System.out.println(i5);
        System.out.println(d5);









    }
}

