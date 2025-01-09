package day37_a_abstraction.book;

//interface is another way of achieving ABSTRACTION
public interface Create {

    // variable -> by default it is public static final - CONSTANT has to be initialized
    //public static final String name = "Java";
    String NAME = "Java";

    // methods with return type and name and () -> by default it is 'public abstract'
    //public abstract void read();
    void read();

    void write();




}
