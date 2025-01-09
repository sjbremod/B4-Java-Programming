package day37_a_abstraction.language;

public class Translator {
    public static void main(String[] args) {

        Spanish s = new Spanish();
        s.sayHello();
        s.sayGoodbye();


        System.out.println();
        Turkish t = new Turkish();
        t.sayHello();
        t.sayGoodbye();

        System.out.println(Turkish.PLANET);



    }
}
