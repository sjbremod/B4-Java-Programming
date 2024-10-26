package day04_variables;

public class PrimitiveDataTypes {
    /*
        Data types:
            1)Primitive
                a)integer type
                    -byte
                    -short
                    -int
                    -long
                b) floating type
                    -float
                    -double
                c) single characters
                    -char
                d)true/false
                    -boolean
           2) non-primitive
                * sequence of chars    - string


     */
    public static void main(String[] args) {
        byte age = 34; // declared and assigned on the same line
        System.out.println("age"); //"age" is a not an variable name just a String
        System.out.println(age);// age is a variable here
        System.out.println(34);// 34 is a value but its just an int

       // byte b2 = 200 // wont work bc its too big for byte size
        System.out.println("-----------------");
        short year;             // declared a variable called year
        year = 2024;            // assigned 2024 to year

        System.out.println(year); // year is a variable here. data type is a short
        System.out.println(2024);// 2024 is by default a int

        System.out.println("-----------------");

        int ipNumber = 123456; // declared a variable called ipNumber and datatype is int
        System.out.println(ipNumber); // ipNumber is and int
        System.out.println(123456); //123456 is a value by default whole numbers int

        System.out.println("-----------------");

      long accNumber = 1234567812345678L; // declared a variable called accNumber and datatype is long and assigned a value directly with having "l"


        System.out.println(accNumber);
    }
}
