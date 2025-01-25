package day24_methods;

public class MyFirstMethod {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        printHelloWorld(); // called a method named printHelloWorld()


        System.out.println("Bye");

        printHelloWorld50();



    }
    // it is public method
    //it is static method
    // it is void method
    // it is non- parameterized method
    public static void printHelloWorld(){
        System.out.println("Hello World!");
    }

    public static void printHelloWorld50(){

        for (int i = 0; i <50 ; i++) {
            System.out.println("Hello World!");
        }

    }

}
