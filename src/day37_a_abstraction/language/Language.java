package day37_a_abstraction.language;

public interface Language {
    // by default public static final
    String PLANET = "Earth";

    // by defautl these are 'public abstract'
    void sayHello();
    void sayGoodbye();

    //default method
    default void sayBye(){

    }

    //static method - since we have static variable it is possible to have static method using that variable
    static void sayHelloStatic(){}

}
