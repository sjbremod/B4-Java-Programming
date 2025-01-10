package day38_abstraction_interface.interface_methods;

public interface Mac {
    // everything in interface is public
    // all the variables are public static final by default
    // all the methods without the body {} is public abstract
    // there is no Constructor at all including the default one
    //also cant have any blocks - static
    // possible to have 'default' and 'static' method

    //we can have total 4 things in interface

    //1 - public static final  variables / CONSTANTS
    String NAME = "Apple";
    String OS = "IoS";

    //2 public abstract methods
    void turnOn();

    //3 - public static methoid
    static void company(){
        System.out.println("company name: " +NAME);
        System.out.println("operating system: " +OS);

    }

    // 4 default method // default is not the access modifier in interface
    default void faceTime(){
        System.out.println("calling with facetime");
    }

}
