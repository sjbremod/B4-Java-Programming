package day26_methods;

public class TypePromotion {

    public static void main(String[] args) {

        // whole number default is INT
        // dec num is default Double

        //use(10);
        use((byte)10);

        byte b = 10;
        use(b);
        use(10);
        System.out.println("----------");

        use(10.0);




/*
         byte, short, int, long, float, double
        NOTE: when you call the method, it starts looking for the matching data type parameter
 */




    }

    public static void use (byte b){
        System.out.println("calling byte method");

    }
    public static void use (float f){
        System.out.println("calling float methoo ");
    }
    public static void use (short s ){
        System.out.println("calling short method");
    }

    public static void use (int i){
        System.out.println("calling int method");
    }
    public static void use (long l ){
        System.out.println("calling long method");
    }

    public static void use (double d ){
        System.out.println("calling double d");
    }
}
