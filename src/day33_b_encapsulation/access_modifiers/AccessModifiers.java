package day33_b_encapsulation.access_modifiers;

public class AccessModifiers {
    // 3 instance variables
    public int a; // public access modifier
    int b; // default access modifier
    private int c; // private access modifier
    //protected int d: // protected access modifier well talk later

    //static variables
    public static int a2;
    static int b2;
    private static int c2;


    // same package
    // same class
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        //since the memeber has public - can be reached in the same class + same package
        System.out.println(obj.a);
        // since the member has default access modifier also can be reach in the same class + same package
        System.out.println(obj.b);
// since the member has private access modifier also can be reach in the same class + same package
        System.out.println(obj.c);// private


        System.out.println("---------------");
        // since it is in the same class + same package, we access  - public , defualt, private members as well
        System.out.println(AccessModifiers.a2);
        System.out.println(AccessModifiers.b2);
        System.out.println(AccessModifiers.c2);



    }

}
