package day24_methods;

public class VoidVsReturn {
    public static void main(String[] args) {
     //   String str = sayHi();// since this method is a void method it doesnt not return any value
        sayHi();
        System.out.println();
        sayHi2();
        System.out.println(sayHi2());


    }
    //this is a void type method - which means it doesnt return anything
    public static void sayHi(){
        System.out.println("Hi");
    }
    // this is a return type method which means it returns something
    public static String sayHi2(){
        String str = "Hi"; // local variable
        return str;
    }
}
