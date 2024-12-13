package day26_methods;

public class Picture {

    // is a block of code that does some function/action

    // CUSTOM METHOD
   // method is ---> public --> available anywhere in whole project
    // method is static --> this method can be called by class name
    // method is ----> void --> in terms of what this method is returning , it is VOID method
    // -method is --> non-parameterized --> meaning nothing in parentheses, no parameters in ()


    public static void draw(){
        System.out.println("trying to draw");
    }

    //method name + () ---> METHOD SIGNATURE
    public static void draw(String color) {
        System.out.println("trying to draw with " + color + " color.");
        }
    public static void draw(String color1, String color2) {
        System.out.println("trying to draw with " + color1 + " and "+ color2 +  " colors.");
    }
    public static void draw(String color1, String color2,String color3) {
        System.out.println("trying to draw with " + color1 + " and "+ color2 +  " colors.");
        System.out.println("i also like "+color3 + "color.");
    }
    public static void draw(int num, String color) {
        System.out.println("trying to draw with " + num + " different tones of "+ color );

    }
    public static void draw(String color, int num) {
        System.out.println("trying to draw with " + num + " different tones of "+ color );

    }
    public static void draw(int num) {
        System.out.println("trying to draw with " + num + " brushes"  );

    }
    public static void draw(boolean isPainted) {
        System.out.println("is already painted " + isPainted  );

    }
    //same signature as the one above so it doenst work
    //return type doesnt matter for overloading
    //    public static String draw(boolean isPainted) {
    //        System.out.println("is already painted " + isPainted  );
    //return "";
    //    }
    public static String draw(double num) {
        System.out.println("is already painted and sold for $" + num  );
        return "";

    }


}
