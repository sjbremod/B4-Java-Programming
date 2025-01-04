package day36_inheritance.final_example;

public class Main {
    public static void main(String[] args) {
    Parent p = new Parent();
    p.walk();

    Child c = new Child();
    c.walk();



    }


}
class Parent {
    //instance method
    public final void walk(){
        System.out.println("walking from parent class");
    }
    public final void walk(int a){
        System.out.println("walking from parent class");
    }
// final method can't be overridden in CHILD class. we restrict all the child class to override this specific method
    // it is possible that, i want to force all my child class to use exact same implementation from parent
}
class Child extends Parent {
    //instance method
//    @Override
//    public void walk(){
//        System.out.println("walking from parent class");
//    }
}

class A {

}
class B extends A {

}

class C extends B {

}