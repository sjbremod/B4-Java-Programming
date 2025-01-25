package day39_a_polymorphism.poly_array;

import day35_inheritance.super_paranthesis.C;

import java.util.Arrays;

class A {
    @Override
    public String toString() {
        return "A";
    }
}

class B1 extends A {
    public String toString() {
        return "B1";
    }
}
class B2 extends A {
    public String toString() {
        return "B2";
    }
}

class C1 extends B1 {
    public String toString() {
        return "C1";
    }
}

class D {
    @Override
    public String toString() {
        return "D";
    }
}

public class PolymorphicArray {
    public static void main(String[] args) {

        String [] str = {"a", "b", "c"};
        String [] str2 = {new String("a"), new String("b"), new String("c")};
        int [] num = {1, 2, 3};
        Integer [] num2 = {1, 2, 3};

        D [] objArr1 = new D [4];// created an array of D to hold 4 elements size = 4
        objArr1[0] = new D(); // at the index of 0 --> hold this new D();
        objArr1[1] = new D(); // at the index of 1 --> holds another new d();
        System.out.println(Arrays.toString(objArr1));
       // objArr1[2] = new C(); // since there is no relation C object cant be stored in the array that holds D object

        A [] objArr2 = new A [4];
        objArr2[0] = new A();
        System.out.println(Arrays.toString(objArr2));
        objArr2[1] = new B1();
        objArr2[2] = new B2();
        objArr2[3] = new C1();
        System.out.println(Arrays.toString(objArr2));

        B1 [] objArr3 = new B1 [4];
        objArr3[0] = new B1();
        objArr3[1] = new C1();
       // objArr3[2] = new D(); // D has no relation with B1 so cant not store
        //objArr3[3] = new A(); // A is bigger Data type so cannot store in B1
        //objArr3[3] = (B1) new A(); // we cant cast the object only the ref side there will be  java.lang.ClassCastException

      System.out.println(Arrays.toString(objArr3));




    }
}
