package day36_inheritance.acces_mod.a;
// same package but dif class
public class Second extends First {

    public static void main(String[] args) {

        First f = new First();
        System.out.println(f.one);
        System.out.println(f.two);
        System.out.println(f.three);
       // System.out.println(f.four);


        Second s = new Second();
        System.out.println(s.one);
        System.out.println(s.two);
        System.out.println(s.three);
        //System.out.println(f.four);




    }





}
