package my_utilities;

import day33_b_encapsulation.access_modifiers.AccessModifiers;

public class AccessOutsidePackage {
    //diff package
    //dif class
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        System.out.println(obj.a);

        // look at notes
        //System.out.println(obj.b);

        System.out.println("---------------");
        // since it is in dif class and diff package we can only access the public static members
        System.out.println(AccessModifiers.a2);
        //System.out.println(AccessModifiers.b2);
       // System.out.println(AccessModifiers.c2);



    }
}
