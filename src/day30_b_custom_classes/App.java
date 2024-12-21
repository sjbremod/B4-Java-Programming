package day30_b_custom_classes;

// this is blueprint class -where i will have set of instructions for object
public class App {

    //Instance variables/fields   --- not method

    String name;
    double version;
    boolean isFree;

    // build some action/function for this class

    //Instance MEthod/ non static method
    // each object will run its own copy
    //since run () is instance we can not call by class name
    public void run(){
        System.out.println(name+ " is running...");

    }

    public void update(){

        System.out.println(name + " is updating...");
        version +=1;

    }




}
