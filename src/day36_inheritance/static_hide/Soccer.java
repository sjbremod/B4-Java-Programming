package day36_inheritance.static_hide;

public class Soccer extends Sports{
    // static method cant be overridden
    // the method from parent class gets hidden(hiding the one from parent class
    public static void play(){
        System.out.println("sports is playing from child class");
    }

}
