package day36_inheritance.app;

public class App {
    //instance variables --. based on the access modifier, they inherit to the child class if there is inheritance

    String name;
    double version;

//constructor
    public App(String name, double version) {
        this.name = name;
        this.version = version;


    }
    public void download(){
        System.out.println(name+ " is downloading version "+ version);
    }


}
