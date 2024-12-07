package day24_methods;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        //String name =  "Tom";
        //System.out.println("Hello "+name+ "! how are you?");
        sayHello();
        sayHello2("jim");
        String name = "micky";
        sayHello2(name);
        String str = "james";
        sayHello2(str);

        Scanner key = new Scanner(System.in);
        System.out.println("what is your name: ");
        String userName= key.nextLine();
        sayHello2(userName);
    }

    public static void sayHello () {
        String name = "Tom";
        System.out.println("Hello " + name + "! how are you?");
    }
    // with parameterized
    public static void sayHello2 (String name){
        //String name =  "Tom";
        name = name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase();
        System.out.println("Hello "+name+ "! how are you?");
    }
}
