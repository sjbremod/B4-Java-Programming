package day32_custom_classes;

public class ChainExample {

    //1st constructor
    public ChainExample (){
        System.out.println("first");
    }
    //2nd
    public ChainExample (int i){
        this();
        System.out.println("second");
    }
    //third
    public ChainExample (String str){
        this(4);
        System.out.println("third");
    }


}
/*
rules for chaining
    1) this() should always be first line
    2) only one constructor can be called in the same constructor
    3) constructor should not call itself
    4) constructor should not contain itself in the chaining with multiple constructors
    5) constructor that is called can not call the one which called it


 */