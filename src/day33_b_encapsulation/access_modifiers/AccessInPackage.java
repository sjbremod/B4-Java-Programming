package day33_b_encapsulation.access_modifiers;

public class AccessInPackage {
    //same package
    //dif class

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        // since the member has default access modifier also can be reach in the diff class + same package
        System.out.println(obj.a);

        //look at notes
        System.out.println(obj.b);
// since the member has private access modifier  can not  be reach in the dif class
        //System.out.println(obj.c);

        System.out.println("---------------");
        // since it has same package private is not accessible
        System.out.println(AccessModifiers.a2);
        System.out.println(AccessModifiers.b2);
        //System.out.println(AccessModifiers.c2);


    }
}
